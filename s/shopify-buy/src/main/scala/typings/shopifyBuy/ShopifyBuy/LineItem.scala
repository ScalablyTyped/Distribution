package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItem
  extends StObject
     with GraphModel {
  
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the product
    * previously before the product went on sale.
    * If no compareAtPrice is set then this value will be null. An example value: "5.00".
    */
  var compareAtPrice: String | Null
  
  /**
    * Variant's weight in grams. If no weight is set then 0 is returned.
    */
  var grams: Double
  
  /**
    * A line item ID.
    */
  var id: String | Double
  
  /**
    * Variant's image.
    */
  var image: Image
  
  /**
    * The total price for this line item. For instance if the variant costs 1.50 and you have a
    * quantity of 2 then line_price will be 3.00.
    */
  var linePrice: String
  
  /**
    * Price of the variant. For example: "5.00".
    */
  var price: String
  
  /**
    * ID of variant's product.
    */
  var productId: String | Double
  
  /**
    * Count of variants to order.
    */
  var quantity: Double
  
  /**
    * Product title of variant's parent product.
    */
  var title: String
  
  /**
    * ID of line item variant.
    */
  var variantId: String | Double
  
  /**
    * Title of variant.
    */
  var variantTitle: String
}
object LineItem {
  
  @scala.inline
  def apply(
    grams: Double,
    id: String | Double,
    image: Image,
    linePrice: String,
    price: String,
    productId: String | Double,
    quantity: Double,
    title: String,
    variantId: String | Double,
    variantTitle: String
  ): LineItem = {
    val __obj = js.Dynamic.literal(grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], linePrice = linePrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any], variantTitle = variantTitle.asInstanceOf[js.Any], compareAtPrice = null)
    __obj.asInstanceOf[LineItem]
  }
  
  @scala.inline
  implicit class LineItemMutableBuilder[Self <: LineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompareAtPrice(value: String): Self = StObject.set(x, "compareAtPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareAtPriceNull: Self = StObject.set(x, "compareAtPrice", null)
    
    @scala.inline
    def setGrams(value: Double): Self = StObject.set(x, "grams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinePrice(value: String): Self = StObject.set(x, "linePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String | Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantId(value: String | Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantTitle(value: String): Self = StObject.set(x, "variantTitle", value.asInstanceOf[js.Any])
  }
}
