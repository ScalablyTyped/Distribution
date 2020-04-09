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
  def apply(status: Status = null, transaction: ITransaction = null): IClientTransactionGetResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionGetResponse]
  }
}

