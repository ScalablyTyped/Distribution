package typings.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialRouteName extends js.Object {
  var initialRouteName: js.UndefOr[String] = js.undefined
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object AnonInitialRouteName {
  @scala.inline
  def apply(
    initialRouteName: String = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): AnonInitialRouteName = {
    val __obj = js.Dynamic.literal()
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialRouteName]
  }
}

