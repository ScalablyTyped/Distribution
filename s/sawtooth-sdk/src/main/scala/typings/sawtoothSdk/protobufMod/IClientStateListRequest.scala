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
    address: String = null,
    paging: IClientPagingControls = null,
    sorting: js.Array[IClientSortControls] = null,
    stateRoot: String = null
  ): IClientStateListRequest = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (stateRoot != null) __obj.updateDynamic("stateRoot")(stateRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientStateListRequest]
  }
}

