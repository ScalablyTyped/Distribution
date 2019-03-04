package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cart extends GraphModel {
  /**
    * Get checkout URL for current cart
    */
  var checkoutUrl: java.lang.String
  /**
    * get ID for current cart
    */
  var id: java.lang.String | scala.Double
  /**
    * Gets the total quantity of all line items. Example: you've added two variants
    * with quantities 3 and 2. lineItemCount will be 5.
    */
  var lineItemCount: scala.Double
  /**
    * Get an Array of CartLineItemModel's
    */
  var lineItems: js.Array[LineItem]
  /**
    * Get current subtotal price for all line items, before shipping, taxes, and discounts.
    * Example: two items have been added to the cart that cost $1.25 then the subtotal will be 2.50
    */
  var subtotalPrice: java.lang.String
}

object Cart {
  @scala.inline
  def apply(
    checkoutUrl: java.lang.String,
    id: java.lang.String | scala.Double,
    lineItemCount: scala.Double,
    lineItems: js.Array[LineItem],
    subtotalPrice: java.lang.String,
    attrs: js.Any = null,
    onlineStoreUrl: java.lang.String = null
  ): Cart = {
    val __obj = js.Dynamic.literal(checkoutUrl = checkoutUrl, id = id.asInstanceOf[js.Any], lineItemCount = lineItemCount, lineItems = lineItems, subtotalPrice = subtotalPrice)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[Cart]
  }
}

