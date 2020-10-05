package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationReplaceAction extends NavigationStackAction {
  var action: js.UndefOr[NavigationAction] = js.native
  var key: String = js.native
  var params: js.UndefOr[NavigationParams] = js.native
  var routeName: String = js.native
  var `type`: NavigationSlashREPLACE = js.native
}

object NavigationReplaceAction {
  @scala.inline
  def apply(key: String, routeName: String, `type`: NavigationSlashREPLACE): NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationReplaceAction]
  }
  @scala.inline
  implicit class NavigationReplaceActionOps[Self <: NavigationReplaceAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashREPLACE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: NavigationAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setParams(value: NavigationParams): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

