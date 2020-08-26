package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientTransactionListResponse extends js.Object {
  /** ClientTransactionListResponse headId */
  var headId: js.UndefOr[String | Null] = js.native
  /** ClientTransactionListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.native
  /** ClientTransactionListResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  /** ClientTransactionListResponse transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}

object IClientTransactionListResponse {
  @scala.inline
  def apply(): IClientTransactionListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListResponse]
  }
  @scala.inline
  implicit class IClientTransactionListResponseOps[Self <: IClientTransactionListResponse] (val x: Self) extends AnyVal {
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
    def setPaging(value: IClientPagingResponse): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    @scala.inline
    def setPagingNull: Self = this.set("paging", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setTransactionsVarargs(value: ITransaction*): Self = this.set("transactions", js.Array(value :_*))
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactions: Self = this.set("transactions", js.undefined)
    @scala.inline
    def setTransactionsNull: Self = this.set("transactions", null)
  }
  
}

