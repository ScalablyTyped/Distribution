package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpReceiptAddDataResponse extends js.Object {
  /** TpReceiptAddDataResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object ITpReceiptAddDataResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): ITpReceiptAddDataResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpReceiptAddDataResponse]
  }
}

