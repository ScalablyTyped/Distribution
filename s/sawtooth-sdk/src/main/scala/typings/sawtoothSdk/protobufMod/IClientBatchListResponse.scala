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
    batches: js.Array[IBatch] = null,
    headId: String = null,
    paging: IClientPagingResponse = null,
    status: Status = null
  ): IClientBatchListResponse = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    if (headId != null) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchListResponse]
  }
}

