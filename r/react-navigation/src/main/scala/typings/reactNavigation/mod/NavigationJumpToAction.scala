package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashJUMP_TO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationJumpToAction extends js.Object {
  var key: String = js.native
  var preserveFocus: js.UndefOr[Boolean] = js.native
  var routeName: String = js.native
  var `type`: NavigationSlashJUMP_TO = js.native
}

object NavigationJumpToAction {
  @scala.inline
  def apply(key: String, routeName: String, `type`: NavigationSlashJUMP_TO): NavigationJumpToAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToAction]
  }
  @scala.inline
  implicit class NavigationJumpToActionOps[Self <: NavigationJumpToAction] (val x: Self) extends AnyVal {
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
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NavigationSlashJUMP_TO): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = this.set("preserveFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveFocus: Self = this.set("preserveFocus", js.undefined)
  }
  
}

