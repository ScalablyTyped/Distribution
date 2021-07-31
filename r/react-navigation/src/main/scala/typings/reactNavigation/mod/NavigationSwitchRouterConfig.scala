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
  
  @scala.inline
  def apply(): NavigationSwitchRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationSwitchRouterConfig]
  }
  
  @scala.inline
  implicit class NavigationSwitchRouterConfigMutableBuilder[Self <: NavigationSwitchRouterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackBehavior(value: none | initialRoute | history | order): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    @scala.inline
    def setInitialRouteParams(value: NavigationParams): Self = StObject.set(x, "initialRouteParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteParamsUndefined: Self = StObject.set(x, "initialRouteParams", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: NavigationPathsConfig): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = StObject.set(x, "resetOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnBlurUndefined: Self = StObject.set(x, "resetOnBlur", js.undefined)
  }
}
