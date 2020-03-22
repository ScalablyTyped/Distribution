package typings.reactNavigationDrawer

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
import typings.reactNavigationDrawer.typesMod.DrawerContentComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-drawer.react-navigation-drawer/lib/typescript/src/views/DrawerView.DrawerOptions & {  contentComponent ? :react.react.ComponentType<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.DrawerContentComponentProps>,   unmountInactiveRoutes ? :boolean,   contentOptions ? :object} */
trait DrawerOptionscontentCompo extends js.Object {
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
  var drawerPosition: left | right
  var drawerType: front | back | slide
  var drawerWidth: Double | js.Function0[Double]
  var edgeWidth: Double
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[`on-drag` | none] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  var statusBarAnimation: slide | none | fade
  var style: js.UndefOr[ViewStyle] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object DrawerOptionscontentCompo {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    drawerWidth: Double | js.Function0[Double],
    edgeWidth: Double,
    statusBarAnimation: slide | none | fade,
    contentComponent: ComponentType[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    drawerBackgroundColor: String = null,
    drawerLockMode: unlocked | `locked-closed` | `locked-open` = null,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = null,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: `on-drag` | none = null,
    minSwipeDistance: Int | Double = null,
    onDrawerClose: () => Unit = null,
    onDrawerOpen: () => Unit = null,
    overlayColor: String = null,
    sceneContainerStyle: ViewStyle = null,
    style: ViewStyle = null,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): DrawerOptionscontentCompo = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (gestureHandlerProps != null) __obj.updateDynamic("gestureHandlerProps")(gestureHandlerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (minSwipeDistance != null) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.asInstanceOf[js.Any])
    if (onDrawerClose != null) __obj.updateDynamic("onDrawerClose")(js.Any.fromFunction0(onDrawerClose))
    if (onDrawerOpen != null) __obj.updateDynamic("onDrawerOpen")(js.Any.fromFunction0(onDrawerOpen))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptionscontentCompo]
  }
}

