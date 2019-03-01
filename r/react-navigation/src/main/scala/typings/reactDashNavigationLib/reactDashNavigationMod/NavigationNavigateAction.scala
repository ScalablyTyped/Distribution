package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationNavigateAction
  extends NavigationStackAction
     with NavigationNavigateActionPayload
     with NavigationTabAction {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/NAVIGATE`
}

object NavigationNavigateAction {
  @scala.inline
  def apply(
    routeName: java.lang.String,
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/NAVIGATE`,
    action: NavigationNavigateAction = null,
    key: java.lang.String = null,
    params: NavigationParams = null
  ): NavigationNavigateAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("routeName")(routeName)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationNavigateAction]
  }
}

