package typings.reactNavigationDrawer.drawerViewMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerOptions extends js.Object {
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.native
  var drawerPosition: left | right = js.native
  var drawerType: front | back | slide = js.native
  var drawerWidth: Double | js.Function0[Double] = js.native
  var edgeWidth: Double = js.native
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.native
  var hideStatusBar: js.UndefOr[Boolean] = js.native
  var keyboardDismissMode: js.UndefOr[`on-drag` | none] = js.native
  var minSwipeDistance: js.UndefOr[Double] = js.native
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var overlayColor: js.UndefOr[String] = js.native
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.native
  var statusBarAnimation: slide | none | fade = js.native
  var style: js.UndefOr[ViewStyle] = js.native
}

object DrawerOptions {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    drawerWidth: Double | js.Function0[Double],
    edgeWidth: Double,
    statusBarAnimation: slide | none | fade
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptions]
  }
  @scala.inline
  implicit class DrawerOptionsOps[Self <: DrawerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrawerPosition(value: left | right): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerType(value: front | back | slide): Self = this.set("drawerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerWidthFunction0(value: () => Double): Self = this.set("drawerWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setDrawerWidth(value: Double | js.Function0[Double]): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusBarAnimation(value: slide | none | fade): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerBackgroundColor(value: String): Self = this.set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerBackgroundColor: Self = this.set("drawerBackgroundColor", js.undefined)
    @scala.inline
    def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = this.set("drawerLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerLockMode: Self = this.set("drawerLockMode", js.undefined)
    @scala.inline
    def setGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self = this.set("gestureHandlerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureHandlerProps: Self = this.set("gestureHandlerProps", js.undefined)
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = this.set("hideStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideStatusBar: Self = this.set("hideStatusBar", js.undefined)
    @scala.inline
    def setKeyboardDismissMode(value: `on-drag` | none): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    @scala.inline
    def setMinSwipeDistance(value: Double): Self = this.set("minSwipeDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSwipeDistance: Self = this.set("minSwipeDistance", js.undefined)
    @scala.inline
    def setOnDrawerClose(value: () => Unit): Self = this.set("onDrawerClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrawerClose: Self = this.set("onDrawerClose", js.undefined)
    @scala.inline
    def setOnDrawerOpen(value: () => Unit): Self = this.set("onDrawerOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDrawerOpen: Self = this.set("onDrawerOpen", js.undefined)
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    @scala.inline
    def setSceneContainerStyle(value: ViewStyle): Self = this.set("sceneContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSceneContainerStyle: Self = this.set("sceneContainerStyle", js.undefined)
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

