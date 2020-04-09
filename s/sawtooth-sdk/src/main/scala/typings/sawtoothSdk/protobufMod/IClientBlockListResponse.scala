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
    blocks: js.Array[IBlock] = null,
    headId: String = null,
    paging: IClientPagingResponse = null,
    status: Status = null
  ): IClientBlockListResponse = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (headId != null) __obj.updateDynamic("headId")(headId.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockListResponse]
  }
}

