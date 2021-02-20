package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPopAction
  extends NavigationStackAction
     with NavigationPopActionPayload {
  
  var `type`: NavigationSlashPOP = js.native
}
object NavigationPopAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashPOP): NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopAction]
  }
  
  @scala.inline
  implicit class NavigationPopActionMutableBuilder[Self <: NavigationPopAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashPOP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
