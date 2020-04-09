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
  def apply(transactionIds: js.Array[String] = null): IClientReceiptGetRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionIds != null) __obj.updateDynamic("transactionIds")(transactionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientReceiptGetRequest]
  }
}

