package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.checkoutMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adjustments extends StObject {
  
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
  implicit class AdjustmentsMutableBuilder[Self <: Adjustments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustments(value: String): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: String): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiftCard(value: String): Self = StObject.set(x, "giftCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: String): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotal(value: String): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxes(value: String): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
