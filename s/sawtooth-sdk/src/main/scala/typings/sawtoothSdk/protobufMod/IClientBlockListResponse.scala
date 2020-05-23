package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockListResponse extends js.Object {
  /** ClientBlockListResponse blocks */
  var blocks: js.UndefOr[js.Array[IBlock] | Null] = js.undefined
  /** ClientBlockListResponse headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  /** ClientBlockListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  /** ClientBlockListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBlockListResponse {
  @scala.inline
  def apply(
    blocks: js.UndefOr[Null | js.Array[IBlock]] = js.undefined,
    headId: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingResponse] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientBlockListResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocks)) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (!js.isUndefined(headId)) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockListResponse]
  }
}

