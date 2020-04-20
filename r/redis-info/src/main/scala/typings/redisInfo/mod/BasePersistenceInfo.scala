package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePersistenceInfo extends js.Object {
  var aof_current_rewrite_time_sec: String
  var aof_last_bgrewrite_status: String
  var aof_last_cow_size: String
  var aof_last_rewrite_time_sec: String
  var aof_last_write_status: String
  var aof_rewrite_in_progress: Flag
  var aof_rewrite_scheduled: Flag
  var rdb_bgsave_in_progress: Flag
  var rdb_changes_since_last_save: String
  var rdb_current_bgsave_time_sec: String
  var rdb_last_bgsave_status: String
  var rdb_last_bgsave_time_sec: String
  var rdb_last_cow_size: String
  var rdb_last_save_time: String
}

object BasePersistenceInfo {
  @scala.inline
  def apply(
    aof_current_rewrite_time_sec: String,
    aof_last_bgrewrite_status: String,
    aof_last_cow_size: String,
    aof_last_rewrite_time_sec: String,
    aof_last_write_status: String,
    aof_rewrite_in_progress: Flag,
    aof_rewrite_scheduled: Flag,
    rdb_bgsave_in_progress: Flag,
    rdb_changes_since_last_save: String,
    rdb_current_bgsave_time_sec: String,
    rdb_last_bgsave_status: String,
    rdb_last_bgsave_time_sec: String,
    rdb_last_cow_size: String,
    rdb_last_save_time: String
  ): BasePersistenceInfo = {
    val __obj = js.Dynamic.literal(aof_current_rewrite_time_sec = aof_current_rewrite_time_sec.asInstanceOf[js.Any], aof_last_bgrewrite_status = aof_last_bgrewrite_status.asInstanceOf[js.Any], aof_last_cow_size = aof_last_cow_size.asInstanceOf[js.Any], aof_last_rewrite_time_sec = aof_last_rewrite_time_sec.asInstanceOf[js.Any], aof_last_write_status = aof_last_write_status.asInstanceOf[js.Any], aof_rewrite_in_progress = aof_rewrite_in_progress.asInstanceOf[js.Any], aof_rewrite_scheduled = aof_rewrite_scheduled.asInstanceOf[js.Any], rdb_bgsave_in_progress = rdb_bgsave_in_progress.asInstanceOf[js.Any], rdb_changes_since_last_save = rdb_changes_since_last_save.asInstanceOf[js.Any], rdb_current_bgsave_time_sec = rdb_current_bgsave_time_sec.asInstanceOf[js.Any], rdb_last_bgsave_status = rdb_last_bgsave_status.asInstanceOf[js.Any], rdb_last_bgsave_time_sec = rdb_last_bgsave_time_sec.asInstanceOf[js.Any], rdb_last_cow_size = rdb_last_cow_size.asInstanceOf[js.Any], rdb_last_save_time = rdb_last_save_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePersistenceInfo]
  }
}

