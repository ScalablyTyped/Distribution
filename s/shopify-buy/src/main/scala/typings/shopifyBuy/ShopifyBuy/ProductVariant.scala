package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductVariant extends GraphModel {
  /**
    * Variant in stock. Always true if inventory tracking is disabled.
    */
  var available: Boolean
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the
    * product previously before the product went on sale.
    */
  var compareAtPrice: String
  /**
    * Price of variant, formatted according to shop currency format string. For instance "$10.00"
    */
  var formattedPrice: String
  /**
    * Variant weight in grams. If no weight is defined grams will be 0.
    */
  var grams: Double
  /**
    * Variant unique ID
    */
  var id: String | Double
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
  var price: String
  /**
    * ID of product variant belongs to
    */
  var productId: String | Double
  /**
    * Title of product variant belongs to
    */
  var productTitle: String
  /**
    * Title of variant
    */
  var title: String
  /*
    * Get a checkout url for a specific product variant.
    * You can optionally pass a quantity.
    * If no quantity is passed then quantity will default to 1.
    */
  def checkoutUrl(quantitiy: Double): String
}

object ProductVariant {
  @scala.inline
  def apply(
    available: Boolean,
    checkoutUrl: Double => String,
    compareAtPrice: String,
    formattedPrice: String,
    grams: Double,
    id: String | Double,
    image: Image,
    imageVariant: js.Array[ImageVariant],
    optionValues: js.Array[OptionValue],
    price: String,
    productId: String | Double,
    productTitle: String,
    title: String,
    attrs: js.Any = null,
    onlineStoreUrl: String = null
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], checkoutUrl = js.Any.fromFunction1(checkoutUrl), compareAtPrice = compareAtPrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageVariant = imageVariant.asInstanceOf[js.Any], optionValues = optionValues.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productTitle = productTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductVariant]
  }
}

