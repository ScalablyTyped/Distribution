package typings.shopifyPrime.productImageMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductImage extends ShopifyObject {
  /**
    * A base64 image attachment. Only used when creating a <see cref="ProductImage"/>, where it's then converted into the <see cref="Src"/>.
    */
  var attachment: js.UndefOr[String] = js.native
  /**
    * The date and time when the product image was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Specifies the file name of the image when creating a <see cref="ProductImage"/>, where it's then converted into the <see cref="Src"/> path
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * The order of the product image in the list. The first product image is at position 1 and is the "main" image for the product.
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * The id of the product associated with the image.
    */
  var product_id: js.UndefOr[Double] = js.native
  /**
    * Specifies the location of the product image.
    */
  var src: js.UndefOr[String] = js.native
  /**
    * The date and time when the product image was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * An array of variant ids associated with the image.
    */
  var variant_ids: js.UndefOr[js.Array[Double]] = js.native
}

object ProductImage {
  @scala.inline
  def apply(): ProductImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductImage]
  }
  @scala.inline
  implicit class ProductImageOps[Self <: ProductImage] (val x: Self) extends AnyVal {
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
    def setAttachment(value: String): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProduct_id(value: Double): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_id: Self = this.set("product_id", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setVariant_idsVarargs(value: Double*): Self = this.set("variant_ids", js.Array(value :_*))
    @scala.inline
    def setVariant_ids(value: js.Array[Double]): Self = this.set("variant_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant_ids: Self = this.set("variant_ids", js.undefined)
  }
  
}

