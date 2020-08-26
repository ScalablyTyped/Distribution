package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class NavigationNavigateActionOps[Self <: NavigationNavigateAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashNAVIGATE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

