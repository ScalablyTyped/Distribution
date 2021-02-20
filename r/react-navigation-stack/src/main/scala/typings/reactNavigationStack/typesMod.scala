package typings.reactNavigationStack

import typings.react.mod.ComponentType
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationStack.anon.NavigationOptions
import typings.reactNavigationStack.vendorTypesMod.StackNavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type NavigationStackScreenComponent[Params, ScreenProps] = (ComponentType[NavigationStackScreenProps[Params, ScreenProps]]) with (NavigationOptions[Params, ScreenProps])
  
  @js.native
  trait NavigationStackScreenProps[Params, ScreenProps] extends StObject {
    
    var navigation: StackNavigationProp[NavigationRoute[NavigationParams], Params] = js.native
    
    var screenProps: ScreenProps = js.native
    
    var theme: SupportedThemes = js.native
  }
  object NavigationStackScreenProps {
    
    @scala.inline
    def apply[Params, ScreenProps](
      navigation: StackNavigationProp[NavigationRoute[NavigationParams], Params],
      screenProps: ScreenProps,
      theme: SupportedThemes
    ): NavigationStackScreenProps[Params, ScreenProps] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationStackScreenProps[Params, ScreenProps]]
    }
    
    @scala.inline
    implicit class NavigationStackScreenPropsMutableBuilder[Self <: NavigationStackScreenProps[_, _], Params, ScreenProps] (val x: Self with (NavigationStackScreenProps[Params, ScreenProps])) extends AnyVal {
      
      @scala.inline
      def setNavigation(value: StackNavigationProp[NavigationRoute[NavigationParams], Params]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
