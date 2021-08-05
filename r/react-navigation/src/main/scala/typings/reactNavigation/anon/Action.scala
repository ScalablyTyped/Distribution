package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[T /* <: NavigationParams */] extends StObject {
  
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[T] = js.undefined
  
  var routeName: String
}
object Action {
  
  inline def apply[T /* <: NavigationParams */](routeName: String): Action[T] = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  
  extension [Self <: Action[?], T /* <: NavigationParams */](x: Self & Action[T]) {
    
    inline def setAction(value: NavigationNavigateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
