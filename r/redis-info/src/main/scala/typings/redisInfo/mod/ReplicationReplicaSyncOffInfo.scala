package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationReplicaSyncOffInfo extends js.Object {
  var master_sync_in_progress: OFF
}

object ReplicationReplicaSyncOffInfo {
  @scala.inline
  def apply(master_sync_in_progress: OFF): ReplicationReplicaSyncOffInfo = {
    val __obj = js.Dynamic.literal(master_sync_in_progress = master_sync_in_progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaSyncOffInfo]
  }
}

