package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientTransactionListRequest extends js.Object {
  /** ClientTransactionListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  /** ClientTransactionListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  /** ClientTransactionListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
  /** ClientTransactionListRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}

object IClientTransactionListRequest {
  @scala.inline
  def apply(): IClientTransactionListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListRequest]
  }
  @scala.inline
  implicit class IClientTransactionListRequestOps[Self <: IClientTransactionListRequest] (val x: Self) extends AnyVal {
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
    def setHeadId(value: String): Self = this.set("headId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadId: Self = this.set("headId", js.undefined)
    @scala.inline
    def setHeadIdNull: Self = this.set("headId", null)
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
    def setTransactionIdsVarargs(value: String*): Self = this.set("transactionIds", js.Array(value :_*))
    @scala.inline
    def setTransactionIds(value: js.Array[String]): Self = this.set("transactionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionIds: Self = this.set("transactionIds", js.undefined)
    @scala.inline
    def setTransactionIdsNull: Self = this.set("transactionIds", null)
  }
  
}

