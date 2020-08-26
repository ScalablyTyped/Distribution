package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class NavigationResetActionOps[Self <: NavigationResetAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashRESET): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

