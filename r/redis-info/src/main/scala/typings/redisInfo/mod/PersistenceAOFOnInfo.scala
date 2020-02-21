package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceAOFOnInfo extends js.Object {
  var aof_base_size: String
  var aof_buffer_length: String
  var aof_current_size: String
  var aof_delayed_fsync: String
  var aof_enabled: ON
  var aof_pending_bio_fsync: String
  var aof_pending_rewrite: Flag
  var aof_rewrite_buffer_length: String
}

object PersistenceAOFOnInfo {
  @scala.inline
  def apply(
    aof_base_size: String,
    aof_buffer_length: String,
    aof_current_size: String,
    aof_delayed_fsync: String,
    aof_enabled: ON,
    aof_pending_bio_fsync: String,
    aof_pending_rewrite: Flag,
    aof_rewrite_buffer_length: String
  ): PersistenceAOFOnInfo = {
    val __obj = js.Dynamic.literal(aof_base_size = aof_base_size.asInstanceOf[js.Any], aof_buffer_length = aof_buffer_length.asInstanceOf[js.Any], aof_current_size = aof_current_size.asInstanceOf[js.Any], aof_delayed_fsync = aof_delayed_fsync.asInstanceOf[js.Any], aof_enabled = aof_enabled.asInstanceOf[js.Any], aof_pending_bio_fsync = aof_pending_bio_fsync.asInstanceOf[js.Any], aof_pending_rewrite = aof_pending_rewrite.asInstanceOf[js.Any], aof_rewrite_buffer_length = aof_rewrite_buffer_length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistenceAOFOnInfo]
  }
}

