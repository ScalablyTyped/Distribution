package typings.reactNavigationDrawer.drawerMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigationDrawer.anon.Progress
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var drawerPosition: left | right = js.native
  var drawerStyle: js.UndefOr[ViewStyle] = js.native
  var drawerType: front | back | slide = js.native
  var gestureEnabled: Boolean = js.native
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.native
  var hideStatusBar: Boolean = js.native
  var keyboardDismissMode: none | `on-drag` = js.native
  var onGestureRef: js.UndefOr[js.Function1[/* ref */ PanGestureHandler | Null, Unit]] = js.native
  var open: Boolean = js.native
  var overlayStyle: js.UndefOr[ViewStyle] = js.native
  var renderDrawerContent: Renderer = js.native
  var renderSceneContent: Renderer = js.native
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.native
  var statusBarAnimation: slide | none | fade = js.native
  var swipeDistanceThreshold: js.UndefOr[Double] = js.native
  var swipeEdgeWidth: Double = js.native
  var swipeVelocityThreshold: Double = js.native
  def onClose(): Unit = js.native
  def onOpen(): Unit = js.native
}

object Props {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    gestureEnabled: Boolean,
    hideStatusBar: Boolean,
    keyboardDismissMode: none | `on-drag`,
    onClose: () => Unit,
    onOpen: () => Unit,
    open: Boolean,
    renderDrawerContent: /* props */ Progress => ReactNode,
    renderSceneContent: /* props */ Progress => ReactNode,
    statusBarAnimation: slide | none | fade,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double
  ): Props = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), open = open.asInstanceOf[js.Any], renderDrawerContent = js.Any.fromFunction1(renderDrawerContent), renderSceneContent = js.Any.fromFunction1(renderSceneContent), statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setGestureEnabled(value: Boolean): Self = this.set("gestureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = this.set("hideStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDismissMode(value: none | `on-drag`): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderDrawerContent(value: /* props */ Progress => ReactNode): Self = this.set("renderDrawerContent", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderSceneContent(value: /* props */ Progress => ReactNode): Self = this.set("renderSceneContent", js.Any.fromFunction1(value))
    @scala.inline
    def setStatusBarAnimation(value: slide | none | fade): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeEdgeWidth(value: Double): Self = this.set("swipeEdgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeVelocityThreshold(value: Double): Self = this.set("swipeVelocityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerStyle(value: ViewStyle): Self = this.set("drawerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerStyle: Self = this.set("drawerStyle", js.undefined)
    @scala.inline
    def setGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self = this.set("gestureHandlerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureHandlerProps: Self = this.set("gestureHandlerProps", js.undefined)
    @scala.inline
    def setOnGestureRef(value: /* ref */ PanGestureHandler | Null => Unit): Self = this.set("onGestureRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGestureRef: Self = this.set("onGestureRef", js.undefined)
    @scala.inline
    def setOverlayStyle(value: ViewStyle): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setSceneContainerStyle(value: ViewStyle): Self = this.set("sceneContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSceneContainerStyle: Self = this.set("sceneContainerStyle", js.undefined)
    @scala.inline
    def setSwipeDistanceThreshold(value: Double): Self = this.set("swipeDistanceThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDistanceThreshold: Self = this.set("swipeDistanceThreshold", js.undefined)
  }
  
}

