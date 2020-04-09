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
    contextId: String = null,
    header: ITransactionHeader = null,
    payload: Uint8Array = null,
    signature: String = null
  ): ITpProcessRequest = {
    val __obj = js.Dynamic.literal()
    if (contextId != null) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpProcessRequest]
  }
}

