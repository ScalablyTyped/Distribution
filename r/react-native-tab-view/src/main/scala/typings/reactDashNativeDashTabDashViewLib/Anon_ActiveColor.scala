package typings
package reactDashNativeDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveColor[T /* <: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.RouteBase */] extends js.Object {
  var activeColor: js.UndefOr[java.lang.String] = js.undefined
  var bounces: js.UndefOr[scala.Boolean] = js.undefined
  var getAccessibilityLabel: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      js.UndefOr[java.lang.String | scala.Null]
    ]
  ] = js.undefined
  var getAccessible: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      scala.Boolean
    ]
  ] = js.undefined
  var getLabelText: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      js.UndefOr[java.lang.String | scala.Null]
    ]
  ] = js.undefined
  var getTestID: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      js.UndefOr[java.lang.String | scala.Null]
    ]
  ] = js.undefined
  var inactiveColor: js.UndefOr[java.lang.String] = js.undefined
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var labelStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var onTabLongPress: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      scala.Unit
    ]
  ] = js.undefined
  var onTabPress: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      scala.Unit
    ]
  ] = js.undefined
  var pressColor: js.UndefOr[java.lang.String] = js.undefined
  var pressOpacity: js.UndefOr[scala.Double] = js.undefined
  var renderBadge: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var renderIcon: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var renderIndicator: js.UndefOr[
    js.Function1[
      /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.IndicatorProps[T], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var renderLabel: js.UndefOr[
    js.Function1[
      /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var tabStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ActiveColor {
  @scala.inline
  def apply[T /* <: reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.RouteBase */](
    activeColor: java.lang.String = null,
    bounces: js.UndefOr[scala.Boolean] = js.undefined,
    getAccessibilityLabel: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => js.UndefOr[java.lang.String | scala.Null] = null,
    getAccessible: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => scala.Boolean = null,
    getLabelText: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => js.UndefOr[java.lang.String | scala.Null] = null,
    getTestID: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => js.UndefOr[java.lang.String | scala.Null] = null,
    inactiveColor: java.lang.String = null,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    labelStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    onTabLongPress: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => scala.Unit = null,
    onTabPress: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => scala.Unit = null,
    pressColor: java.lang.String = null,
    pressOpacity: scala.Int | scala.Double = null,
    renderBadge: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => reactLib.reactMod.ReactNode = null,
    renderIcon: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => reactLib.reactMod.ReactNode = null,
    renderIndicator: /* props */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.IndicatorProps[T] => reactLib.reactMod.ReactNode = null,
    renderLabel: /* scene */ reactDashNativeDashTabDashViewLib.reactDashNativeDashTabDashViewMod.Scene[T] => reactLib.reactMod.ReactNode = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
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

