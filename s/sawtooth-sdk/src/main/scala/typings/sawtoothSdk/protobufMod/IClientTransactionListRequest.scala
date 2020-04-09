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
    headId: String = null,
    paging: IClientPagingControls = null,
    sorting: js.Array[IClientSortControls] = null,
    transactionIds: js.Array[String] = null
  ): IClientTransactionListRequest = {
    val __obj = js.Dynamic.literal()
    if (headId != null) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (transactionIds != null) __obj.updateDynamic("transactionIds")(transactionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientTransactionListRequest]
  }
}

