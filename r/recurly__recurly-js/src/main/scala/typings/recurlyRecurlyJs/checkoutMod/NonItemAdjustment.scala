package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonItemAdjustment extends Adjustment {
  var amount: Double = js.native
  var currency: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var quantity: Double = js.native
  var taxCode: String = js.native
  var taxExempt: Boolean = js.native
}

object NonItemAdjustment {
  @scala.inline
  def apply(amount: Double, quantity: Double, taxCode: String, taxExempt: Boolean): NonItemAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], taxCode = taxCode.asInstanceOf[js.Any], taxExempt = taxExempt.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonItemAdjustment]
  }
  @scala.inline
  implicit class NonItemAdjustmentOps[Self <: NonItemAdjustment] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxCode(value: String): Self = this.set("taxCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxExempt(value: Boolean): Self = this.set("taxExempt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

