package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue] = js.undefined
  var horizontal: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue] = js.undefined
  var left: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue] = js.undefined
  var right: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue] = js.undefined
  var top: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue] = js.undefined
  var vertical: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue = null,
    horizontal: reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue = null,
    left: reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue = null,
    right: reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue = null,
    top: reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue = null,
    vertical: reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewForceInsetValue = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[Anon_Bottom]
  }
}

