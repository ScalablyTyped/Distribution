package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNavigation.mod._NavigationAction because Already inherited */ @js.native
trait NavigationInitAction
  extends NavigationStackAction
     with NavigationInitActionPayload
     with NavigationTabAction {
  var key: js.UndefOr[String] = js.native
  var `type`: NavigationSlashINIT = js.native
}

object NavigationInitAction {
  @scala.inline
  def apply(`type`: NavigationSlashINIT): NavigationInitAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInitAction]
  }
  @scala.inline
  implicit class NavigationInitActionOps[Self <: NavigationInitAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashINIT): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

