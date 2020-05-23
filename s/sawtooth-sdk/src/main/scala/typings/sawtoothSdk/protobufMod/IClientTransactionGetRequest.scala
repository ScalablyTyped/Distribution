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
  def apply(transactionId: js.UndefOr[Null | String] = js.undefined): IClientTransactionGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transactionId)) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionGetRequest]
  }
}

