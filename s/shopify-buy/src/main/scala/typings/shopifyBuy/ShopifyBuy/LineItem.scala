package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItem extends GraphModel {
  
  /**
    * Compare at price for variant. The compareAtPrice would be the price of the product
    * previously before the product went on sale.
    * If no compareAtPrice is set then this value will be null. An example value: "5.00".
    */
  var compareAtPrice: String | Null = js.native
  
  /**
    * Variant's weight in grams. If no weight is set then 0 is returned.
    */
  var grams: Double = js.native
  
  /**
    * A line item ID.
    */
  var id: String | Double = js.native
  
  /**
    * Variant's image.
    */
  var image: Image = js.native
  
  /**
    * The total price for this line item. For instance if the variant costs 1.50 and you have a
    * quantity of 2 then line_price will be 3.00.
    */
  var linePrice: String = js.native
  
  /**
    * Price of the variant. For example: "5.00".
    */
  var price: String = js.native
  
  /**
    * ID of variant's product.
    */
  var productId: String | Double = js.native
  
  /**
    * Count of variants to order.
    */
  var quantity: Double = js.native
  
  /**
    * Product title of variant's parent product.
    */
  var title: String = js.native
  
  /**
    * ID of line item variant.
    */
  var variantId: String | Double = js.native
  
  /**
    * Title of variant.
    */
  var variantTitle: String = js.native
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
    val __obj = js.Dynamic.literal(grams = grams.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], linePrice = linePrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any], variantTitle = variantTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
  
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    
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
    def setGrams(value: Double): Self = this.set("grams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinePrice(value: String): Self = this.set("linePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String | Double): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantId(value: String | Double): Self = this.set("variantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantTitle(value: String): Self = this.set("variantTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareAtPrice(value: String): Self = this.set("compareAtPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareAtPriceNull: Self = this.set("compareAtPrice", null)
  }
}
