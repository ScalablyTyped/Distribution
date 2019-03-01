package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCompleteTransitionAction extends NavigationStackAction {
  var key: java.lang.String
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/COMPLETE_TRANSITION`
}

object NavigationCompleteTransitionAction {
  @scala.inline
  def apply(
    key: java.lang.String,
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/COMPLETE_TRANSITION`
  ): NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationCompleteTransitionAction]
  }
}

