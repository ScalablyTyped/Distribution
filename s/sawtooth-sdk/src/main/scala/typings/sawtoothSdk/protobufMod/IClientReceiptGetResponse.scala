package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientReceiptGetResponse extends js.Object {
  /** ClientReceiptGetResponse receipts */
  var receipts: js.UndefOr[js.Array[ITransactionReceipt] | Null] = js.undefined
  /** ClientReceiptGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientReceiptGetResponse {
  @scala.inline
  def apply(receipts: js.Array[ITransactionReceipt] = null, status: Status = null): IClientReceiptGetResponse = {
    val __obj = js.Dynamic.literal()
    if (receipts != null) __obj.updateDynamic("receipts")(receipts.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientReceiptGetResponse]
  }
}

