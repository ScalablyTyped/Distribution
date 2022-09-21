package typings.shopifyBuy.ShopifyBuy

import typings.shopifyBuy.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAttributeV2 extends StObject {
  
  var customAttributes: js.Array[Key]
}
object CustomAttributeV2 {
  
  inline def apply(customAttributes: js.Array[Key]): CustomAttributeV2 = {
    val __obj = js.Dynamic.literal(customAttributes = customAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAttributeV2]
  }
  
  extension [Self <: CustomAttributeV2](x: Self) {
    
    inline def setCustomAttributes(value: js.Array[Key]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesVarargs(value: Key*): Self = StObject.set(x, "customAttributes", js.Array(value*))
  }
}
