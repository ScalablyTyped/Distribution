package typings.reactDashNavigation

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBackgroundColor extends js.Object {
  var activeBackgroundColor: js.UndefOr[String] = js.undefined
  var activeTintColor: js.UndefOr[String] = js.undefined
  var inactiveBackgroundColor: js.UndefOr[String] = js.undefined
  var inactiveTintColor: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object Anon_ActiveBackgroundColor {
  @scala.inline
  def apply(
    activeBackgroundColor: String = null,
    activeTintColor: String = null,
    inactiveBackgroundColor: String = null,
    inactiveTintColor: String = null,
    labelStyle: StyleProp[TextStyle] = null,
    style: StyleProp[ViewStyle] = null
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

