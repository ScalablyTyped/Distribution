package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVariant extends Image {
  var dimensions: String
  var name: String
  /**
    * Returns src URL for new image size/variant
    * @param image The image you would like a different size for.
    * @param options Image Max width and height configuration.
    */
  def imageForSize(image: Image, options: ImageOptions): String
}

object ImageVariant {
  @scala.inline
  def apply(
    created_at: String,
    dimensions: String,
    id: String | Double,
    imageForSize: (Image, ImageOptions) => String,
    name: String,
    position: Double,
    product_id: String,
    src: String,
    updated_at: String,
    variant_ids: js.Array[String],
    attrs: js.Any = null,
    onlineStoreUrl: String = null
  ): ImageVariant = {
    val __obj = js.Dynamic.literal(created_at = created_at, dimensions = dimensions, id = id.asInstanceOf[js.Any], imageForSize = js.Any.fromFunction2(imageForSize), name = name, position = position, product_id = product_id, src = src, updated_at = updated_at, variant_ids = variant_ids)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[ImageVariant]
  }
}

