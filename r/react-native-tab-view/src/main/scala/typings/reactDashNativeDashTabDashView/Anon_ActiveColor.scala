package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.IndicatorProps
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.RouteBase
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveColor[T /* <: RouteBase */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var getAccessibilityLabel: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[String | Null]]] = js.undefined
  var getAccessible: js.UndefOr[js.Function1[/* scene */ Scene[T], Boolean]] = js.undefined
  var getLabelText: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[String | Null]]] = js.undefined
  var getTestID: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[String | Null]]] = js.undefined
  var inactiveColor: js.UndefOr[String] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.undefined
  var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.undefined
  var pressColor: js.UndefOr[String] = js.undefined
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
  var renderIndicator: js.UndefOr[js.Function1[/* props */ IndicatorProps[T], ReactNode]] = js.undefined
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object Anon_ActiveColor {
  @scala.inline
  def apply[T /* <: RouteBase */](
    activeColor: String = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    getAccessibilityLabel: /* scene */ Scene[T] => js.UndefOr[String | Null] = null,
    getAccessible: /* scene */ Scene[T] => Boolean = null,
    getLabelText: /* scene */ Scene[T] => js.UndefOr[String | Null] = null,
    getTestID: /* scene */ Scene[T] => js.UndefOr[String | Null] = null,
    inactiveColor: String = null,
    indicatorStyle: StyleProp[ViewStyle] = null,
    labelStyle: StyleProp[TextStyle] = null,
    onTabLongPress: /* scene */ Scene[T] => Unit = null,
    onTabPress: /* scene */ Scene[T] => Unit = null,
    pressColor: String = null,
    pressOpacity: Int | Double = null,
    renderBadge: /* scene */ Scene[T] => ReactNode = null,
    renderIcon: /* scene */ Scene[T] => ReactNode = null,
    renderIndicator: /* props */ IndicatorProps[T] => ReactNode = null,
    renderLabel: /* scene */ Scene[T] => ReactNode = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tabStyle: StyleProp[ViewStyle] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): Anon_ActiveColor[T] = {
    val __obj = js.Dynamic.literal()
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor)
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces)
    if (getAccessibilityLabel != null) __obj.updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1(getAccessibilityLabel))
    if (getAccessible != null) __obj.updateDynamic("getAccessible")(js.Any.fromFunction1(getAccessible))
    if (getLabelText != null) __obj.updateDynamic("getLabelText")(js.Any.fromFunction1(getLabelText))
    if (getTestID != null) __obj.updateDynamic("getTestID")(js.Any.fromFunction1(getTestID))
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onTabLongPress != null) __obj.updateDynamic("onTabLongPress")(js.Any.fromFunction1(onTabLongPress))
    if (onTabPress != null) __obj.updateDynamic("onTabPress")(js.Any.fromFunction1(onTabPress))
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor)
    if (pressOpacity != null) __obj.updateDynamic("pressOpacity")(pressOpacity.asInstanceOf[js.Any])
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction1(renderBadge))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1(renderIcon))
    if (renderIndicator != null) __obj.updateDynamic("renderIndicator")(js.Any.fromFunction1(renderIndicator))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[Anon_ActiveColor[T]]
  }
}

