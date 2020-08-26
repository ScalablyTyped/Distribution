package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientStateListRequest extends js.Object {
  /** ClientStateListRequest address */
  var address: js.UndefOr[String | Null] = js.native
  /** ClientStateListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  /** ClientStateListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
  /** ClientStateListRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
}

object IClientStateListRequest {
  @scala.inline
  def apply(): IClientStateListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListRequest]
  }
  @scala.inline
  implicit class IClientStateListRequestOps[Self <: IClientStateListRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    @scala.inline
    def setPaging(value: IClientPagingControls): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    @scala.inline
    def setPagingNull: Self = this.set("paging", null)
    @scala.inline
    def setSortingVarargs(value: IClientSortControls*): Self = this.set("sorting", js.Array(value :_*))
    @scala.inline
    def setSorting(value: js.Array[IClientSortControls]): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    @scala.inline
    def setSortingNull: Self = this.set("sorting", null)
    @scala.inline
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateRoot: Self = this.set("stateRoot", js.undefined)
    @scala.inline
    def setStateRootNull: Self = this.set("stateRoot", null)
  }
  
}

