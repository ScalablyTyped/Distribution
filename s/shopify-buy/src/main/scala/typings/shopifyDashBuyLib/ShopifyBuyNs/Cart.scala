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

