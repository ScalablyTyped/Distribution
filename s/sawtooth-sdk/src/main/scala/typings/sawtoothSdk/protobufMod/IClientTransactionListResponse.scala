package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientTransactionListResponse extends js.Object {
  /** ClientTransactionListResponse headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  /** ClientTransactionListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  /** ClientTransactionListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  /** ClientTransactionListResponse transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.undefined
}

object IClientTransactionListResponse {
  @scala.inline
  def apply(
    headId: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingResponse] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined,
    transactions: js.UndefOr[Null | js.Array[ITransaction]] = js.undefined
  ): IClientTransactionListResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headId)) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(transactions)) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionListResponse]
  }
}

