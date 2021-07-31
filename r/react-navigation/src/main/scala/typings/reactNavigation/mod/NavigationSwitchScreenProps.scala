package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationSwitchScreenProps[Params, ScreenProps] extends StObject {
  
  var navigation: NavigationSwitchProp[NavigationRoute[NavigationParams], Params]
  
  var screenProps: ScreenProps
  
  var theme: SupportedThemes
}
object NavigationSwitchScreenProps {
  
  @scala.inline
  def apply[Params, ScreenProps](
    navigation: NavigationSwitchProp[NavigationRoute[NavigationParams], Params],
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationSwitchScreenProps[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSwitchScreenProps[Params, ScreenProps]]
  }
  
  @scala.inline
  implicit class NavigationSwitchScreenPropsMutableBuilder[Self <: NavigationSwitchScreenProps[?, ?], Params, ScreenProps] (val x: Self & (NavigationSwitchScreenProps[Params, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: NavigationSwitchProp[NavigationRoute[NavigationParams], Params]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
