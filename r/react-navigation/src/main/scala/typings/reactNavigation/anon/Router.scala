package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationRouter
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Router[Options, NavigationPropType] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, Any]] = js.undefined
  
  var router: NavigationRouter[Options, js.Object]
}
object Router {
  
  inline def apply[Options, NavigationPropType](router: NavigationRouter[Options, js.Object]): Router[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router[Options, NavigationPropType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Router[?, ?], Options, NavigationPropType] (val x: Self & (Router[Options, NavigationPropType])) extends AnyVal {
    
    inline def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationPropType, Any]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationPropType, Any]) & NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    inline def setRouter(value: NavigationRouter[Options, js.Object]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
