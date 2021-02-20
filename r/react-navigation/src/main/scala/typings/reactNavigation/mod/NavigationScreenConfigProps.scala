package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] extends StObject {
  
  var navigation: NavigationScreenPropType = js.native
  
  var screenProps: ScreenProps = js.native
  
  var theme: SupportedThemes = js.native
}
object NavigationScreenConfigProps {
  
  @scala.inline
  def apply[NavigationScreenPropType, ScreenProps](navigation: NavigationScreenPropType, screenProps: ScreenProps, theme: SupportedThemes): NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]]
  }
  
  @scala.inline
  implicit class NavigationScreenConfigPropsMutableBuilder[Self <: NavigationScreenConfigProps[_, _], NavigationScreenPropType, ScreenProps] (val x: Self with (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: NavigationScreenPropType): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
