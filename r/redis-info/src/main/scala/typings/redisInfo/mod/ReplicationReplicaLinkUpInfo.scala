package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.UP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationReplicaLinkUpInfo extends js.Object {
  var master_link_status: UP
}

object ReplicationReplicaLinkUpInfo {
  @scala.inline
  def apply(master_link_status: UP): ReplicationReplicaLinkUpInfo = {
    val __obj = js.Dynamic.literal(master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkUpInfo]
  }
}

