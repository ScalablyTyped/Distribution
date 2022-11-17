package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigatorProps[Options, State, ScreenProps] extends StObject {
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var navigation: js.UndefOr[NavigationProp[State]] = js.undefined
  
  var navigationOptions: js.UndefOr[Options] = js.undefined
  
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
  
  var theme: js.UndefOr[SupportedThemes | "no-preference"] = js.undefined
}
object NavigationNavigatorProps {
  
  inline def apply[Options, State, ScreenProps](): NavigationNavigatorProps[Options, State, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationNavigatorProps[Options, State, ScreenProps]]
  }
  
  extension [Self <: NavigationNavigatorProps[?, ?, ?], Options, State, ScreenProps](x: Self & (NavigationNavigatorProps[Options, State, ScreenProps])) {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setNavigation(value: NavigationProp[State]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptions(value: Options): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    inline def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
    
    inline def setTheme(value: SupportedThemes | "no-preference"): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
