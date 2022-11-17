package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.Friction
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.UserSelect
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsSwipeableMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/Swipeable", JSImport.Default)
  @js.native
  open class default protected () extends Swipeable {
    def this(props: SwipeableProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/Swipeable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/Swipeable", "default.defaultProps")
    @js.native
    def defaultProps: Friction = js.native
    inline def defaultProps_=(x: Friction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Swipeable extends Component[SwipeableProps, SwipeableState, Any] {
    
    /* private */ var animateRow: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ var currentOffset: Any = js.native
    
    /* private */ var handleRelease: Any = js.native
    
    /* private */ var leftActionTranslate: Any = js.native
    
    /* private */ var onGestureEvent: Any = js.native
    
    /* private */ var onHandlerStateChange: Any = js.native
    
    /* private */ var onRowLayout: Any = js.native
    
    /* private */ var onTapHandlerStateChange: Any = js.native
    
    def openLeft(): Unit = js.native
    
    def openRight(): Unit = js.native
    
    /* private */ var rightActionTranslate: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MSwipeable(props: SwipeableProps, state: SwipeableState): Boolean = js.native
    
    /* private */ var showLeftAction: Any = js.native
    
    /* private */ var showRightAction: Any = js.native
    
    /* private */ var transX: Any = js.native
    
    /* private */ var updateAnimatedEvent: Any = js.native
  }
  
  object SwipeableExcludes {
    
    inline def activateAfterLongPress: "activateAfterLongPress" = "activateAfterLongPress".asInstanceOf["activateAfterLongPress"]
    
    inline def activeOffsetX: "activeOffsetX" = "activeOffsetX".asInstanceOf["activeOffsetX"]
    
    inline def activeOffsetY: "activeOffsetY" = "activeOffsetY".asInstanceOf["activeOffsetY"]
    
    inline def avgTouches: "avgTouches" = "avgTouches".asInstanceOf["avgTouches"]
    
    inline def cancelsTouchesInView: "cancelsTouchesInView" = "cancelsTouchesInView".asInstanceOf["cancelsTouchesInView"]
    
    inline def children: "children" = "children".asInstanceOf["children"]
    
    inline def enableTrackpadTwoFingerGesture: "enableTrackpadTwoFingerGesture" = "enableTrackpadTwoFingerGesture".asInstanceOf["enableTrackpadTwoFingerGesture"]
    
    inline def enabled: "enabled" = "enabled".asInstanceOf["enabled"]
    
    inline def failOffsetX: "failOffsetX" = "failOffsetX".asInstanceOf["failOffsetX"]
    
    inline def failOffsetY: "failOffsetY" = "failOffsetY".asInstanceOf["failOffsetY"]
    
    inline def hitSlop: "hitSlop" = "hitSlop".asInstanceOf["hitSlop"]
    
    inline def id: "id" = "id".asInstanceOf["id"]
    
    inline def maxPointers: "maxPointers" = "maxPointers".asInstanceOf["maxPointers"]
    
    inline def minDist: "minDist" = "minDist".asInstanceOf["minDist"]
    
    inline def minPointers: "minPointers" = "minPointers".asInstanceOf["minPointers"]
    
    inline def minVelocity: "minVelocity" = "minVelocity".asInstanceOf["minVelocity"]
    
    inline def minVelocityX: "minVelocityX" = "minVelocityX".asInstanceOf["minVelocityX"]
    
    inline def minVelocityY: "minVelocityY" = "minVelocityY".asInstanceOf["minVelocityY"]
    
    inline def onActivated: "onActivated" = "onActivated".asInstanceOf["onActivated"]
    
    inline def onBegan: "onBegan" = "onBegan".asInstanceOf["onBegan"]
    
    inline def onCancelled: "onCancelled" = "onCancelled".asInstanceOf["onCancelled"]
    
    inline def onEnded: "onEnded" = "onEnded".asInstanceOf["onEnded"]
    
    inline def onFailed: "onFailed" = "onFailed".asInstanceOf["onFailed"]
    
    inline def shouldCancelWhenOutside: "shouldCancelWhenOutside" = "shouldCancelWhenOutside".asInstanceOf["shouldCancelWhenOutside"]
    
    inline def simultaneousHandlers: "simultaneousHandlers" = "simultaneousHandlers".asInstanceOf["simultaneousHandlers"]
    
    inline def testID: "testID" = "testID".asInstanceOf["testID"]
    
    inline def userSelect: "userSelect" = "userSelect".asInstanceOf["userSelect"]
    
    inline def waitFor: "waitFor" = "waitFor".asInstanceOf["waitFor"]
  }
  /* Inlined std.Exclude<keyof react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler.PanGestureHandlerProps, 'onGestureEvent' | 'onHandlerStateChange'> */
  type SwipeableExcludes = "activeOffsetY" | "children" | "minVelocityX" | "userSelect" | "minVelocity" | "onEnded" | "enabled" | "simultaneousHandlers" | "onFailed" | "minDist" | "minPointers" | "waitFor" | "hitSlop" | "onCancelled" | "avgTouches" | "testID" | "enableTrackpadTwoFingerGesture" | "shouldCancelWhenOutside" | "onActivated" | "onBegan" | "activateAfterLongPress" | "failOffsetX" | "cancelsTouchesInView" | "maxPointers" | "minVelocityY" | "failOffsetY" | "id" | "activeOffsetX"
  
  /* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/PanGestureHandler.PanGestureHandlerProps, react-native-gesture-handler.react-native-gesture-handler/lib/typescript/components/Swipeable.SwipeableExcludes> */
  trait SwipeableProps extends StObject {
    
    var activateAfterLongPress: js.UndefOr[Double] = js.undefined
    
    var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var animationOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    var avgTouches: js.UndefOr[Boolean] = js.undefined
    
    var cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style object for the children container (`Animated.View`), for example to
      * apply `flex: 1`
      */
    var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Style object for the container (`Animated.View`), for example to override
      * `overflow: 'hidden'`.
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Enables two-finger gestures on supported devices, for example iPads with
      * trackpads. If not enabled the gesture will require click + drag, with
      * `enableTrackpadTwoFingerGesture` swiping with two fingers will also trigger
      * the gesture.
      */
    var enableTrackpadTwoFingerGesture: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Specifies how much the visual interaction will be delayed compared to the
      * gesture distance. e.g. value of 1 will indicate that the swipeable panel
      * should exactly follow the gesture, 2 means it is going to be two times
      * "slower".
      */
    var friction: js.UndefOr[Double] = js.undefined
    
    var hitSlop: js.UndefOr[HitSlop] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Distance from the left edge at which released panel will animate to the
      * open state (or the open panel will animate into the closed state). By
      * default it's a half of the panel's width.
      */
    var leftThreshold: js.UndefOr[Double] = js.undefined
    
    var maxPointers: js.UndefOr[Double] = js.undefined
    
    var minDist: js.UndefOr[Double] = js.undefined
    
    var minPointers: js.UndefOr[Double] = js.undefined
    
    var minVelocity: js.UndefOr[Double] = js.undefined
    
    var minVelocityX: js.UndefOr[Double] = js.undefined
    
    var minVelocityY: js.UndefOr[Double] = js.undefined
    
    var onActivated: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onBegan: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onCancelled: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onEnded: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onFailed: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    /**
      * Called when action panel is closed.
      */
    var onSwipeableClose: js.UndefOr[js.Function2[/* direction */ "left" | "right", /* swipeable */ Swipeable, Unit]] = js.undefined
    
    /**
      * @deprecated Use `direction` argument of onSwipeableOpen()
      *
      * Called when left action panel gets open.
      */
    var onSwipeableLeftOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * @deprecated Use `direction` argument of onSwipeableWillOpen()
      *
      * Called when left action panel starts animating on open.
      */
    var onSwipeableLeftWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when action panel gets open (either right or left).
      */
    var onSwipeableOpen: js.UndefOr[js.Function2[/* direction */ "left" | "right", /* swipeable */ Swipeable, Unit]] = js.undefined
    
    /**
      * @deprecated Use `direction` argument of onSwipeableOpen()
      *
      * Called when right action panel gets open.
      */
    var onSwipeableRightOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * @deprecated Use `direction` argument of onSwipeableWillOpen()
      *
      * Called when right action panel starts animating on open.
      */
    var onSwipeableRightWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when action panel starts animating on close.
      */
    var onSwipeableWillClose: js.UndefOr[js.Function1[/* direction */ "left" | "right", Unit]] = js.undefined
    
    /**
      * Called when action panel starts animating on open (either right or left).
      */
    var onSwipeableWillOpen: js.UndefOr[js.Function1[/* direction */ "left" | "right", Unit]] = js.undefined
    
    /**
      * Specifies how much the visual interaction will be delayed compared to the
      * gesture distance at overshoot. Default value is 1, it mean no friction, for
      * a native feel, try 8 or above.
      */
    var overshootFriction: js.UndefOr[Double] = js.undefined
    
    /**
      * Value indicating if the swipeable panel can be pulled further than the left
      * actions panel's width. It is set to true by default as long as the left
      * panel render method is present.
      */
    var overshootLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value indicating if the swipeable panel can be pulled further than the
      * right actions panel's width. It is set to true by default as long as the
      * right panel render method is present.
      */
    var overshootRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * This map describes the values to use as inputRange for extra interpolation:
      * AnimatedValue: [startValue, endValue]
      *
      * progressAnimatedValue: [0, 1] dragAnimatedValue: [0, +]
      *
      * To support `rtl` flexbox layouts use `flexDirection` styling.
      * */
    var renderLeftActions: js.UndefOr[
        js.Function2[
          /* progressAnimatedValue */ AnimatedInterpolation[Double | String], 
          /* dragAnimatedValue */ AnimatedInterpolation[Double | String], 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      *
      * This map describes the values to use as inputRange for extra interpolation:
      * AnimatedValue: [startValue, endValue]
      *
      * progressAnimatedValue: [0, 1] dragAnimatedValue: [0, -]
      *
      * To support `rtl` flexbox layouts use `flexDirection` styling.
      * */
    var renderRightActions: js.UndefOr[
        js.Function3[
          /* progressAnimatedValue */ AnimatedInterpolation[Double | String], 
          /* dragAnimatedValue */ AnimatedInterpolation[Double | String], 
          /* swipeable */ Swipeable, 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * Distance from the right edge at which released panel will animate to the
      * open state (or the open panel will animate into the closed state). By
      * default it's a half of the panel's width.
      */
    var rightThreshold: js.UndefOr[Double] = js.undefined
    
    var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
    
    var simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
    
    var userSelect: js.UndefOr[UserSelect] = js.undefined
    
    var waitFor: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
  }
  object SwipeableProps {
    
    inline def apply(): SwipeableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableProps]
    }
    
    extension [Self <: SwipeableProps](x: Self) {
      
      inline def setActivateAfterLongPress(value: Double): Self = StObject.set(x, "activateAfterLongPress", value.asInstanceOf[js.Any])
      
      inline def setActivateAfterLongPressUndefined: Self = StObject.set(x, "activateAfterLongPress", js.undefined)
      
      inline def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
      
      inline def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value*))
      
      inline def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
      
      inline def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value*))
      
      inline def setAnimationOptions(value: Record[String, Any]): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
      
      inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
      
      inline def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
      
      inline def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
      
      inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
      
      inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "childrenContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setChildrenContainerStyleNull: Self = StObject.set(x, "childrenContainerStyle", null)
      
      inline def setChildrenContainerStyleUndefined: Self = StObject.set(x, "childrenContainerStyle", js.undefined)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setEnableTrackpadTwoFingerGesture(value: Boolean): Self = StObject.set(x, "enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
      
      inline def setEnableTrackpadTwoFingerGestureUndefined: Self = StObject.set(x, "enableTrackpadTwoFingerGesture", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
      
      inline def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value*))
      
      inline def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
      
      inline def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value*))
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeftThreshold(value: Double): Self = StObject.set(x, "leftThreshold", value.asInstanceOf[js.Any])
      
      inline def setLeftThresholdUndefined: Self = StObject.set(x, "leftThreshold", js.undefined)
      
      inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
      
      inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
      
      inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
      
      inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
      
      inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
      
      inline def setOnActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onActivated", js.Any.fromFunction1(value))
      
      inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
      
      inline def setOnBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onBegan", js.Any.fromFunction1(value))
      
      inline def setOnBeganUndefined: Self = StObject.set(x, "onBegan", js.undefined)
      
      inline def setOnCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onCancelled", js.Any.fromFunction1(value))
      
      inline def setOnCancelledUndefined: Self = StObject.set(x, "onCancelled", js.undefined)
      
      inline def setOnEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onFailed", js.Any.fromFunction1(value))
      
      inline def setOnFailedUndefined: Self = StObject.set(x, "onFailed", js.undefined)
      
      inline def setOnSwipeableClose(value: (/* direction */ "left" | "right", /* swipeable */ Swipeable) => Unit): Self = StObject.set(x, "onSwipeableClose", js.Any.fromFunction2(value))
      
      inline def setOnSwipeableCloseUndefined: Self = StObject.set(x, "onSwipeableClose", js.undefined)
      
      inline def setOnSwipeableLeftOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableLeftOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableLeftOpenUndefined: Self = StObject.set(x, "onSwipeableLeftOpen", js.undefined)
      
      inline def setOnSwipeableLeftWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableLeftWillOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableLeftWillOpenUndefined: Self = StObject.set(x, "onSwipeableLeftWillOpen", js.undefined)
      
      inline def setOnSwipeableOpen(value: (/* direction */ "left" | "right", /* swipeable */ Swipeable) => Unit): Self = StObject.set(x, "onSwipeableOpen", js.Any.fromFunction2(value))
      
      inline def setOnSwipeableOpenUndefined: Self = StObject.set(x, "onSwipeableOpen", js.undefined)
      
      inline def setOnSwipeableRightOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableRightOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableRightOpenUndefined: Self = StObject.set(x, "onSwipeableRightOpen", js.undefined)
      
      inline def setOnSwipeableRightWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableRightWillOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableRightWillOpenUndefined: Self = StObject.set(x, "onSwipeableRightWillOpen", js.undefined)
      
      inline def setOnSwipeableWillClose(value: /* direction */ "left" | "right" => Unit): Self = StObject.set(x, "onSwipeableWillClose", js.Any.fromFunction1(value))
      
      inline def setOnSwipeableWillCloseUndefined: Self = StObject.set(x, "onSwipeableWillClose", js.undefined)
      
      inline def setOnSwipeableWillOpen(value: /* direction */ "left" | "right" => Unit): Self = StObject.set(x, "onSwipeableWillOpen", js.Any.fromFunction1(value))
      
      inline def setOnSwipeableWillOpenUndefined: Self = StObject.set(x, "onSwipeableWillOpen", js.undefined)
      
      inline def setOvershootFriction(value: Double): Self = StObject.set(x, "overshootFriction", value.asInstanceOf[js.Any])
      
      inline def setOvershootFrictionUndefined: Self = StObject.set(x, "overshootFriction", js.undefined)
      
      inline def setOvershootLeft(value: Boolean): Self = StObject.set(x, "overshootLeft", value.asInstanceOf[js.Any])
      
      inline def setOvershootLeftUndefined: Self = StObject.set(x, "overshootLeft", js.undefined)
      
      inline def setOvershootRight(value: Boolean): Self = StObject.set(x, "overshootRight", value.asInstanceOf[js.Any])
      
      inline def setOvershootRightUndefined: Self = StObject.set(x, "overshootRight", js.undefined)
      
      inline def setRenderLeftActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation[Double | String], /* dragAnimatedValue */ AnimatedInterpolation[Double | String]) => ReactNode
      ): Self = StObject.set(x, "renderLeftActions", js.Any.fromFunction2(value))
      
      inline def setRenderLeftActionsUndefined: Self = StObject.set(x, "renderLeftActions", js.undefined)
      
      inline def setRenderRightActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation[Double | String], /* dragAnimatedValue */ AnimatedInterpolation[Double | String], /* swipeable */ Swipeable) => ReactNode
      ): Self = StObject.set(x, "renderRightActions", js.Any.fromFunction3(value))
      
      inline def setRenderRightActionsUndefined: Self = StObject.set(x, "renderRightActions", js.undefined)
      
      inline def setRightThreshold(value: Double): Self = StObject.set(x, "rightThreshold", value.asInstanceOf[js.Any])
      
      inline def setRightThresholdUndefined: Self = StObject.set(x, "rightThreshold", js.undefined)
      
      inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
      
      inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
      
      inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
      
      inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      inline def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
      
      inline def setUserSelect(value: UserSelect): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
      
      inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
      
      inline def setWaitFor(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      inline def setWaitForFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
      
      inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
      
      inline def setWaitForVarargs(value: Ref[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
    }
  }
  
  trait SwipeableState extends StObject {
    
    var dragX: Value
    
    var leftWidth: js.UndefOr[Double] = js.undefined
    
    var rightOffset: js.UndefOr[Double] = js.undefined
    
    var rowState: Double
    
    var rowTranslation: Value
    
    var rowWidth: js.UndefOr[Double] = js.undefined
  }
  object SwipeableState {
    
    inline def apply(dragX: Value, rowState: Double, rowTranslation: Value): SwipeableState = {
      val __obj = js.Dynamic.literal(dragX = dragX.asInstanceOf[js.Any], rowState = rowState.asInstanceOf[js.Any], rowTranslation = rowTranslation.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeableState]
    }
    
    extension [Self <: SwipeableState](x: Self) {
      
      inline def setDragX(value: Value): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
      
      inline def setLeftWidth(value: Double): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
      
      inline def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
      
      inline def setRightOffset(value: Double): Self = StObject.set(x, "rightOffset", value.asInstanceOf[js.Any])
      
      inline def setRightOffsetUndefined: Self = StObject.set(x, "rightOffset", js.undefined)
      
      inline def setRowState(value: Double): Self = StObject.set(x, "rowState", value.asInstanceOf[js.Any])
      
      inline def setRowTranslation(value: Value): Self = StObject.set(x, "rowTranslation", value.asInstanceOf[js.Any])
      
      inline def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
      
      inline def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
    }
  }
}
