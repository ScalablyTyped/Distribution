package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusSendToRequest extends js.Object {
  /** ConsensusSendToRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.undefined
  /** ConsensusSendToRequest peerId */
  var peerId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusSendToRequest {
  @scala.inline
  def apply(
    message: js.UndefOr[Null | IConsensusPeerMessage] = js.undefined,
    peerId: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IConsensusSendToRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(peerId)) __obj.updateDynamic("peerId")(peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSendToRequest]
  }
}

