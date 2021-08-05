package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationReplaceActionPayload extends StObject {
  
  var action: js.UndefOr[NavigationAction] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var newKey: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[NavigationParams] = js.undefined
  
  var routeName: String
}
object NavigationReplaceActionPayload {
  
  inline def apply(routeName: String): NavigationReplaceActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationReplaceActionPayload]
  }
  
  extension [Self <: NavigationReplaceActionPayload](x: Self) {
    
    inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNewKey(value: String): Self = StObject.set(x, "newKey", value.asInstanceOf[js.Any])
    
    inline def setNewKeyUndefined: Self = StObject.set(x, "newKey", js.undefined)
    
    inline def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
