package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libPricingCheckoutMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adjustments extends StObject {
  
  /**
    * Total cost of all adjustments. This is part of the subtotal due at the next billing cycle.
    */
  var adjustments: String
  
  /**
    * Amount discounted for next billing cycle with coupon use.
    */
  var discount: String
  
  /**
    * The gift card amount that will be applied to the next billing cycle cost.
    */
  var giftCard: String
  
  var items: js.Array[Item]
  
  /**
    * Total cost of all subscriptions. This is part of the subtotal due at the next billing cycle.
    */
  var subscriptions: String
  
  /**
    * Subtotal of the following pricing components due at the next billing cycle.
    */
  var subtotal: String
  
  /**
    * Total subscription taxation due at the next billing cycle.
    */
  var taxes: String
  
  /**
    * Total subscription cost due at the next billing cycle.
    */
  var total: String
}
object Adjustments {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Adjustments] (val x: Self) extends AnyVal {
    
    inline def setAdjustments(value: String): Self = StObject.set(x, "adjustments", value.asInstanceOf[js.Any])
    
    inline def setDiscount(value: String): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setGiftCard(value: String): Self = StObject.set(x, "giftCard", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSubscriptions(value: String): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubtotal(value: String): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    inline def setTaxes(value: String): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
