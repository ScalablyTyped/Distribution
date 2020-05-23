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
  def apply(message: js.UndefOr[Null | IConsensusPeerMessage] = js.undefined): IConsensusBroadcastRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBroadcastRequest]
  }
}

