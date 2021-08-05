package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAction extends StObject {
  
  var action: js.UndefOr[NavigationAction] = js.undefined
  
  var actions: js.UndefOr[js.Array[NavigationAction]] = js.undefined
  
  var key: js.UndefOr[Nullable[String]] = js.undefined
  
  var meta: js.UndefOr[js.Object] = js.undefined
  
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  
  var params: js.UndefOr[Params] = js.undefined
  
  var routeName: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object NavigationAction {
  
  inline def apply(`type`: String): NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAction]
  }
  
  extension [Self <: NavigationAction](x: Self) {
    
    inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActions(value: js.Array[NavigationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: NavigationAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setKey(value: Nullable[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNavKey(value: Nullable[String]): Self = StObject.set(x, "navKey", value.asInstanceOf[js.Any])
    
    inline def setNavKeyNull: Self = StObject.set(x, "navKey", null)
    
    inline def setNavKeyUndefined: Self = StObject.set(x, "navKey", js.undefined)
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    inline def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
