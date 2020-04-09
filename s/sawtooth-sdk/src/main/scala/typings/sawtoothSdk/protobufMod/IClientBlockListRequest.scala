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
    blockIds: js.Array[String] = null,
    headId: String = null,
    paging: IClientPagingControls = null,
    sorting: js.Array[IClientSortControls] = null
  ): IClientBlockListRequest = {
    val __obj = js.Dynamic.literal()
    if (blockIds != null) __obj.updateDynamic("blockIds")(blockIds.asInstanceOf[js.Any])
    if (headId != null) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockListRequest]
  }
}

