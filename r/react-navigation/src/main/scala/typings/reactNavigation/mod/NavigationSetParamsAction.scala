package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsAction
  extends NavigationStackAction
     with NavigationSetParamsActionPayload {
  var `type`: NavigationSlashSET_PARAMS
}

object NavigationSetParamsAction {
  @scala.inline
  def apply(key: String, `type`: NavigationSlashSET_PARAMS, params: NavigationParams = null): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
}

