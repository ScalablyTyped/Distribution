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
  def apply(
    receipts: js.UndefOr[Null | js.Array[ITransactionReceipt]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientReceiptGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(receipts)) __obj.updateDynamic("receipts")(receipts.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientReceiptGetResponse]
  }
}

