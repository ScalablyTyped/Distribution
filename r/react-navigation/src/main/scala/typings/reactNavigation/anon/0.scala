package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import typings.reactNavigation.mod.NavigationSwitchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[Params, ScreenProps] extends StObject {
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}
object `0` {
  
  @scala.inline
  def apply[Params, ScreenProps](): `0`[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Params, ScreenProps]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[?, ?], Params, ScreenProps] (val x: Self & (`0`[Params, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], Params], ScreenProps]) & NavigationOptionsOptions[js.Object] => js.Object
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
