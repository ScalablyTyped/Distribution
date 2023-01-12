package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeInput extends StObject {
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var variantId: js.UndefOr[String] = js.undefined
}
object AttributeInput {
  
  inline def apply(): AttributeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeInput] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariantId(value: String): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
