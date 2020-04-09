package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyPeerConnected extends js.Object {
  /** ConsensusNotifyPeerConnected peerInfo */
  var peerInfo: js.UndefOr[IConsensusPeerInfo | Null] = js.undefined
}

object IConsensusNotifyPeerConnected {
  @scala.inline
  def apply(peerInfo: IConsensusPeerInfo = null): IConsensusNotifyPeerConnected = {
    val __obj = js.Dynamic.literal()
    if (peerInfo != null) __obj.updateDynamic("peerInfo")(peerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyPeerConnected]
  }
}

