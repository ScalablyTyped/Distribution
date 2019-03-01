package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsAction
  extends NavigationStackAction
     with NavigationSetParamsActionPayload {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/SET_PARAMS`
}

object NavigationSetParamsAction {
  @scala.inline
  def apply(
    key: java.lang.String,
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/SET_PARAMS`,
    params: NavigationParams = null
  ): NavigationSetParamsAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationSetParamsAction]
  }
}

