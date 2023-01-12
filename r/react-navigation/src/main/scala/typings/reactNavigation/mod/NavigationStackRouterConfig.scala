package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationStackRouterConfig extends StObject {
  
  var initialRouteKey: js.UndefOr[String] = js.undefined
  
  var initialRouteName: js.UndefOr[String] = js.undefined
  
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
}
object NavigationStackRouterConfig {
  
  inline def apply(): NavigationStackRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationStackRouterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationStackRouterConfig] (val x: Self) extends AnyVal {
    
    inline def setInitialRouteKey(value: String): Self = StObject.set(x, "initialRouteKey", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteKeyUndefined: Self = StObject.set(x, "initialRouteKey", js.undefined)
    
    inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    inline def setInitialRouteParams(value: NavigationParams): Self = StObject.set(x, "initialRouteParams", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteParamsUndefined: Self = StObject.set(x, "initialRouteParams", js.undefined)
    
    inline def setPaths(value: NavigationPathsConfig): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
  }
}
