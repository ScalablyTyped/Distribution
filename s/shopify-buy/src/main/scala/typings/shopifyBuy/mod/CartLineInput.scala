package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartLineInput extends StObject {
  
  var attributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var merchandiseId: ID
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var sellingPlanId: js.UndefOr[Double] = js.undefined
}
object CartLineInput {
  
  inline def apply(merchandiseId: ID): CartLineInput = {
    val __obj = js.Dynamic.literal(merchandiseId = merchandiseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartLineInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartLineInput] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setMerchandiseId(value: ID): Self = StObject.set(x, "merchandiseId", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSellingPlanId(value: Double): Self = StObject.set(x, "sellingPlanId", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanIdUndefined: Self = StObject.set(x, "sellingPlanId", js.undefined)
  }
}
