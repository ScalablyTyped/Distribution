package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.`Navigation/POP`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPopAction
  extends NavigationStackAction
     with NavigationPopActionPayload {
  var key: js.UndefOr[String] = js.undefined
  var `type`: `Navigation/POP`
}

object NavigationPopAction {
  @scala.inline
  def apply(
    `type`: `Navigation/POP`,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    n: Int | Double = null
  ): NavigationPopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (key != null) __obj.updateDynamic("key")(key)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPopAction]
  }
}

