package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationReplicaSyncOnInfo extends js.Object {
  var master_sync_in_progress: ON = js.native
  var master_sync_last_io_seconds_ago: String = js.native
  var master_sync_left_bytes: String = js.native
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
  @scala.inline
  implicit class ReplicationReplicaSyncOnInfoOps[Self <: ReplicationReplicaSyncOnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaster_sync_in_progress(value: ON): Self = this.set("master_sync_in_progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster_sync_last_io_seconds_ago(value: String): Self = this.set("master_sync_last_io_seconds_ago", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaster_sync_left_bytes(value: String): Self = this.set("master_sync_left_bytes", value.asInstanceOf[js.Any])
  }
  
}

