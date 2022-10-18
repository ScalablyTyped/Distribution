package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import typings.reactNavigation.mod.NavigationSwitchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[Params, ScreenProps] extends StObject {
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}
object `2` {
  
  inline def apply[Params, ScreenProps](): `2`[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[Params, ScreenProps]]
  }
  
  extension [Self <: `2`[?, ?], Params, ScreenProps](x: Self & (`2`[Params, ScreenProps])) {
    
    inline def setNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], Params], ScreenProps]) & NavigationOptionsOptions[js.Object] => js.Object
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
