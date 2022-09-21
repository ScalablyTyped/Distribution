package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.history
import typings.reactNavigation.reactNavigationStrings.initialRoute
import typings.reactNavigation.reactNavigationStrings.none
import typings.reactNavigation.reactNavigationStrings.order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationSwitchRouterConfig extends StObject {
  
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  
  var initialRouteName: js.UndefOr[String] = js.undefined
  
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  
  var order: js.UndefOr[js.Array[String]] = js.undefined
  
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
  
  // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}
object NavigationSwitchRouterConfig {
  
  inline def apply(): NavigationSwitchRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationSwitchRouterConfig]
  }
  
  extension [Self <: NavigationSwitchRouterConfig](x: Self) {
    
    inline def setBackBehavior(value: none | initialRoute | history | order): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
    
    inline def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    
    inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    inline def setInitialRouteParams(value: NavigationParams): Self = StObject.set(x, "initialRouteParams", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteParamsUndefined: Self = StObject.set(x, "initialRouteParams", js.undefined)
    
    inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setPaths(value: NavigationPathsConfig): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setResetOnBlur(value: Boolean): Self = StObject.set(x, "resetOnBlur", value.asInstanceOf[js.Any])
    
    inline def setResetOnBlurUndefined: Self = StObject.set(x, "resetOnBlur", js.undefined)
  }
}
