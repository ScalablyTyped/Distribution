package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientTransactionGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientTransactionGetResponse extends js.Object {
  /** ClientTransactionGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  /** ClientTransactionGetResponse transaction */
  var transaction: js.UndefOr[ITransaction | Null] = js.undefined
}

object IClientTransactionGetResponse {
  @scala.inline
  def apply(
    status: js.UndefOr[Null | Status] = js.undefined,
    transaction: js.UndefOr[Null | ITransaction] = js.undefined
  ): IClientTransactionGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(transaction)) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionGetResponse]
  }
}

