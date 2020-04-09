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
    headId: String = null,
    paging: IClientPagingResponse = null,
    status: Status = null,
    transactions: js.Array[ITransaction] = null
  ): IClientTransactionListResponse = {
    val __obj = js.Dynamic.literal()
    if (headId != null) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transactions != null) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionListResponse]
  }
}

