package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientStateListRequest extends js.Object {
  /** ClientStateListRequest address */
  var address: js.UndefOr[String | Null] = js.undefined
  /** ClientStateListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  /** ClientStateListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
  /** ClientStateListRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
}

object IClientStateListRequest {
  @scala.inline
  def apply(
    address: js.UndefOr[Null | String] = js.undefined,
    paging: js.UndefOr[Null | IClientPagingControls] = js.undefined,
    sorting: js.UndefOr[Null | js.Array[IClientSortControls]] = js.undefined,
    stateRoot: js.UndefOr[Null | String] = js.undefined
  ): IClientStateListRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(sorting)) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (!js.isUndefined(stateRoot)) __obj.updateDynamic("stateRoot")(stateRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStateListRequest]
  }
}

