package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientTransactionListRequest extends js.Object {
  /** ClientTransactionListRequest headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  /** ClientTransactionListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  /** ClientTransactionListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
  /** ClientTransactionListRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IClientTransactionListRequest {
  @scala.inline
  def apply(
    headId: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingControls] = js.undefined,
    sorting: js.UndefOr[Null | js.Array[IClientSortControls]] = js.undefined,
    transactionIds: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): IClientTransactionListRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(headId)) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionIds)) __obj.updateDynamic("transactionIds")(transactionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionListRequest]
  }
}

