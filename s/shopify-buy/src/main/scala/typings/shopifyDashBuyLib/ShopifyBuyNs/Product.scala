package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends GraphModel {
  /**
    * A product description.
    */
  var description: java.lang.String
  /**
    * Product unique ID
    */
  var id: java.lang.String | scala.Double
  /**
    * An Array of Objects that contain meta data about an image including src of the images.
    */
  var images: js.Array[Image]
  /**
    * Get an array of Product Options. Product Options can be used to define
    * the currently selectedVariant from which you can get a checkout url (ProductVariant.checkoutUrl)
    * or can be added to a cart (Cart.createLineItemsFromVariants).
    */
  var options: js.Array[Option]
  /**
    * Retrieve variant for currently selected options. By default the first value in each option is selected
    * which means selectedVariant will never be null. With a selectedVariant you can
    * create checkout url (ProductVariant.checkoutUrl) or
    * it can be added to a cart (Cart.createLineItemsFromVariants).
    */
  var selectedVariant: ProductVariant
  /**
    * Retrieve image for currently selected variantImage.
    */
  var selectedVariantImage: Image
  /**
    * A read only Array of Strings represented currently selected option values. eg. ["Large", "Red"]
    */
  var selections: js.Array[java.lang.String]
  /**
    * The product title
    */
  var title: java.lang.String
  /**
    * All variants of a product.
    */
  var variants: js.Array[ProductVariant]
  /**
    * The product’s vendor name
    */
  var vendor: java.lang.String
}

object Product {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String | scala.Double,
    images: js.Array[Image],
    options: js.Array[Option],
    selectedVariant: ProductVariant,
    selectedVariantImage: Image,
    selections: js.Array[java.lang.String],
    title: java.lang.String,
    variants: js.Array[ProductVariant],
    vendor: java.lang.String,
    attrs: js.Any = null,
    onlineStoreUrl: java.lang.String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("selectedVariant")(selectedVariant)
    __obj.updateDynamic("selectedVariantImage")(selectedVariantImage)
    __obj.updateDynamic("selections")(selections)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("variants")(variants)
    __obj.updateDynamic("vendor")(vendor)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[Product]
  }
}

