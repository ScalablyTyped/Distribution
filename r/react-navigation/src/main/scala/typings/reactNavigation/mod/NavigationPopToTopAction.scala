package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
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
  implicit class NavigationPopToTopActionOps[Self <: NavigationPopToTopAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: NavigationSlashPOP_TO_TOP): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
