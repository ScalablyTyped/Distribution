package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItem extends StObject {
  
  var currentQuantity: Double
  
  var customAttributes: js.Array[Attribute]
  
  var discountAllocations: js.Array[DiscountAllocation]
  
  var discountedTotalPrice: MoneyV2
  
  var originalTotalPrice: MoneyV2
  
  var quantity: Double
  
  var title: String
  
  var variant: js.UndefOr[ProductVariant] = js.undefined
}
object OrderLineItem {
  
  inline def apply(
    currentQuantity: Double,
    customAttributes: js.Array[Attribute],
    discountAllocations: js.Array[DiscountAllocation],
    discountedTotalPrice: MoneyV2,
    originalTotalPrice: MoneyV2,
    quantity: Double,
    title: String
  ): OrderLineItem = {
    val __obj = js.Dynamic.literal(currentQuantity = currentQuantity.asInstanceOf[js.Any], customAttributes = customAttributes.asInstanceOf[js.Any], discountAllocations = discountAllocations.asInstanceOf[js.Any], discountedTotalPrice = discountedTotalPrice.asInstanceOf[js.Any], originalTotalPrice = originalTotalPrice.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderLineItem] (val x: Self) extends AnyVal {
    
    inline def setCurrentQuantity(value: Double): Self = StObject.set(x, "currentQuantity", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesVarargs(value: Attribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setDiscountAllocations(value: js.Array[DiscountAllocation]): Self = StObject.set(x, "discountAllocations", value.asInstanceOf[js.Any])
    
    inline def setDiscountAllocationsVarargs(value: DiscountAllocation*): Self = StObject.set(x, "discountAllocations", js.Array(value*))
    
    inline def setDiscountedTotalPrice(value: MoneyV2): Self = StObject.set(x, "discountedTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setOriginalTotalPrice(value: MoneyV2): Self = StObject.set(x, "originalTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: ProductVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
