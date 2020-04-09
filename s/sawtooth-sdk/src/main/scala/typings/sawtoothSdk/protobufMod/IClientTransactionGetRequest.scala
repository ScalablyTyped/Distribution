package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientTransactionGetRequest extends js.Object {
  /** ClientTransactionGetRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}

object IClientTransactionGetRequest {
  @scala.inline
  def apply(transactionId: String = null): IClientTransactionGetRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionGetRequest]
  }
}

