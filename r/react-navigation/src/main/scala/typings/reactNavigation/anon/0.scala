package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[Options, NavigationScreenPropType] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, Any]] = js.undefined
}
object `0` {
  
  inline def apply[Options, NavigationScreenPropType](): `0`[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[Options, NavigationScreenPropType]]
  }
  
  extension [Self <: `0`[?, ?], Options, NavigationScreenPropType](x: Self & (`0`[Options, NavigationScreenPropType])) {
    
    inline def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, Any]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, Any]) & NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
