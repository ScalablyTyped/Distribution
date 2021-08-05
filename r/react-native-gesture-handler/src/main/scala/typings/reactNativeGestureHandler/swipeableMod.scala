package typings.reactNativeGestureHandler

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeableMod {
  
  @JSImport("react-native-gesture-handler/Swipeable", JSImport.Default)
  @js.native
  class default () extends Swipeable
  
  @js.native
  trait Swipeable
    extends Component[SwipeableProperties, js.Object, js.Any] {
    
    def close(): Unit = js.native
    
    def openLeft(): Unit = js.native
    
    def openRight(): Unit = js.native
  }
  
  /* Inlined std.Exclude<keyof react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, 'onGestureEvent' | 'onHandlerStateChange'> */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetY
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityX
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocity
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDist
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaY
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.avgTouches
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaX
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetY
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetX
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetX
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxPointers
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityY
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetY
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetX
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY
  */
  trait SwipeableExcludes extends StObject
  object SwipeableExcludes {
    
    inline def activeOffsetX: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetX = "activeOffsetX".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetX]
    
    inline def activeOffsetY: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetY = "activeOffsetY".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetY]
    
    inline def avgTouches: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.avgTouches = "avgTouches".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.avgTouches]
    
    inline def enabled: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled = "enabled".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled]
    
    inline def failOffsetX: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetX = "failOffsetX".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetX]
    
    inline def failOffsetY: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetY = "failOffsetY".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetY]
    
    inline def hitSlop: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop = "hitSlop".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop]
    
    inline def id: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id = "id".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id]
    
    inline def maxDeltaX: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX = "maxDeltaX".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX]
    
    inline def maxDeltaY: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY = "maxDeltaY".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY]
    
    inline def maxPointers: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxPointers = "maxPointers".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxPointers]
    
    inline def minDeltaX: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaX = "minDeltaX".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaX]
    
    inline def minDeltaY: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaY = "minDeltaY".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaY]
    
    inline def minDist: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDist = "minDist".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDist]
    
    inline def minOffsetX: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetX = "minOffsetX".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetX]
    
    inline def minOffsetY: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetY = "minOffsetY".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetY]
    
    inline def minPointers: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers = "minPointers".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers]
    
    inline def minVelocity: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocity = "minVelocity".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocity]
    
    inline def minVelocityX: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityX = "minVelocityX".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityX]
    
    inline def minVelocityY: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityY = "minVelocityY".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityY]
    
    inline def shouldCancelWhenOutside: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside = "shouldCancelWhenOutside".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside]
    
    inline def simultaneousHandlers: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers = "simultaneousHandlers".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers]
    
    inline def waitFor: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor = "waitFor".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor]
  }
  
  /* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, react-native-gesture-handler.react-native-gesture-handler/Swipeable.SwipeableExcludes> */
  trait SwipeableProperties extends StObject {
    
    var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var avgTouches: js.UndefOr[Boolean] = js.undefined
    
    var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var leftThreshold: js.UndefOr[Double] = js.undefined
    
    var maxDeltaX: js.UndefOr[Double] = js.undefined
    
    var maxDeltaY: js.UndefOr[Double] = js.undefined
    
    var maxPointers: js.UndefOr[Double] = js.undefined
    
    var minDeltaX: js.UndefOr[Double] = js.undefined
    
    var minDeltaY: js.UndefOr[Double] = js.undefined
    
    var minDist: js.UndefOr[Double] = js.undefined
    
    var minOffsetX: js.UndefOr[Double] = js.undefined
    
    var minOffsetY: js.UndefOr[Double] = js.undefined
    
    var minPointers: js.UndefOr[Double] = js.undefined
    
    var minVelocity: js.UndefOr[Double] = js.undefined
    
    var minVelocityX: js.UndefOr[Double] = js.undefined
    
    var minVelocityY: js.UndefOr[Double] = js.undefined
    
    var onSwipeableClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableLeftOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableLeftWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableRightOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableRightWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableWillClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeableWillOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var overshootFriction: js.UndefOr[Double] = js.undefined
    
    var overshootLeft: js.UndefOr[Boolean] = js.undefined
    
    var overshootRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      * This map describes the values to use as inputRange for extra interpolation:
      * AnimatedValue: [startValue, endValue]
      *
      * progressAnimatedValue: [0, 1]
      * dragAnimatedValue: [0, +]
      *
      * To support `rtl` flexbox layouts use `flexDirection` styling.
      * */
    var renderLeftActions: js.UndefOr[
        js.Function2[
          /* progressAnimatedValue */ AnimatedInterpolation, 
          /* dragAnimatedValue */ AnimatedInterpolation, 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      *
      * This map describes the values to use as inputRange for extra interpolation:
      * AnimatedValue: [startValue, endValue]
      *
      * progressAnimatedValue: [0, 1]
      * dragAnimatedValue: [0, -]
      *
      * To support `rtl` flexbox layouts use `flexDirection` styling.
      * */
    var renderRightActions: js.UndefOr[
        js.Function2[
          /* progressAnimatedValue */ AnimatedInterpolation, 
          /* dragAnimatedValue */ AnimatedInterpolation, 
          ReactNode
        ]
      ] = js.undefined
    
    var rightThreshold: js.UndefOr[Double] = js.undefined
    
    var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
    
    var simultaneousHandlers: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
    
    var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
    
    var waitFor: js.UndefOr[Ref[js.Any] | js.Array[Ref[js.Any]]] = js.undefined
  }
  object SwipeableProperties {
    
    inline def apply(): SwipeableProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableProperties]
    }
    
    extension [Self <: SwipeableProperties](x: Self) {
      
      inline def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
      
      inline def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value :_*))
      
      inline def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
      
      inline def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
      
      inline def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value :_*))
      
      inline def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
      
      inline def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
      
      inline def setChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "childrenContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setChildrenContainerStyleNull: Self = StObject.set(x, "childrenContainerStyle", null)
      
      inline def setChildrenContainerStyleUndefined: Self = StObject.set(x, "childrenContainerStyle", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
      
      inline def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value :_*))
      
      inline def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
      
      inline def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
      
      inline def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value :_*))
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeftThreshold(value: Double): Self = StObject.set(x, "leftThreshold", value.asInstanceOf[js.Any])
      
      inline def setLeftThresholdUndefined: Self = StObject.set(x, "leftThreshold", js.undefined)
      
      inline def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
      
      inline def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
      
      inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
      
      inline def setMinDeltaX(value: Double): Self = StObject.set(x, "minDeltaX", value.asInstanceOf[js.Any])
      
      inline def setMinDeltaXUndefined: Self = StObject.set(x, "minDeltaX", js.undefined)
      
      inline def setMinDeltaY(value: Double): Self = StObject.set(x, "minDeltaY", value.asInstanceOf[js.Any])
      
      inline def setMinDeltaYUndefined: Self = StObject.set(x, "minDeltaY", js.undefined)
      
      inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
      
      inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
      
      inline def setMinOffsetX(value: Double): Self = StObject.set(x, "minOffsetX", value.asInstanceOf[js.Any])
      
      inline def setMinOffsetXUndefined: Self = StObject.set(x, "minOffsetX", js.undefined)
      
      inline def setMinOffsetY(value: Double): Self = StObject.set(x, "minOffsetY", value.asInstanceOf[js.Any])
      
      inline def setMinOffsetYUndefined: Self = StObject.set(x, "minOffsetY", js.undefined)
      
      inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
      
      inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
      
      inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
      
      inline def setOnSwipeableClose(value: () => Unit): Self = StObject.set(x, "onSwipeableClose", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableCloseUndefined: Self = StObject.set(x, "onSwipeableClose", js.undefined)
      
      inline def setOnSwipeableLeftOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableLeftOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableLeftOpenUndefined: Self = StObject.set(x, "onSwipeableLeftOpen", js.undefined)
      
      inline def setOnSwipeableLeftWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableLeftWillOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableLeftWillOpenUndefined: Self = StObject.set(x, "onSwipeableLeftWillOpen", js.undefined)
      
      inline def setOnSwipeableOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableOpenUndefined: Self = StObject.set(x, "onSwipeableOpen", js.undefined)
      
      inline def setOnSwipeableRightOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableRightOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableRightOpenUndefined: Self = StObject.set(x, "onSwipeableRightOpen", js.undefined)
      
      inline def setOnSwipeableRightWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableRightWillOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableRightWillOpenUndefined: Self = StObject.set(x, "onSwipeableRightWillOpen", js.undefined)
      
      inline def setOnSwipeableWillClose(value: () => Unit): Self = StObject.set(x, "onSwipeableWillClose", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableWillCloseUndefined: Self = StObject.set(x, "onSwipeableWillClose", js.undefined)
      
      inline def setOnSwipeableWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableWillOpen", js.Any.fromFunction0(value))
      
      inline def setOnSwipeableWillOpenUndefined: Self = StObject.set(x, "onSwipeableWillOpen", js.undefined)
      
      inline def setOvershootFriction(value: Double): Self = StObject.set(x, "overshootFriction", value.asInstanceOf[js.Any])
      
      inline def setOvershootFrictionUndefined: Self = StObject.set(x, "overshootFriction", js.undefined)
      
      inline def setOvershootLeft(value: Boolean): Self = StObject.set(x, "overshootLeft", value.asInstanceOf[js.Any])
      
      inline def setOvershootLeftUndefined: Self = StObject.set(x, "overshootLeft", js.undefined)
      
      inline def setOvershootRight(value: Boolean): Self = StObject.set(x, "overshootRight", value.asInstanceOf[js.Any])
      
      inline def setOvershootRightUndefined: Self = StObject.set(x, "overshootRight", js.undefined)
      
      inline def setRenderLeftActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactNode
      ): Self = StObject.set(x, "renderLeftActions", js.Any.fromFunction2(value))
      
      inline def setRenderLeftActionsUndefined: Self = StObject.set(x, "renderLeftActions", js.undefined)
      
      inline def setRenderRightActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactNode
      ): Self = StObject.set(x, "renderRightActions", js.Any.fromFunction2(value))
      
      inline def setRenderRightActionsUndefined: Self = StObject.set(x, "renderRightActions", js.undefined)
      
      inline def setRightThreshold(value: Double): Self = StObject.set(x, "rightThreshold", value.asInstanceOf[js.Any])
      
      inline def setRightThresholdUndefined: Self = StObject.set(x, "rightThreshold", js.undefined)
      
      inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
      
      inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
      
      inline def setSimultaneousHandlers(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousHandlersFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
      
      inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      inline def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
      
      inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      inline def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
      
      inline def setWaitFor(value: Ref[js.Any] | js.Array[Ref[js.Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      inline def setWaitForFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
      
      inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
      
      inline def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
    }
  }
}
