package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchListResponse extends js.Object {
  /** ClientBatchListResponse batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
  /** ClientBatchListResponse headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  /** ClientBatchListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  /** ClientBatchListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBatchListResponse {
  @scala.inline
  def apply(
    batches: js.UndefOr[Null | js.Array[IBatch]] = js.undefined,
    headId: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingResponse] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientBatchListResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batches)) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    if (!js.isUndefined(headId)) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchListResponse]
  }
}

