package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationNavigateAction
  extends NavigationStackAction
     with NavigationNavigateActionPayload
     with NavigationTabAction {
  
  var `type`: NavigationSlashNAVIGATE = js.native
}
object NavigationNavigateAction {
  
  @scala.inline
  def apply(routeName: String, `type`: NavigationSlashNAVIGATE): NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigateAction]
  }
  
  @scala.inline
  implicit class NavigationNavigateActionMutableBuilder[Self <: NavigationNavigateAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashNAVIGATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
