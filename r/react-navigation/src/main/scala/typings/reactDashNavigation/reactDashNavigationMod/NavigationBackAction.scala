package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/BACK`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackAction
  extends NavigationStackAction
     with NavigationBackActionPayload
     with NavigationTabAction {
  var `type`: `Navigation/BACK`
}

object NavigationBackAction {
  @scala.inline
  def apply(`type`: `Navigation/BACK`, immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationBackAction]
  }
}

