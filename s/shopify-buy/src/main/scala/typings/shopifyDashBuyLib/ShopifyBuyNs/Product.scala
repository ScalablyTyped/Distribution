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

