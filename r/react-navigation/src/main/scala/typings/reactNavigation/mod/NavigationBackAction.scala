package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashBACK
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
  def apply(
    `type`: NavigationSlashBACK,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Null | String] = js.undefined
  ): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBackAction]
  }
}

