package typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcNavigatorsCreateMaterialBottomTabNavigatorMod

import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderIconProps extends js.Object {
  var focused: Boolean
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var route: NavigationRoute[_]
  var tintColor: js.UndefOr[String] = js.undefined
}

object RenderIconProps {
  @scala.inline
  def apply(
    focused: Boolean,
    route: NavigationRoute[_],
    horizontal: js.UndefOr[Boolean] = js.undefined,
    tintColor: String = null
  ): RenderIconProps = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderIconProps]
  }
}

