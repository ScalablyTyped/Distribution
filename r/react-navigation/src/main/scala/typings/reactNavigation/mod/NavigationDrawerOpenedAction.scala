package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_OPENED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawerOpenedAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.native
  var `type`: NavigationSlashDRAWER_OPENED = js.native
}

object NavigationDrawerOpenedAction {
  @scala.inline
  def apply(`type`: NavigationSlashDRAWER_OPENED): NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerOpenedAction]
  }
  @scala.inline
  implicit class NavigationDrawerOpenedActionOps[Self <: NavigationDrawerOpenedAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashDRAWER_OPENED): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

