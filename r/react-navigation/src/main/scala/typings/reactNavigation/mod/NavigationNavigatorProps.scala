package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.`no-preference`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationNavigatorProps[Options, State, ScreenProps] extends js.Object {
  
  var detached: js.UndefOr[Boolean] = js.native
  
  var navigation: js.UndefOr[NavigationProp[State]] = js.native
  
  var navigationOptions: js.UndefOr[Options] = js.native
  
  var screenProps: js.UndefOr[ScreenProps] = js.native
  
  var theme: js.UndefOr[SupportedThemes | `no-preference`] = js.native
}
object NavigationNavigatorProps {
  
  @scala.inline
  def apply[Options, State, ScreenProps](): NavigationNavigatorProps[Options, State, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationNavigatorProps[Options, State, ScreenProps]]
  }
  
  @scala.inline
  implicit class NavigationNavigatorPropsOps[Self <: NavigationNavigatorProps[_, _, _], Options, State, ScreenProps] (val x: Self with (NavigationNavigatorProps[Options, State, ScreenProps])) extends AnyVal {
    
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
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setNavigation(value: NavigationProp[State]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setNavigationOptions(value: Options): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
    
    @scala.inline
    def setTheme(value: SupportedThemes | `no-preference`): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
