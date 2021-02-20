package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions[Options, NavigationScreenPropType] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.native
}
object NavigationOptions {
  
  @scala.inline
  def apply[Options, NavigationScreenPropType](): NavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions[Options, NavigationScreenPropType]]
  }
  
  @scala.inline
  implicit class NavigationOptionsMutableBuilder[Self <: NavigationOptions[_, _], Options, NavigationScreenPropType] (val x: Self with (NavigationOptions[Options, NavigationScreenPropType])) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, _]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
