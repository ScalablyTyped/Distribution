package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product
  extends StObject
     with GraphModel {
  
  /**
    * A product description.
    */
  var description: String
  
  /**
    * Product unique ID
    */
  var id: String | Double
  
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
  var selections: js.Array[String]
  
  /**
    * The product title
    */
  var title: String
  
  /**
    * All variants of a product.
    */
  var variants: js.Array[ProductVariant]
  
  /**
    * The product’s vendor name
    */
  var vendor: String
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
  implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSelectedVariant(value: ProductVariant): Self = StObject.set(x, "selectedVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVariantImage(value: Image): Self = StObject.set(x, "selectedVariantImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[String]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: String*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariants(value: js.Array[ProductVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsVarargs(value: ProductVariant*): Self = StObject.set(x, "variants", js.Array(value :_*))
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
