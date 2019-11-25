package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/COMPLETE_TRANSITION`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationCompleteTransitionAction extends NavigationStackAction {
  var key: String
  var `type`: `Navigation/COMPLETE_TRANSITION`
}

object NavigationCompleteTransitionAction {
  @scala.inline
  def apply(key: String, `type`: `Navigation/COMPLETE_TRANSITION`): NavigationCompleteTransitionAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationCompleteTransitionAction]
  }
}

