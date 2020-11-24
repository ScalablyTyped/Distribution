package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductVariant extends GraphModel {
  
  /**
    * Variant in stock. Always true if inventory tracking is disabled.
    */
  var available: Boolean = js.native
  
  /*
    * Get a checkout url for a specific product variant.
    * You can optionally pass a quantity.
    * If no quantity is passed then quantity will default to 1.
    */
  def checkoutUrl(quantitiy: Double): String = js.native
  
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the
    * product previously before the product went on sale.
    */
  var compareAtPrice: String = js.native
  
  /**
    * Price of variant, formatted according to shop currency format string. For instance "$10.00"
    */
  var formattedPrice: String = js.native
  
  /**
    * Variant weight in grams. If no weight is defined grams will be 0.
    */
  var grams: Double = js.native
  
  /**
    * Variant unique ID
    */
  var id: String | Double = js.native
  
  /**
    * Image for variant
    */
  var image: Image = js.native
  
  /**
    * Image variants available for a variant.
    */
  var imageVariant: js.Array[ImageVariant] = js.native
  
  /**
    * Option values associated with this variant, ex {name: "color", value: "Blue"}
    */
  var optionValues: js.Array[OptionValue] = js.native
  
  /**
    * Price of the variant. The price will be in the following form: "10.00"
    */
  var price: String = js.native
  
  /**
    * ID of product variant belongs to
    */
  var productId: String | Double = js.native
  
  /**
    * Title of product variant belongs to
    */
  var productTitle: String = js.native
  
  /**
    * Title of variant
    */
  var title: String = js.native
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
    title: String
  ): ProductVariant = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], checkoutUrl = js.Any.fromFunction1(checkoutUrl), compareAtPrice = compareAtPrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageVariant = imageVariant.asInstanceOf[js.Any], optionValues = optionValues.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], productTitle = productTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductVariant]
  }
  
  @scala.inline
  implicit class ProductVariantOps[Self <: ProductVariant] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckoutUrl(value: Double => String): Self = this.set("checkoutUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareAtPrice(value: String): Self = this.set("compareAtPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedPrice(value: String): Self = this.set("formattedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrams(value: Double): Self = this.set("grams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVariantVarargs(value: ImageVariant*): Self = this.set("imageVariant", js.Array(value :_*))
    
    @scala.inline
    def setImageVariant(value: js.Array[ImageVariant]): Self = this.set("imageVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionValuesVarargs(value: OptionValue*): Self = this.set("optionValues", js.Array(value :_*))
    
    @scala.inline
    def setOptionValues(value: js.Array[OptionValue]): Self = this.set("optionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String | Double): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTitle(value: String): Self = this.set("productTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
