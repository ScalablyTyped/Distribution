package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.checkoutMod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adjustments extends js.Object {
  
  /**
    * Total cost of all adjustments. This is part of the subtotal due at the next billing cycle.
    */
  var adjustments: String = js.native
  
  /**
    * Amount discounted for next billing cycle with coupon use.
    */
  var discount: String = js.native
  
  /**
    * The gift card amount that will be applied to the next billing cycle cost.
    */
  var giftCard: String = js.native
  
  var items: js.Array[Item] = js.native
  
  /**
    * Total cost of all subscriptions. This is part of the subtotal due at the next billing cycle.
    */
  var subscriptions: String = js.native
  
  /**
    * Subtotal of the following pricing components due at the next billing cycle.
    */
  var subtotal: String = js.native
  
  /**
    * Total subscription taxation due at the next billing cycle.
    */
  var taxes: String = js.native
  
  /**
    * Total subscription cost due at the next billing cycle.
    */
  var total: String = js.native
}
object Adjustments {
  
  @scala.inline
  def apply(
    adjustments: String,
    discount: String,
    giftCard: String,
    items: js.Array[Item],
    subscriptions: String,
    subtotal: String,
    taxes: String,
    total: String
  ): Adjustments = {
    val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], giftCard = giftCard.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustments]
  }
  
  @scala.inline
  implicit class AdjustmentsOps[Self <: Adjustments] (val x: Self) extends AnyVal {
    
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
    def setAdjustments(value: String): Self = this.set("adjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: String): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiftCard(value: String): Self = this.set("giftCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: String): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotal(value: String): Self = this.set("subtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxes(value: String): Self = this.set("taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
