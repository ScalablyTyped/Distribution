package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.UP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationReplicaLinkUpInfo extends js.Object {
  var master_link_status: UP = js.native
}

object ReplicationReplicaLinkUpInfo {
  @scala.inline
  def apply(master_link_status: UP): ReplicationReplicaLinkUpInfo = {
    val __obj = js.Dynamic.literal(master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkUpInfo]
  }
  @scala.inline
  implicit class ReplicationReplicaLinkUpInfoOps[Self <: ReplicationReplicaLinkUpInfo] (val x: Self) extends AnyVal {
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
    def setMaster_link_status(value: UP): Self = this.set("master_link_status", value.asInstanceOf[js.Any])
  }
  
}

