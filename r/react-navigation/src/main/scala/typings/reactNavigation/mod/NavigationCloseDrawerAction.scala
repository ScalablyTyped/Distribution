package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashCLOSE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationCloseDrawerAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.native
  var `type`: NavigationSlashCLOSE_DRAWER = js.native
}

object NavigationCloseDrawerAction {
  @scala.inline
  def apply(`type`: NavigationSlashCLOSE_DRAWER): NavigationCloseDrawerAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCloseDrawerAction]
  }
  @scala.inline
  implicit class NavigationCloseDrawerActionOps[Self <: NavigationCloseDrawerAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashCLOSE_DRAWER): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

