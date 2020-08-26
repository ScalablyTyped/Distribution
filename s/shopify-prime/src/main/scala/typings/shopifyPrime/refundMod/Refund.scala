package typings.shopifyPrime.refundMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.transactionMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refund extends ShopifyObject {
  var created_at: js.UndefOr[String] = js.native
  @JSName("id")
  var id_Refund: Double = js.native
  var note: String = js.native
  var order_adjustments: js.Array[OrderAdjustment] = js.native
  var order_id: js.Any = js.native
  var processed_at: js.UndefOr[String] = js.native
  var refund_line_items: js.Array[_] = js.native
  var restock: js.UndefOr[js.Any] = js.native
  var transactions: js.Array[Transaction] = js.native
  var user_id: Double = js.native
}

object Refund {
  @scala.inline
  def apply(
    id: Double,
    note: String,
    order_adjustments: js.Array[OrderAdjustment],
    order_id: js.Any,
    refund_line_items: js.Array[_],
    transactions: js.Array[Transaction],
    user_id: Double
  ): Refund = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], order_adjustments = order_adjustments.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any], refund_line_items = refund_line_items.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
  @scala.inline
  implicit class RefundOps[Self <: Refund] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder_adjustmentsVarargs(value: OrderAdjustment*): Self = this.set("order_adjustments", js.Array(value :_*))
    @scala.inline
    def setOrder_adjustments(value: js.Array[OrderAdjustment]): Self = this.set("order_adjustments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder_id(value: js.Any): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefund_line_itemsVarargs(value: js.Any*): Self = this.set("refund_line_items", js.Array(value :_*))
    @scala.inline
    def setRefund_line_items(value: js.Array[_]): Self = this.set("refund_line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionsVarargs(value: Transaction*): Self = this.set("transactions", js.Array(value :_*))
    @scala.inline
    def setTransactions(value: js.Array[Transaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setProcessed_at(value: String): Self = this.set("processed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessed_at: Self = this.set("processed_at", js.undefined)
    @scala.inline
    def setRestock(value: js.Any): Self = this.set("restock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestock: Self = this.set("restock", js.undefined)
  }
  
}

