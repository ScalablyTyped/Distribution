package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashPOP_TO_TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopToTopAction
  extends NavigationStackAction
     with NavigationPopToTopActionPayload {
  var `type`: NavigationSlashPOP_TO_TOP
}

object NavigationPopToTopAction {
  @scala.inline
  def apply(
    `type`: NavigationSlashPOP_TO_TOP,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String = null
  ): NavigationPopToTopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopToTopAction]
  }
}

