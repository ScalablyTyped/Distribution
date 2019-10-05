package typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNative.reactDashNativeMod.StatusBarAnimation
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerLayoutProperties extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
  var drawerType: js.UndefOr[DrawerType] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[DrawerKeyboardDismissMode] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerStateChanged: js.UndefOr[js.Function2[/* newState */ DrawerState, /* drawerWillShow */ Boolean, Unit]] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var statusBarAnimation: js.UndefOr[StatusBarAnimation] = js.undefined
  var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  def renderNavigationView(progressAnimatedValue: Value): ReactNode
}

object DrawerLayoutProperties {
  @scala.inline
  def apply(
    renderNavigationView: Value => ReactNode,
    containerStyle: StyleProp[ViewStyle] = null,
    drawerBackgroundColor: String = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: DrawerPosition = null,
    drawerType: DrawerType = null,
    drawerWidth: Int | Double = null,
    edgeWidth: Int | Double = null,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: DrawerKeyboardDismissMode = null,
    minSwipeDistance: Int | Double = null,
    onDrawerClose: () => Unit = null,
    onDrawerOpen: () => Unit = null,
    onDrawerStateChanged: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit = null,
    overlayColor: String = null,
    statusBarAnimation: StatusBarAnimation = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  ): DrawerLayoutProperties = {
    val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor)
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode)
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition)
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType)
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar)
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode)
    if (minSwipeDistance != null) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.asInstanceOf[js.Any])
    if (onDrawerClose != null) __obj.updateDynamic("onDrawerClose")(js.Any.fromFunction0(onDrawerClose))
    if (onDrawerOpen != null) __obj.updateDynamic("onDrawerOpen")(js.Any.fromFunction0(onDrawerOpen))
    if (onDrawerStateChanged != null) __obj.updateDynamic("onDrawerStateChanged")(js.Any.fromFunction2(onDrawerStateChanged))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor)
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation)
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations)
    __obj.asInstanceOf[DrawerLayoutProperties]
  }
}

