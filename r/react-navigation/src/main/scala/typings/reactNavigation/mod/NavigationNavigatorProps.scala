package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.`no-preference`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationNavigatorProps[Options, State, ScreenProps] extends StObject {
  
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
  implicit class NavigationNavigatorPropsMutableBuilder[Self <: NavigationNavigatorProps[_, _, _], Options, State, ScreenProps] (val x: Self with (NavigationNavigatorProps[Options, State, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setNavigation(value: NavigationProp[State]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptions(value: Options): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
    
    @scala.inline
    def setTheme(value: SupportedThemes | `no-preference`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
