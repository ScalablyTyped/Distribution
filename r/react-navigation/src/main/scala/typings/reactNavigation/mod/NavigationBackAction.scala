package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBackAction
  extends NavigationStackAction
     with NavigationBackActionPayload
     with NavigationTabAction {
  
  var `type`: NavigationSlashBACK = js.native
}
object NavigationBackAction {
  
  @scala.inline
  def apply(`type`: NavigationSlashBACK): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBackAction]
  }
  
  @scala.inline
  implicit class NavigationBackActionMutableBuilder[Self <: NavigationBackAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NavigationSlashBACK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
