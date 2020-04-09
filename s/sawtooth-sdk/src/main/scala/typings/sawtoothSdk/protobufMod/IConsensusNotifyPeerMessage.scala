package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyPeerMessage extends js.Object {
  /** ConsensusNotifyPeerMessage message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
  /** ConsensusNotifyPeerMessage senderId */
  var senderId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusNotifyPeerMessage {
  @scala.inline
  def apply(message: IConsensusPeerMessage = null, senderId: Uint8Array = null): IConsensusNotifyPeerMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (senderId != null) __obj.updateDynamic("senderId")(senderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyPeerMessage]
  }
}

