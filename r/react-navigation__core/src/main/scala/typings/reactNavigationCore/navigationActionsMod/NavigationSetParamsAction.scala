package typings.reactNavigationCore.navigationActionsMod

import typings.reactNavigationCore.reactNavigationCoreBooleans.`true`
import typings.reactNavigationCore.reactNavigationCoreStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsAction extends NavigationSetParamsActionPayload {
  var preserveFocus: `true`
  var `type`: NavigationSlashSET_PARAMS
}

object NavigationSetParamsAction {
  @scala.inline
  def apply(
    key: String,
    preserveFocus: `true`,
    `type`: NavigationSlashSET_PARAMS,
    params: NavigationParams = null
  ): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], preserveFocus = preserveFocus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
}

