package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartLineUpdateInput extends StObject {
  
  var attributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var id: ID
  
  var merchandiseId: js.UndefOr[ID] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var sellingPlanId: js.UndefOr[ID] = js.undefined
}
object CartLineUpdateInput {
  
  inline def apply(id: ID): CartLineUpdateInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartLineUpdateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartLineUpdateInput] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMerchandiseId(value: ID): Self = StObject.set(x, "merchandiseId", value.asInstanceOf[js.Any])
    
    inline def setMerchandiseIdUndefined: Self = StObject.set(x, "merchandiseId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSellingPlanId(value: ID): Self = StObject.set(x, "sellingPlanId", value.asInstanceOf[js.Any])
    
    inline def setSellingPlanIdUndefined: Self = StObject.set(x, "sellingPlanId", js.undefined)
  }
}
