package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutLineItemUpdateInput extends StObject {
  
  var customAttributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var id: js.UndefOr[ID] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var variantId: js.UndefOr[ID] = js.undefined
}
object CheckoutLineItemUpdateInput {
  
  inline def apply(): CheckoutLineItemUpdateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckoutLineItemUpdateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutLineItemUpdateInput] (val x: Self) extends AnyVal {
    
    inline def setCustomAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setVariantId(value: ID): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
