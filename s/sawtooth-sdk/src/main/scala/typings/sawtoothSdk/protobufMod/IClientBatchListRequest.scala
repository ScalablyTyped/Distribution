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
    batchIds: js.Array[String] = null,
    headId: String = null,
    paging: IClientPagingControls = null,
    sorting: js.Array[IClientSortControls] = null
  ): IClientBatchListRequest = {
    val __obj = js.Dynamic.literal()
    if (batchIds != null) __obj.updateDynamic("batchIds")(batchIds.asInstanceOf[js.Any])
    if (headId != null) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchListRequest]
  }
}

