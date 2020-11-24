package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageVariant extends Image {
  
  var dimensions: String = js.native
  
  /**
    * Returns src URL for new image size/variant
    * @param image The image you would like a different size for.
    * @param options Image Max width and height configuration.
    */
  def imageForSize(image: Image, options: ImageOptions): String = js.native
  
  var name: String = js.native
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
    variant_ids: js.Array[String]
  ): ImageVariant = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageForSize = js.Any.fromFunction2(imageForSize), name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], variant_ids = variant_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVariant]
  }
  
  @scala.inline
  implicit class ImageVariantOps[Self <: ImageVariant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageForSize(value: (Image, ImageOptions) => String): Self = this.set("imageForSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
