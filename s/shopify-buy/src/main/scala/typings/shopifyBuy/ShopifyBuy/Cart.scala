package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cart extends GraphModel {
  /**
    * Get checkout URL for current cart
    */
  var checkoutUrl: String
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
    subtotalPrice: String,
    attrs: js.Any = null,
    onlineStoreUrl: String = null
  ): Cart = {
    val __obj = js.Dynamic.literal(checkoutUrl = checkoutUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineItemCount = lineItemCount.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], subtotalPrice = subtotalPrice.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cart]
  }
}

