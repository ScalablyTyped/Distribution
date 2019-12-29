package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashBACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackAction
  extends NavigationStackAction
     with NavigationBackActionPayload
     with NavigationTabAction {
  var `type`: NavigationSlashBACK
}

object NavigationBackAction {
  @scala.inline
  def apply(`type`: NavigationSlashBACK, immediate: js.UndefOr[Boolean] = js.undefined, key: String = null): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBackAction]
  }
}

