package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationRouter
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router[Options, NavigationPropType] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, _]] = js.native
  
  var router: NavigationRouter[Options, js.Object] = js.native
}
object Router {
  
  @scala.inline
  def apply[Options, NavigationPropType](router: NavigationRouter[Options, js.Object]): Router[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router[Options, NavigationPropType]]
  }
  
  @scala.inline
  implicit class RouterMutableBuilder[Self <: Router[_, _], Options, NavigationPropType] (val x: Self with (Router[Options, NavigationPropType])) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationPropType, _]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    @scala.inline
    def setRouter(value: NavigationRouter[Options, js.Object]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
