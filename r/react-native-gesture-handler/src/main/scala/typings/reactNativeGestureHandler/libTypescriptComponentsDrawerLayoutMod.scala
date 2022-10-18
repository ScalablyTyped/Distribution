package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StatusBarAnimation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDrawerLayoutMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/DrawerLayout", JSImport.Default)
  @js.native
  open class default protected () extends DrawerLayout {
    def this(props: DrawerLayoutProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/DrawerLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/DrawerLayout", "default.defaultProps")
    @js.native
    def defaultProps: typings.reactNativeGestureHandler.anon.DrawerLockMode = js.native
    inline def defaultProps_=(x: typings.reactNativeGestureHandler.anon.DrawerLockMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/DrawerLayout", "default.positions")
    @js.native
    def positions: Left = js.native
    inline def positions_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positions")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag`
  */
  trait DrawerKeyboardDismissMode extends StObject
  object DrawerKeyboardDismissMode {
    
    inline def none: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none = "none".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none]
    
    inline def `on-drag`: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag` = "on-drag".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag`]
  }
  
  @js.native
  trait DrawerLayout extends Component[DrawerLayoutProps, DrawerLayoutState, Any] {
    
    /* private */ var accessibilityIsModalView: Any = js.native
    
    /* private */ var animateDrawer: Any = js.native
    
    def closeDrawer(): Unit = js.native
    def closeDrawer(options: DrawerMovementOption): Unit = js.native
    
    /* private */ var drawerShown: Any = js.native
    
    /* private */ var emitStateChanged: Any = js.native
    
    /* private */ var handleContainerLayout: Any = js.native
    
    /* private */ var handleRelease: Any = js.native
    
    /* private */ var onGestureEvent: Any = js.native
    
    /* private */ var onTapHandlerStateChange: Any = js.native
    
    def openDrawer(): Unit = js.native
    def openDrawer(options: DrawerMovementOption): Unit = js.native
    
    /* private */ var openValue: Any = js.native
    
    /* private */ var openingHandlerStateChange: Any = js.native
    
    /* private */ var panGestureHandler: Any = js.native
    
    /* private */ var pointerEventsView: Any = js.native
    
    /* private */ var renderDrawer: Any = js.native
    
    /* private */ var renderOverlay: Any = js.native
    
    /* private */ var setPanGestureRef: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDrawerLayout(props: DrawerLayoutProps, state: DrawerLayoutState): Boolean = js.native
    
    /* private */ var updateAnimatedEvent: Any = js.native
    
    /* private */ var updateShowing: Any = js.native
  }
  
  trait DrawerLayoutProps extends StObject {
    
    var children: js.UndefOr[
        ReactNode | (js.Function1[/* openValue */ js.UndefOr[AnimatedInterpolation[Double | String]], ReactNode])
      ] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var drawerBackgroundColor: js.UndefOr[String] = js.undefined
    
    var drawerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
    
    var drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
    
    var drawerType: js.UndefOr[DrawerType] = js.undefined
    
    var drawerWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines how far from the edge of the content view the gesture should
      * activate.
      */
    var edgeWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Enables two-finger gestures on supported devices, for example iPads with
      * trackpads. If not enabled the gesture will require click + drag, with
      * `enableTrackpadTwoFingerGesture` swiping with two fingers will also trigger
      * the gesture.
      */
    var enableTrackpadTwoFingerGesture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true Drawer component will use
      * {@link https://reactnative.dev/docs/statusbar StatusBar} API to hide the OS
      * status bar whenever the drawer is pulled or when its in an "open" state.
      */
    var hideStatusBar: js.UndefOr[Boolean] = js.undefined
    
    var keyboardDismissMode: js.UndefOr[DrawerKeyboardDismissMode] = js.undefined
    
    var minSwipeDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Called when the drawer is closed.
      */
    var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when the drawer is opened.
      */
    var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDrawerSlide: js.UndefOr[js.Function1[/* position */ Double, Unit]] = js.undefined
    
    /**
      * Called when the status of the drawer changes.
      */
    var onDrawerStateChanged: js.UndefOr[js.Function2[/* newState */ DrawerState, /* drawerWillShow */ Boolean, Unit]] = js.undefined
    
    var onGestureRef: js.UndefOr[js.Function1[/* ref */ PanGestureHandler, Unit]] = js.undefined
    
    /**
      * @default black
      *
      * Color of a semi-transparent overlay to be displayed on top of the content
      * view when drawer gets open. A solid color should be used as the opacity is
      * added by the Drawer itself and the opacity of the overlay is animated (from
      * 0% to 70%).
      */
    var overlayColor: js.UndefOr[String] = js.undefined
    
    /**
      * This attribute is present in the standard implementation already and is one
      * of the required params. Gesture handler version of DrawerLayout make it
      * possible for the function passed as `renderNavigationView` to take an
      * Animated value as a parameter that indicates the progress of drawer
      * opening/closing animation (progress value is 0 when closed and 1 when
      * opened). This can be used by the drawer component to animated its children
      * while the drawer is opening or closing.
      */
    def renderNavigationView(progressAnimatedValue: Value): ReactNode
    
    /**
      * @default 'slide'
      *
      * Can be used when hideStatusBar is set to true and will select the animation
      * used for hiding/showing the status bar. See
      * {@link https://reactnative.dev/docs/statusbar StatusBar} documentation for
      * more details
      */
    var statusBarAnimation: js.UndefOr[StatusBarAnimation] = js.undefined
    
    var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerLayoutProps {
    
    inline def apply(renderNavigationView: Value => ReactNode): DrawerLayoutProps = {
      val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
      __obj.asInstanceOf[DrawerLayoutProps]
    }
    
    extension [Self <: DrawerLayoutProps](x: Self) {
      
      inline def setChildren(
        value: ReactNode | (js.Function1[/* openValue */ js.UndefOr[AnimatedInterpolation[Double | String]], ReactNode])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* openValue */ js.UndefOr[AnimatedInterpolation[Double | String]] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      inline def setDrawerContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "drawerContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setDrawerContainerStyleNull: Self = StObject.set(x, "drawerContainerStyle", null)
      
      inline def setDrawerContainerStyleUndefined: Self = StObject.set(x, "drawerContainerStyle", js.undefined)
      
      inline def setDrawerLockMode(value: DrawerLockMode): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      inline def setDrawerPosition(value: DrawerPosition): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      inline def setDrawerPositionUndefined: Self = StObject.set(x, "drawerPosition", js.undefined)
      
      inline def setDrawerType(value: DrawerType): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      inline def setDrawerTypeUndefined: Self = StObject.set(x, "drawerType", js.undefined)
      
      inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
      
      inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
      
      inline def setEdgeWidthUndefined: Self = StObject.set(x, "edgeWidth", js.undefined)
      
      inline def setEnableTrackpadTwoFingerGesture(value: Boolean): Self = StObject.set(x, "enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
      
      inline def setEnableTrackpadTwoFingerGestureUndefined: Self = StObject.set(x, "enableTrackpadTwoFingerGesture", js.undefined)
      
      inline def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      inline def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
      
      inline def setKeyboardDismissMode(value: DrawerKeyboardDismissMode): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
      
      inline def setMinSwipeDistanceUndefined: Self = StObject.set(x, "minSwipeDistance", js.undefined)
      
      inline def setOnDrawerClose(value: () => Unit): Self = StObject.set(x, "onDrawerClose", js.Any.fromFunction0(value))
      
      inline def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
      
      inline def setOnDrawerOpen(value: () => Unit): Self = StObject.set(x, "onDrawerOpen", js.Any.fromFunction0(value))
      
      inline def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
      
      inline def setOnDrawerSlide(value: /* position */ Double => Unit): Self = StObject.set(x, "onDrawerSlide", js.Any.fromFunction1(value))
      
      inline def setOnDrawerSlideUndefined: Self = StObject.set(x, "onDrawerSlide", js.undefined)
      
      inline def setOnDrawerStateChanged(value: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction2(value))
      
      inline def setOnDrawerStateChangedUndefined: Self = StObject.set(x, "onDrawerStateChanged", js.undefined)
      
      inline def setOnGestureRef(value: /* ref */ PanGestureHandler => Unit): Self = StObject.set(x, "onGestureRef", js.Any.fromFunction1(value))
      
      inline def setOnGestureRefUndefined: Self = StObject.set(x, "onGestureRef", js.undefined)
      
      inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      inline def setRenderNavigationView(value: Value => ReactNode): Self = StObject.set(x, "renderNavigationView", js.Any.fromFunction1(value))
      
      inline def setStatusBarAnimation(value: StatusBarAnimation): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      inline def setStatusBarAnimationUndefined: Self = StObject.set(x, "statusBarAnimation", js.undefined)
      
      inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      inline def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
    }
  }
  
  trait DrawerLayoutState extends StObject {
    
    var containerWidth: Double
    
    var dragX: Value
    
    var drawerOpened: Boolean
    
    var drawerState: DrawerState
    
    var drawerTranslation: Value
    
    var touchX: Value
  }
  object DrawerLayoutState {
    
    inline def apply(
      containerWidth: Double,
      dragX: Value,
      drawerOpened: Boolean,
      drawerState: DrawerState,
      drawerTranslation: Value,
      touchX: Value
    ): DrawerLayoutState = {
      val __obj = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], dragX = dragX.asInstanceOf[js.Any], drawerOpened = drawerOpened.asInstanceOf[js.Any], drawerState = drawerState.asInstanceOf[js.Any], drawerTranslation = drawerTranslation.asInstanceOf[js.Any], touchX = touchX.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerLayoutState]
    }
    
    extension [Self <: DrawerLayoutState](x: Self) {
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setDragX(value: Value): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
      
      inline def setDrawerOpened(value: Boolean): Self = StObject.set(x, "drawerOpened", value.asInstanceOf[js.Any])
      
      inline def setDrawerState(value: DrawerState): Self = StObject.set(x, "drawerState", value.asInstanceOf[js.Any])
      
      inline def setDrawerTranslation(value: Value): Self = StObject.set(x, "drawerTranslation", value.asInstanceOf[js.Any])
      
      inline def setTouchX(value: Value): Self = StObject.set(x, "touchX", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open`
  */
  trait DrawerLockMode extends StObject
  object DrawerLockMode {
    
    inline def `locked-closed`: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed` = "locked-closed".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed`]
    
    inline def `locked-open`: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open` = "locked-open".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open`]
    
    inline def unlocked: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked = "unlocked".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked]
  }
  
  trait DrawerMovementOption extends StObject {
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var velocity: js.UndefOr[Double] = js.undefined
  }
  object DrawerMovementOption {
    
    inline def apply(): DrawerMovementOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerMovementOption]
    }
    
    extension [Self <: DrawerMovementOption](x: Self) {
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right
  */
  trait DrawerPosition extends StObject
  object DrawerPosition {
    
    inline def left: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left = "left".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left]
    
    inline def right: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right = "right".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
  */
  trait DrawerState extends StObject
  object DrawerState {
    
    inline def Dragging: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging = "Dragging".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging]
    
    inline def Idle: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle = "Idle".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle]
    
    inline def Settling: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling = "Settling".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.front
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.back
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.slide
  */
  trait DrawerType extends StObject
  object DrawerType {
    
    inline def back: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.back = "back".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.back]
    
    inline def front: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.front = "front".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.front]
    
    inline def slide: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.slide = "slide".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.slide]
  }
}
