package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutLineItemInput extends StObject {
  
  var customAttributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var quantity: Double
  
  var variantId: ID
}
object CheckoutLineItemInput {
  
  inline def apply(quantity: Double, variantId: ID): CheckoutLineItemInput = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutLineItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutLineItemInput] (val x: Self) extends AnyVal {
    
    inline def setCustomAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setVariantId(value: ID): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
  }
}
