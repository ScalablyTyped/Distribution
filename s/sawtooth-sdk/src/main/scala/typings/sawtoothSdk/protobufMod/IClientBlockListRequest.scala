package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockListRequest extends js.Object {
  /** ClientBlockListRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientBlockListRequest headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  /** ClientBlockListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  /** ClientBlockListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
}

object IClientBlockListRequest {
  @scala.inline
  def apply(
    blockIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    headId: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingControls] = js.undefined,
    sorting: js.UndefOr[Null | js.Array[IClientSortControls]] = js.undefined
  ): IClientBlockListRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockIds)) __obj.updateDynamic("blockIds")(blockIds.asInstanceOf[js.Any])
    if (!js.isUndefined(headId)) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockListRequest]
  }
}

