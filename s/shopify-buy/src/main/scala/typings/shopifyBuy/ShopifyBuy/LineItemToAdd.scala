package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemToAdd extends StObject {
  
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  
  var quantity: Double
  
  var variantId: String | Double
}
object LineItemToAdd {
  
  inline def apply(quantity: Double, variantId: String | Double): LineItemToAdd = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItemToAdd]
  }
  
  extension [Self <: LineItemToAdd](x: Self) {
    
    inline def setCustomAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value :_*))
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setVariantId(value: String | Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
  }
}
