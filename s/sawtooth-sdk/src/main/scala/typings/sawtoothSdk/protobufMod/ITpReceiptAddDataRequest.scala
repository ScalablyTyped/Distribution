package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpReceiptAddDataRequest extends js.Object {
  /** TpReceiptAddDataRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  /** TpReceiptAddDataRequest data */
  var data: js.UndefOr[Uint8Array | Null] = js.undefined
}

object ITpReceiptAddDataRequest {
  @scala.inline
  def apply(
    contextId: js.UndefOr[Null | String] = js.undefined,
    data: js.UndefOr[Null | Uint8Array] = js.undefined
  ): ITpReceiptAddDataRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextId)) __obj.updateDynamic("contextId")(contextId.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpReceiptAddDataRequest]
  }
}

