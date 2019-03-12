package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductVariant extends GraphModel {
  /**
    * Variant in stock. Always true if inventory tracking is disabled.
    */
  var available: scala.Boolean
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the
    * product previously before the product went on sale.
    */
  var compareAtPrice: java.lang.String
  /**
    * Price of variant, formatted according to shop currency format string. For instance "$10.00"
    */
  var formattedPrice: java.lang.String
  /**
    * Variant weight in grams. If no weight is defined grams will be 0.
    */
  var grams: scala.Double
  /**
    * Variant unique ID
    */
  var id: java.lang.String | scala.Double
  /**
    * Image for variant
    */
  var image: Image
  /**
    * Image variants available for a variant.
    */
  var imageVariant: js.Array[ImageVariant]
  /**
    * Option values associated with this variant, ex {name: "color", value: "Blue"}
    */
  var optionValues: js.Array[OptionValue]
  /**
    * Price of the variant. The price will be in the following form: "10.00"
    */
  var price: java.lang.String
  /**
    * ID of product variant belongs to
    */
  var productId: java.lang.String | scala.Double
  /**
    * Title of product variant belongs to
    */
  var productTitle: java.lang.String
  /**
    * Title of variant
    */
  var title: java.lang.String
  /*
    * Get a checkout url for a specific product variant.
    * You can optionally pass a quantity.
    * If no quantity is passed then quantity will default to 1.
    */
  def checkoutUrl(quantitiy: scala.Double): java.lang.String
}

object ProductVariant {
  @scala.inline
  def apply(
    available: scala.Boolean,
    checkoutUrl: scala.Double => java.lang.String,
    compareAtPrice: java.lang.String,
    formattedPrice: java.lang.String,
    grams: scala.Double,
    id: java.lang.String | scala.Double,
    image: Image,
    imageVariant: js.Array[ImageVariant],
    optionValues: js.Array[OptionValue],
    price: java.lang.String,
    productId: java.lang.String | scala.Double,
    productTitle: java.lang.String,
    title: java.lang.String,
    attrs: js.Any = null,
    onlineStoreUrl: java.lang.String = null
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(available = available, checkoutUrl = js.Any.fromFunction1(checkoutUrl), compareAtPrice = compareAtPrice, formattedPrice = formattedPrice, grams = grams, id = id.asInstanceOf[js.Any], image = image, imageVariant = imageVariant, optionValues = optionValues, price = price, productId = productId.asInstanceOf[js.Any], productTitle = productTitle, title = title)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[ProductVariant]
  }
}

