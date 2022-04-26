package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    /**
     * 分页查询帖子
     *
     * @param userId，用户登录之后查看我的帖子
     * @param offset，分页起始行的行号
     * @param limit，每一页显示多少行数据
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 查询有多少行数据
    int selectDiscussPostRows(@Param("userId") int userId);

}
