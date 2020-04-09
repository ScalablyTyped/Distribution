package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusBroadcastRequest extends js.Object {
  /** ConsensusBroadcastRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
}

object IConsensusBroadcastRequest {
  @scala.inline
  def apply(message: IConsensusPeerMessage = null): IConsensusBroadcastRequest = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBroadcastRequest]
  }
}

