package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.mod.NavigationInitAction
  - typings.reactNavigation.mod.NavigationNavigateAction
  - typings.reactNavigation.mod.NavigationBackAction
*/
trait NavigationTabAction
  extends StObject
     with _NavigationAction
object NavigationTabAction {
  
  @scala.inline
  def NavigationBackAction(): typings.reactNavigation.mod.NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/BACK")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationBackAction]
  }
  
  @scala.inline
  def NavigationInitAction(): typings.reactNavigation.mod.NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Navigation/INIT")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationInitAction]
  }
  
  @scala.inline
  def NavigationNavigateAction(routeName: String): typings.reactNavigation.mod.NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Navigation/NAVIGATE")
    __obj.asInstanceOf[typings.reactNavigation.mod.NavigationNavigateAction]
  }
}
