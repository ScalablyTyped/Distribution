package typings.reactDashNativeDashSafeDashAreaDashView

import typings.reactDashNativeDashSafeDashAreaDashView.reactDashNativeDashSafeDashAreaDashViewMod.SafeAreaViewForceInsetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[SafeAreaViewForceInsetValue] = js.undefined
  var horizontal: js.UndefOr[SafeAreaViewForceInsetValue] = js.undefined
  var left: js.UndefOr[SafeAreaViewForceInsetValue] = js.undefined
  var right: js.UndefOr[SafeAreaViewForceInsetValue] = js.undefined
  var top: js.UndefOr[SafeAreaViewForceInsetValue] = js.undefined
  var vertical: js.UndefOr[SafeAreaViewForceInsetValue] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: SafeAreaViewForceInsetValue = null,
    horizontal: SafeAreaViewForceInsetValue = null,
    left: SafeAreaViewForceInsetValue = null,
    right: SafeAreaViewForceInsetValue = null,
    top: SafeAreaViewForceInsetValue = null,
    vertical: SafeAreaViewForceInsetValue = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

