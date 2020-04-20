package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationReplicaSyncOnInfo extends js.Object {
  var master_sync_in_progress: ON
  var master_sync_last_io_seconds_ago: String
  var master_sync_left_bytes: String
}

object ReplicationReplicaSyncOnInfo {
  @scala.inline
  def apply(
    master_sync_in_progress: ON,
    master_sync_last_io_seconds_ago: String,
    master_sync_left_bytes: String
  ): ReplicationReplicaSyncOnInfo = {
    val __obj = js.Dynamic.literal(master_sync_in_progress = master_sync_in_progress.asInstanceOf[js.Any], master_sync_last_io_seconds_ago = master_sync_last_io_seconds_ago.asInstanceOf[js.Any], master_sync_left_bytes = master_sync_left_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaSyncOnInfo]
  }
}

