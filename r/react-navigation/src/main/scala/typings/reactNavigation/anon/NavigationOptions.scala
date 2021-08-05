package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions[Options, NavigationScreenPropType] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, js.Any]] = js.undefined
}
object NavigationOptions {
  
  inline def apply[Options, NavigationScreenPropType](): NavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions[Options, NavigationScreenPropType]]
  }
  
  extension [Self <: NavigationOptions[?, ?], Options, NavigationScreenPropType](x: Self & (NavigationOptions[Options, NavigationScreenPropType])) {
    
    inline def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, js.Any]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, js.Any]) & NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
