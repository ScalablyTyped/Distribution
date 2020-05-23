package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientReceiptGetRequest extends js.Object {
  /** ClientReceiptGetRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IClientReceiptGetRequest {
  @scala.inline
  def apply(transactionIds: js.UndefOr[Null | js.Array[String]] = js.undefined): IClientReceiptGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transactionIds)) __obj.updateDynamic("transactionIds")(transactionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientReceiptGetRequest]
  }
}

