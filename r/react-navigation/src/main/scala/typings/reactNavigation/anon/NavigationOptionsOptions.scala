package typings.reactNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptionsOptions[Options] extends StObject {
  
  var navigationOptions: Options
}
object NavigationOptionsOptions {
  
  @scala.inline
  def apply[Options](navigationOptions: Options): NavigationOptionsOptions[Options] = {
    val __obj = js.Dynamic.literal(navigationOptions = navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptionsOptions[Options]]
  }
  
  @scala.inline
  implicit class NavigationOptionsOptionsMutableBuilder[Self <: NavigationOptionsOptions[?], Options] (val x: Self & NavigationOptionsOptions[Options]) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(value: Options): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
  }
}
