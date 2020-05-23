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
  def apply(peerInfo: js.UndefOr[Null | IConsensusPeerInfo] = js.undefined): IConsensusNotifyPeerConnected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(peerInfo)) __obj.updateDynamic("peerInfo")(peerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyPeerConnected]
  }
}

