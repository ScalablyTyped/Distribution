package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpProcessRequest extends js.Object {
  /** TpProcessRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  /** TpProcessRequest header */
  var header: js.UndefOr[ITransactionHeader | Null] = js.undefined
  /** TpProcessRequest payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.undefined
  /** TpProcessRequest signature */
  var signature: js.UndefOr[String | Null] = js.undefined
}

object ITpProcessRequest {
  @scala.inline
  def apply(
    contextId: js.UndefOr[Null | String] = js.undefined,
    header: js.UndefOr[Null | ITransactionHeader] = js.undefined,
    payload: js.UndefOr[Null | Uint8Array] = js.undefined,
    signature: js.UndefOr[Null | String] = js.undefined
  ): ITpProcessRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextId)) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpProcessRequest]
  }
}

