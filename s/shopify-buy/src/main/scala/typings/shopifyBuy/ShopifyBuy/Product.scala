package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends GraphModel {
  /**
    * A product description.
    */
  var description: String = js.native
  /**
    * Product unique ID
    */
  var id: String | Double = js.native
  /**
    * An Array of Objects that contain meta data about an image including src of the images.
    */
  var images: js.Array[Image] = js.native
  /**
    * Get an array of Product Options. Product Options can be used to define
    * the currently selectedVariant from which you can get a checkout url (ProductVariant.checkoutUrl)
    * or can be added to a cart (Cart.createLineItemsFromVariants).
    */
  var options: js.Array[Option] = js.native
  /**
    * Retrieve variant for currently selected options. By default the first value in each option is selected
    * which means selectedVariant will never be null. With a selectedVariant you can
    * create checkout url (ProductVariant.checkoutUrl) or
    * it can be added to a cart (Cart.createLineItemsFromVariants).
    */
  var selectedVariant: ProductVariant = js.native
  /**
    * Retrieve image for currently selected variantImage.
    */
  var selectedVariantImage: Image = js.native
  /**
    * A read only Array of Strings represented currently selected option values. eg. ["Large", "Red"]
    */
  var selections: js.Array[String] = js.native
  /**
    * The product title
    */
  var title: String = js.native
  /**
    * All variants of a product.
    */
  var variants: js.Array[ProductVariant] = js.native
  /**
    * The product’s vendor name
    */
  var vendor: String = js.native
}

object Product {
  @scala.inline
  def apply(
    description: String,
    id: String | Double,
    images: js.Array[Image],
    options: js.Array[Option],
    selectedVariant: ProductVariant,
    selectedVariantImage: Image,
    selections: js.Array[String],
    title: String,
    variants: js.Array[ProductVariant],
    vendor: String
  ): Product = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedVariant = selectedVariant.asInstanceOf[js.Any], selectedVariantImage = selectedVariantImage.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedVariant(value: ProductVariant): Self = this.set("selectedVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedVariantImage(value: Image): Self = this.set("selectedVariantImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionsVarargs(value: String*): Self = this.set("selections", js.Array(value :_*))
    @scala.inline
    def setSelections(value: js.Array[String]): Self = this.set("selections", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariantsVarargs(value: ProductVariant*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[ProductVariant]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
  }
  
}

