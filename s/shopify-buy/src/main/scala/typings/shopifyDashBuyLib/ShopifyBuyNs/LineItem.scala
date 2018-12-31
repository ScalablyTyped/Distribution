package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItem extends GraphModel {
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the product
    * previously before the product went on sale.
    * If no compareAtPrice is set then this value will be null. An example value: "5.00".
    */
  var compare_at_price: java.lang.String
  /**
    * Variant's weight in grams. If no weight is set then 0 is returned.
    */
  var grams: scala.Double
  /**
    * A line item ID.
    */
  var id: java.lang.String | scala.Double
  /**
    * Variant's image.
    */
  var image: Image
  /**
    * The total price for this line item. For instance if the variant costs 1.50 and you have a
    * quantity of 2 then line_price will be 3.00.
    */
  var line_price: java.lang.String
  /**
    * Price of the variant. For example: "5.00".
    */
  var price: java.lang.String
  /**
    * ID of variant's product.
    */
  var product_id: java.lang.String | scala.Double
  /**
    * Count of variants to order.
    */
  var quantity: scala.Double
  /**
    * Product title of variant's parent product.
    */
  var title: java.lang.String
  /**
    * ID of line item variant.
    */
  var variant_id: java.lang.String | scala.Double
  /**
    * Title of variant.
    */
  var variant_title: java.lang.String
}

