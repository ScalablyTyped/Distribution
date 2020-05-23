package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchListRequest extends js.Object {
  /** ClientBatchListRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientBatchListRequest headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  /** ClientBatchListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  /** ClientBatchListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
}

object IClientBatchListRequest {
  @scala.inline
  def apply(
    batchIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    headId: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingControls] = js.undefined,
    sorting: js.UndefOr[Null | js.Array[IClientSortControls]] = js.undefined
  ): IClientBatchListRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchIds)) __obj.updateDynamic("batchIds")(batchIds.asInstanceOf[js.Any])
    if (!js.isUndefined(headId)) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchListRequest]
  }
}

