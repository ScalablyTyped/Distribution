package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] extends js.Object {
  
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
  implicit class NavigationScreenConfigPropsOps[Self <: NavigationScreenConfigProps[_, _], NavigationScreenPropType, ScreenProps] (val x: Self with (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNavigation(value: NavigationScreenPropType): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: SupportedThemes): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
