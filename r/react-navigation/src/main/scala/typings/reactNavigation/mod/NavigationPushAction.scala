package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPushAction extends NavigationStackAction {
  var action: js.UndefOr[NavigationNavigateAction] = js.native
  var key: js.UndefOr[String] = js.native
  var params: js.UndefOr[NavigationParams] = js.native
  var routeName: String = js.native
  var `type`: NavigationSlashPUSH = js.native
}

object NavigationPushAction {
  @scala.inline
  def apply(routeName: String, `type`: NavigationSlashPUSH): NavigationPushAction = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPushAction]
  }
  @scala.inline
  implicit class NavigationPushActionOps[Self <: NavigationPushAction] (val x: Self) extends AnyVal {
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
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NavigationSlashPUSH): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: NavigationNavigateAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setParams(value: NavigationParams): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

