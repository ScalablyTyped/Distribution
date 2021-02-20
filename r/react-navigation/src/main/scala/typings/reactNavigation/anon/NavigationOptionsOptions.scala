package typings.reactNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptionsOptions[Options] extends StObject {
  
  var navigationOptions: Options = js.native
}
object NavigationOptionsOptions {
  
  @scala.inline
  def apply[Options](navigationOptions: Options): NavigationOptionsOptions[Options] = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptionsOptions[Options]]
  }
  
  @scala.inline
  implicit class NavigationOptionsOptionsMutableBuilder[Self <: NavigationOptionsOptions[_], Options] (val x: Self with NavigationOptionsOptions[Options]) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(value: Options): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
  }
}
