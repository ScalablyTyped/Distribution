package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cart
  extends StObject
     with GraphModel {
  
  /**
    * Get checkout URL for current cart
    */
  var checkoutUrl: String
  
  /**
    * Get completed at date.
    */
  var completedAt: String | Null
  
  /**
    * get ID for current cart
    */
  var id: String | Double
  
  /**
    * Gets the total quantity of all line items. Example: you've added two variants
    * with quantities 3 and 2. lineItemCount will be 5.
    */
  var lineItemCount: Double
  
  /**
    * Get an Array of CartLineItemModel's
    */
  var lineItems: js.Array[LineItem]
  
  /**
    * Get current subtotal price for all line items, before shipping, taxes, and discounts.
    * Example: two items have been added to the cart that cost $1.25 then the subtotal will be 2.50
    */
  var subtotalPrice: String
}
object Cart {
  
  @scala.inline
  def apply(
    checkoutUrl: String,
    id: String | Double,
    lineItemCount: Double,
    lineItems: js.Array[LineItem],
    subtotalPrice: String
  ): Cart = {
    val __obj = js.Dynamic.literal(checkoutUrl = checkoutUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineItemCount = lineItemCount.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], subtotalPrice = subtotalPrice.asInstanceOf[js.Any], completedAt = null)
    __obj.asInstanceOf[Cart]
  }
  
  @scala.inline
  implicit class CartMutableBuilder[Self <: Cart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckoutUrl(value: String): Self = StObject.set(x, "checkoutUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAt(value: String): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAtNull: Self = StObject.set(x, "completedAt", null)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemCount(value: Double): Self = StObject.set(x, "lineItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItems(value: js.Array[LineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsVarargs(value: LineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setSubtotalPrice(value: String): Self = StObject.set(x, "subtotalPrice", value.asInstanceOf[js.Any])
  }
}
