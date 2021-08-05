package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductVariant
  extends StObject
     with GraphModel {
  
  /**
    * Variant in stock. Always true if inventory tracking is disabled.
    */
  var available: Boolean
  
  /*
    * Get a checkout url for a specific product variant.
    * You can optionally pass a quantity.
    * If no quantity is passed then quantity will default to 1.
    */
  def checkoutUrl(quantitiy: Double): String
  
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
}
object ProductVariant {
  
  inline def apply(
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
  
  extension [Self <: ProductVariant](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setCheckoutUrl(value: Double => String): Self = StObject.set(x, "checkoutUrl", js.Any.fromFunction1(value))
    
    inline def setCompareAtPrice(value: String): Self = StObject.set(x, "compareAtPrice", value.asInstanceOf[js.Any])
    
    inline def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
    
    inline def setGrams(value: Double): Self = StObject.set(x, "grams", value.asInstanceOf[js.Any])
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageVariant(value: js.Array[ImageVariant]): Self = StObject.set(x, "imageVariant", value.asInstanceOf[js.Any])
    
    inline def setImageVariantVarargs(value: ImageVariant*): Self = StObject.set(x, "imageVariant", js.Array(value :_*))
    
    inline def setOptionValues(value: js.Array[OptionValue]): Self = StObject.set(x, "optionValues", value.asInstanceOf[js.Any])
    
    inline def setOptionValuesVarargs(value: OptionValue*): Self = StObject.set(x, "optionValues", js.Array(value :_*))
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String | Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductTitle(value: String): Self = StObject.set(x, "productTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
