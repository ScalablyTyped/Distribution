package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutLineItem
  extends StObject
     with Node {
  
  var customAttributes: js.Array[Attribute]
  
  var discountAllocations: js.Array[DiscountAllocation]
  
  var quantity: Double
  
  var title: String
  
  var unitPrice: js.UndefOr[MoneyV2] = js.undefined
  
  var variant: js.UndefOr[ProductVariant] = js.undefined
}
object CheckoutLineItem {
  
  inline def apply(
    customAttributes: js.Array[Attribute],
    discountAllocations: js.Array[DiscountAllocation],
    id: ID,
    quantity: Double,
    title: String
  ): CheckoutLineItem = {
    val __obj = js.Dynamic.literal(customAttributes = customAttributes.asInstanceOf[js.Any], discountAllocations = discountAllocations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutLineItem] (val x: Self) extends AnyVal {
    
    inline def setCustomAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesVarargs(value: Attribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setDiscountAllocations(value: js.Array[DiscountAllocation]): Self = StObject.set(x, "discountAllocations", value.asInstanceOf[js.Any])
    
    inline def setDiscountAllocationsVarargs(value: DiscountAllocation*): Self = StObject.set(x, "discountAllocations", js.Array(value*))
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUnitPrice(value: MoneyV2): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def setVariant(value: ProductVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
