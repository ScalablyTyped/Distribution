package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationSetParamsAction
  extends NavigationStackAction
     with NavigationSetParamsActionPayload {
  var `type`: NavigationSlashSET_PARAMS = js.native
}

object NavigationSetParamsAction {
  @scala.inline
  def apply(key: String, params: NavigationParams, `type`: NavigationSlashSET_PARAMS): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
  @scala.inline
  implicit class NavigationSetParamsActionOps[Self <: NavigationSetParamsAction] (val x: Self) extends AnyVal {
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
    def setType(value: NavigationSlashSET_PARAMS): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

