package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusNotifyPeerConnected extends js.Object {
  /** ConsensusNotifyPeerConnected peerInfo */
  var peerInfo: js.UndefOr[IConsensusPeerInfo | Null] = js.native
}

object IConsensusNotifyPeerConnected {
  @scala.inline
  def apply(): IConsensusNotifyPeerConnected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyPeerConnected]
  }
  @scala.inline
  implicit class IConsensusNotifyPeerConnectedOps[Self <: IConsensusNotifyPeerConnected] (val x: Self) extends AnyVal {
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
    def setPeerInfo(value: IConsensusPeerInfo): Self = this.set("peerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerInfo: Self = this.set("peerInfo", js.undefined)
    @scala.inline
    def setPeerInfoNull: Self = this.set("peerInfo", null)
  }
  
}

