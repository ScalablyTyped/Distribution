package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVariant extends Image {
  var dimensions: java.lang.String
  var name: java.lang.String
  /**
    * Returns src URL for new image size/variant
    * @param image The image you would like a different size for.
    * @param options Image Max width and height configuration.
    */
  def imageForSize(image: Image, options: ImageOptions): java.lang.String
}

object ImageVariant {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    dimensions: java.lang.String,
    id: java.lang.String | scala.Double,
    imageForSize: js.Function2[Image, ImageOptions, java.lang.String],
    name: java.lang.String,
    position: scala.Double,
    product_id: java.lang.String,
    src: java.lang.String,
    updated_at: java.lang.String,
    variant_ids: js.Array[java.lang.String],
    attrs: js.Any = null,
    onlineStoreUrl: java.lang.String = null
  ): ImageVariant = {
    val __obj = js.Dynamic.literal(created_at = created_at, dimensions = dimensions, id = id.asInstanceOf[js.Any], imageForSize = imageForSize, name = name, position = position, product_id = product_id, src = src, updated_at = updated_at, variant_ids = variant_ids)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[ImageVariant]
  }
}

