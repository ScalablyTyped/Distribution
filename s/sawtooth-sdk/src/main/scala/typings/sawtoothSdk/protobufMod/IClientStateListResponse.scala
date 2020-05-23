package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientStateListResponse extends js.Object {
  /** ClientStateListResponse entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.undefined
  /** ClientStateListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  /** ClientStateListResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
  /** ClientStateListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientStateListResponse {
  @scala.inline
  def apply(
    entries: js.UndefOr[Null | js.Array[IEntry]] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingResponse] = js.undefined,
    stateRoot: js.UndefOr[Null | String] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientStateListResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entries)) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(stateRoot)) __obj.updateDynamic("stateRoot")(stateRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStateListResponse]
  }
}

