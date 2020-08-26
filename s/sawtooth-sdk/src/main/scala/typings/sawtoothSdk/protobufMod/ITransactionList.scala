package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionList extends js.Object {
  /** TransactionList transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}

object ITransactionList {
  @scala.inline
  def apply(): ITransactionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionList]
  }
  @scala.inline
  implicit class ITransactionListOps[Self <: ITransactionList] (val x: Self) extends AnyVal {
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
    def setTransactionsVarargs(value: ITransaction*): Self = this.set("transactions", js.Array(value :_*))
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactions: Self = this.set("transactions", js.undefined)
    @scala.inline
    def setTransactionsNull: Self = this.set("transactions", null)
  }
  
}

