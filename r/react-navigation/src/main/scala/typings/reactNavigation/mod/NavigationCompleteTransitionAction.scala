package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationCompleteTransitionAction extends NavigationStackAction {
  var key: String = js.native
  var `type`: NavigationSlashCOMPLETE_TRANSITION = js.native
}

object NavigationCompleteTransitionAction {
  @scala.inline
  def apply(key: String, `type`: NavigationSlashCOMPLETE_TRANSITION): NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCompleteTransitionAction]
  }
  @scala.inline
  implicit class NavigationCompleteTransitionActionOps[Self <: NavigationCompleteTransitionAction] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NavigationSlashCOMPLETE_TRANSITION): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

