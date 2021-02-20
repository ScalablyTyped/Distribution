package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPopToTopAction
  extends NavigationStackAction
     with NavigationPopToTopActionPayload {
  
  var `type`: NavigationSlashPOP_TO_TOP = js.native
}
object NavigationPopToTopAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashPOP_TO_TOP): NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopToTopAction]
  }
  
  @scala.inline
  implicit class NavigationPopToTopActionMutableBuilder[Self <: NavigationPopToTopAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashPOP_TO_TOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
