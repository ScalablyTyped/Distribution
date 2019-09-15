package typings.reactDashNativeDashGestureDashHandler.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value
import typings.reactDashNative.reactDashNativeMod.StatusBarAnimation
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerLayoutProperties
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerLockMode
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerPosition
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerState
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerType
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerLayout
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.default].asInstanceOf[String | js.Object]
  def apply(
    renderNavigationView: Value => TagMod[Any],
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
  ): BuildingComponent[tag.type, default] = {
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
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerLayoutProperties
}

