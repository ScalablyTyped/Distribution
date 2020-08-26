package typings.shopifyPrime.draftLineItemMod

import typings.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typings.shopifyPrime.lineItemMod.LineItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftLineItem extends LineItem {
  /**
    * Discount which will be applied to the line item or the overall order.
    */
  var applied_discount: AppliedDiscount = js.native
  /**
    * Indicates if this is a product variant line item, or a custom line item. If set to true indicates a custom line item. If set to false indicates a product variant line item. This is a read only field.
    */
  var custom: js.UndefOr[Boolean] = js.native
}

object DraftLineItem {
  @scala.inline
  def apply(applied_discount: AppliedDiscount): DraftLineItem = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftLineItem]
  }
  @scala.inline
  implicit class DraftLineItemOps[Self <: DraftLineItem] (val x: Self) extends AnyVal {
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
    def setApplied_discount(value: AppliedDiscount): Self = this.set("applied_discount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
  }
  
}

