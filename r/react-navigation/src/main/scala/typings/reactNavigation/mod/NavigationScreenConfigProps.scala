package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] extends StObject {
  
  var navigation: NavigationScreenPropType
  
  var screenProps: ScreenProps
  
  var theme: SupportedThemes
}
object NavigationScreenConfigProps {
  
  inline def apply[NavigationScreenPropType, ScreenProps](navigation: NavigationScreenPropType, screenProps: ScreenProps, theme: SupportedThemes): NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationScreenConfigProps[?, ?], NavigationScreenPropType, ScreenProps] (val x: Self & (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps])) extends AnyVal {
    
    inline def setNavigation(value: NavigationScreenPropType): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
