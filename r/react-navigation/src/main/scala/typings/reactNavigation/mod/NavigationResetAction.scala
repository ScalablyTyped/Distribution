package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationResetAction
  extends NavigationStackAction
     with NavigationResetActionPayload {
  
  var `type`: NavigationSlashRESET = js.native
}
object NavigationResetAction {
  
  @scala.inline
  def apply(actions: js.Array[NavigationNavigateAction], index: Double, `type`: NavigationSlashRESET): NavigationResetAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResetAction]
  }
  
  @scala.inline
  implicit class NavigationResetActionMutableBuilder[Self <: NavigationResetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashRESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
