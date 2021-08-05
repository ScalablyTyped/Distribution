package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorySortObjectParameter extends StObject {
  
  var locales: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[StorySortMethod] = js.undefined
  
  var order: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object StorySortObjectParameter {
  
  inline def apply(): StorySortObjectParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorySortObjectParameter]
  }
  
  extension [Self <: StorySortObjectParameter](x: Self) {
    
    inline def setLocales(value: String): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setMethod(value: StorySortMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOrder(value: js.Array[js.Any]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: js.Any*): Self = StObject.set(x, "order", js.Array(value :_*))
  }
}
