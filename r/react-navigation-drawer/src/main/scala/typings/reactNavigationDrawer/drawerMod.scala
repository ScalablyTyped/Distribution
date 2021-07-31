package typings.reactNavigationDrawer

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentProps
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigationDrawer.anon.DrawerPostion
import typings.reactNavigationDrawer.anon.Progress
import typings.reactNavigationDrawer.anon.ReadonlyPanGestureHandler
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
  @js.native
  class default () extends Drawer
  /* static members */
  object default {
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", "default.defaultProps")
    @js.native
    def defaultProps: DrawerPostion = js.native
    @scala.inline
    def defaultProps_=(x: DrawerPostion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Drawer
    extends PureComponent[Props, js.Object, js.Any] {
    
    var clock: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawer(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawer(): Unit = js.native
    
    var containerWidth: js.Any = js.native
    
    var currentOpenValue: js.Any = js.native
    
    var dragX: js.Any = js.native
    
    var drawerOpacity: js.Any = js.native
    
    var drawerPosition: js.Any = js.native
    
    var drawerWidth: js.Any = js.native
    
    var gestureState: js.Any = js.native
    
    var gestureX: js.Any = js.native
    
    var handleContainerLayout: js.Any = js.native
    
    var handleDrawerLayout: js.Any = js.native
    
    var handleGestureEvent: js.Any = js.native
    
    var handleGestureStateChange: js.Any = js.native
    
    var handleTapStateChange: js.Any = js.native
    
    var isDrawerTypeFront: js.Any = js.native
    
    var isOpen: js.Any = js.native
    
    var isStatusBarHidden: js.Any = js.native
    
    var isSwiping: js.Any = js.native
    
    var manuallyTriggerSpring: js.Any = js.native
    
    var nextIsOpen: js.Any = js.native
    
    var offsetX: js.Any = js.native
    
    var pendingOpenValue: js.Any = js.native
    
    var position: js.Any = js.native
    
    var progress: js.Any = js.native
    
    var swipeDistanceThreshold: js.Any = js.native
    
    var swipeVelocityThreshold: js.Any = js.native
    
    var toggleDrawer: js.Any = js.native
    
    var toggleStatusBar: js.Any = js.native
    
    var touchDistanceFromDrawer: js.Any = js.native
    
    var touchX: js.Any = js.native
    
    var transitionTo: js.Any = js.native
    
    var translateX: js.Any = js.native
    
    var velocityX: js.Any = js.native
  }
  
  trait Props extends StObject {
    
    var drawerPosition: left | right
    
    var drawerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var drawerType: front | back | slide
    
    var gestureEnabled: Boolean
    
    var gestureHandlerProps: js.UndefOr[
        ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]
      ] = js.undefined
    
    var hideStatusBar: Boolean
    
    var keyboardDismissMode: none | `on-drag`
    
    def onClose(): Unit
    
    var onGestureRef: js.UndefOr[js.Function1[/* ref */ PanGestureHandler | Null, Unit]] = js.undefined
    
    def onOpen(): Unit
    
    var open: Boolean
    
    var overlayStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var renderDrawerContent: Renderer
    
    var renderSceneContent: Renderer
    
    var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var statusBarAnimation: slide | none | fade
    
    var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
    
    var swipeEdgeWidth: Double
    
    var swipeVelocityThreshold: Double
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
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerStyle(value: ViewStyle): Self = StObject.set(x, "drawerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerStyleUndefined: Self = StObject.set(x, "drawerStyle", js.undefined)
      
      @scala.inline
      def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureHandlerProps(value: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureHandlerPropsUndefined: Self = StObject.set(x, "gestureHandlerProps", js.undefined)
      
      @scala.inline
      def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnGestureRef(value: /* ref */ PanGestureHandler | Null => Unit): Self = StObject.set(x, "onGestureRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureRefUndefined: Self = StObject.set(x, "onGestureRef", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyle(value: ViewStyle): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setRenderDrawerContent(value: /* props */ Progress => ReactNode): Self = StObject.set(x, "renderDrawerContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSceneContent(value: /* props */ Progress => ReactNode): Self = StObject.set(x, "renderSceneContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSceneContainerStyle(value: ViewStyle): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
      
      @scala.inline
      def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeDistanceThreshold(value: Double): Self = StObject.set(x, "swipeDistanceThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeDistanceThresholdUndefined: Self = StObject.set(x, "swipeDistanceThreshold", js.undefined)
      
      @scala.inline
      def setSwipeEdgeWidth(value: Double): Self = StObject.set(x, "swipeEdgeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeVelocityThreshold(value: Double): Self = StObject.set(x, "swipeVelocityThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  type Renderer = js.Function1[/* props */ Progress, ReactNode]
}
