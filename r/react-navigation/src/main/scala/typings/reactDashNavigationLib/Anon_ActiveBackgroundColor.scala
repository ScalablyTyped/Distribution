package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBackgroundColor extends js.Object {
  var activeBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var activeTintColor: js.UndefOr[java.lang.String] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var inactiveTintColor: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object Anon_ActiveBackgroundColor {
  @scala.inline
  def apply(
    activeBackgroundColor: java.lang.String = null,
    activeTintColor: java.lang.String = null,
    inactiveBackgroundColor: java.lang.String = null,
    inactiveTintColor: java.lang.String = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): Anon_ActiveBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (activeBackgroundColor != null) __obj.updateDynamic("activeBackgroundColor")(activeBackgroundColor)
    if (activeTintColor != null) __obj.updateDynamic("activeTintColor")(activeTintColor)
    if (inactiveBackgroundColor != null) __obj.updateDynamic("inactiveBackgroundColor")(inactiveBackgroundColor)
    if (inactiveTintColor != null) __obj.updateDynamic("inactiveTintColor")(inactiveTintColor)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveBackgroundColor]
  }
}

