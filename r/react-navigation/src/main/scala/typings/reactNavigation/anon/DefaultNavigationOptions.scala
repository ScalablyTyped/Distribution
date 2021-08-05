package typings.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import typings.reactNavigation.mod.NavigationScreenProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultNavigationOptions[Options, NavigationScreenPropType] extends StObject {
  
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, js.Any]] = js.undefined
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[js.Any], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      js.Any
    ]
  ] = js.undefined
}
object DefaultNavigationOptions {
  
  inline def apply[Options, NavigationScreenPropType](): DefaultNavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNavigationOptions[Options, NavigationScreenPropType]]
  }
  
  extension [Self <: DefaultNavigationOptions[?, ?], Options, NavigationScreenPropType](x: Self & (DefaultNavigationOptions[Options, NavigationScreenPropType])) {
    
    inline def setDefaultNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, js.Any]): Self = StObject.set(x, "defaultNavigationOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, js.Any]) & NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "defaultNavigationOptions", js.Any.fromFunction1(value))
    
    inline def setDefaultNavigationOptionsUndefined: Self = StObject.set(x, "defaultNavigationOptions", js.undefined)
    
    inline def setNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[js.Any], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          js.Any
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], js.Any]) & NavigationOptionsOptions[StringDictionary[js.Any]] => StringDictionary[js.Any]
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
