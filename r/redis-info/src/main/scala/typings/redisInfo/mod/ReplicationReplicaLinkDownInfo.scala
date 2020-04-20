package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.DOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationReplicaLinkDownInfo extends js.Object {
  var master_link_down_since_seconds: String
  var master_link_status: DOWN
}

object ReplicationReplicaLinkDownInfo {
  @scala.inline
  def apply(master_link_down_since_seconds: String, master_link_status: DOWN): ReplicationReplicaLinkDownInfo = {
    val __obj = js.Dynamic.literal(master_link_down_since_seconds = master_link_down_since_seconds.asInstanceOf[js.Any], master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkDownInfo]
  }
}

