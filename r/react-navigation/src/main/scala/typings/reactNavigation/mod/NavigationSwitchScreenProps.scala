package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationSwitchScreenProps[Params, ScreenProps] extends js.Object {
  
  var navigation: NavigationSwitchProp[NavigationRoute[NavigationParams], Params] = js.native
  
  var screenProps: ScreenProps = js.native
  
  var theme: SupportedThemes = js.native
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
  implicit class NavigationSwitchScreenPropsOps[Self <: NavigationSwitchScreenProps[_, _], Params, ScreenProps] (val x: Self with (NavigationSwitchScreenProps[Params, ScreenProps])) extends AnyVal {
    
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
    def setNavigation(value: NavigationSwitchProp[NavigationRoute[NavigationParams], Params]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: SupportedThemes): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
