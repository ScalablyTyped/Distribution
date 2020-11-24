package typings.reactNativeGestureHandler.swipeableMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, react-native-gesture-handler.react-native-gesture-handler/Swipeable.SwipeableExcludes> */
@js.native
trait SwipeableProperties extends js.Object {
  
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var avgTouches: js.UndefOr[Boolean] = js.native
  
  var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var friction: js.UndefOr[Double] = js.native
  
  var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var leftThreshold: js.UndefOr[Double] = js.native
  
  var maxDeltaX: js.UndefOr[Double] = js.native
  
  var maxDeltaY: js.UndefOr[Double] = js.native
  
  var maxPointers: js.UndefOr[Double] = js.native
  
  var minDeltaX: js.UndefOr[Double] = js.native
  
  var minDeltaY: js.UndefOr[Double] = js.native
  
  var minDist: js.UndefOr[Double] = js.native
  
  var minOffsetX: js.UndefOr[Double] = js.native
  
  var minOffsetY: js.UndefOr[Double] = js.native
  
  var minPointers: js.UndefOr[Double] = js.native
  
  var minVelocity: js.UndefOr[Double] = js.native
  
  var minVelocityX: js.UndefOr[Double] = js.native
  
  var minVelocityY: js.UndefOr[Double] = js.native
  
  var onSwipeableClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableLeftOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableLeftWillOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableRightOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableRightWillOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableWillClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeableWillOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overshootFriction: js.UndefOr[Double] = js.native
  
  var overshootLeft: js.UndefOr[Boolean] = js.native
  
  var overshootRight: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var rightThreshold: js.UndefOr[Double] = js.native
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.native
  
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
  
  var useNativeAnimations: js.UndefOr[Boolean] = js.native
  
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
}
object SwipeableProperties {
  
  @scala.inline
  def apply(): SwipeableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProperties]
  }
  
  @scala.inline
  implicit class SwipeablePropertiesOps[Self <: SwipeableProperties] (val x: Self) extends AnyVal {
    
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
    def setActiveOffsetXVarargs(value: Double*): Self = this.set("activeOffsetX", js.Array(value :_*))
    
    @scala.inline
    def setActiveOffsetX(value: Double | js.Array[Double]): Self = this.set("activeOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOffsetX: Self = this.set("activeOffsetX", js.undefined)
    
    @scala.inline
    def setActiveOffsetYVarargs(value: Double*): Self = this.set("activeOffsetY", js.Array(value :_*))
    
    @scala.inline
    def setActiveOffsetY(value: Double | js.Array[Double]): Self = this.set("activeOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOffsetY: Self = this.set("activeOffsetY", js.undefined)
    
    @scala.inline
    def setAvgTouches(value: Boolean): Self = this.set("avgTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvgTouches: Self = this.set("avgTouches", js.undefined)
    
    @scala.inline
    def setChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("childrenContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenContainerStyle: Self = this.set("childrenContainerStyle", js.undefined)
    
    @scala.inline
    def setChildrenContainerStyleNull: Self = this.set("childrenContainerStyle", null)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFailOffsetXVarargs(value: Double*): Self = this.set("failOffsetX", js.Array(value :_*))
    
    @scala.inline
    def setFailOffsetX(value: Double | js.Array[Double]): Self = this.set("failOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOffsetX: Self = this.set("failOffsetX", js.undefined)
    
    @scala.inline
    def setFailOffsetYVarargs(value: Double*): Self = this.set("failOffsetY", js.Array(value :_*))
    
    @scala.inline
    def setFailOffsetY(value: Double | js.Array[Double]): Self = this.set("failOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOffsetY: Self = this.set("failOffsetY", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLeftThreshold(value: Double): Self = this.set("leftThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftThreshold: Self = this.set("leftThreshold", js.undefined)
    
    @scala.inline
    def setMaxDeltaX(value: Double): Self = this.set("maxDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDeltaX: Self = this.set("maxDeltaX", js.undefined)
    
    @scala.inline
    def setMaxDeltaY(value: Double): Self = this.set("maxDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDeltaY: Self = this.set("maxDeltaY", js.undefined)
    
    @scala.inline
    def setMaxPointers(value: Double): Self = this.set("maxPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPointers: Self = this.set("maxPointers", js.undefined)
    
    @scala.inline
    def setMinDeltaX(value: Double): Self = this.set("minDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDeltaX: Self = this.set("minDeltaX", js.undefined)
    
    @scala.inline
    def setMinDeltaY(value: Double): Self = this.set("minDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDeltaY: Self = this.set("minDeltaY", js.undefined)
    
    @scala.inline
    def setMinDist(value: Double): Self = this.set("minDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDist: Self = this.set("minDist", js.undefined)
    
    @scala.inline
    def setMinOffsetX(value: Double): Self = this.set("minOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinOffsetX: Self = this.set("minOffsetX", js.undefined)
    
    @scala.inline
    def setMinOffsetY(value: Double): Self = this.set("minOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinOffsetY: Self = this.set("minOffsetY", js.undefined)
    
    @scala.inline
    def setMinPointers(value: Double): Self = this.set("minPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPointers: Self = this.set("minPointers", js.undefined)
    
    @scala.inline
    def setMinVelocity(value: Double): Self = this.set("minVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVelocity: Self = this.set("minVelocity", js.undefined)
    
    @scala.inline
    def setMinVelocityX(value: Double): Self = this.set("minVelocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVelocityX: Self = this.set("minVelocityX", js.undefined)
    
    @scala.inline
    def setMinVelocityY(value: Double): Self = this.set("minVelocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVelocityY: Self = this.set("minVelocityY", js.undefined)
    
    @scala.inline
    def setOnSwipeableClose(value: () => Unit): Self = this.set("onSwipeableClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableClose: Self = this.set("onSwipeableClose", js.undefined)
    
    @scala.inline
    def setOnSwipeableLeftOpen(value: () => Unit): Self = this.set("onSwipeableLeftOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableLeftOpen: Self = this.set("onSwipeableLeftOpen", js.undefined)
    
    @scala.inline
    def setOnSwipeableLeftWillOpen(value: () => Unit): Self = this.set("onSwipeableLeftWillOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableLeftWillOpen: Self = this.set("onSwipeableLeftWillOpen", js.undefined)
    
    @scala.inline
    def setOnSwipeableOpen(value: () => Unit): Self = this.set("onSwipeableOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableOpen: Self = this.set("onSwipeableOpen", js.undefined)
    
    @scala.inline
    def setOnSwipeableRightOpen(value: () => Unit): Self = this.set("onSwipeableRightOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableRightOpen: Self = this.set("onSwipeableRightOpen", js.undefined)
    
    @scala.inline
    def setOnSwipeableRightWillOpen(value: () => Unit): Self = this.set("onSwipeableRightWillOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableRightWillOpen: Self = this.set("onSwipeableRightWillOpen", js.undefined)
    
    @scala.inline
    def setOnSwipeableWillClose(value: () => Unit): Self = this.set("onSwipeableWillClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableWillClose: Self = this.set("onSwipeableWillClose", js.undefined)
    
    @scala.inline
    def setOnSwipeableWillOpen(value: () => Unit): Self = this.set("onSwipeableWillOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSwipeableWillOpen: Self = this.set("onSwipeableWillOpen", js.undefined)
    
    @scala.inline
    def setOvershootFriction(value: Double): Self = this.set("overshootFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOvershootFriction: Self = this.set("overshootFriction", js.undefined)
    
    @scala.inline
    def setOvershootLeft(value: Boolean): Self = this.set("overshootLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOvershootLeft: Self = this.set("overshootLeft", js.undefined)
    
    @scala.inline
    def setOvershootRight(value: Boolean): Self = this.set("overshootRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOvershootRight: Self = this.set("overshootRight", js.undefined)
    
    @scala.inline
    def setRenderLeftActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactNode
    ): Self = this.set("renderLeftActions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderLeftActions: Self = this.set("renderLeftActions", js.undefined)
    
    @scala.inline
    def setRenderRightActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactNode
    ): Self = this.set("renderRightActions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderRightActions: Self = this.set("renderRightActions", js.undefined)
    
    @scala.inline
    def setRightThreshold(value: Double): Self = this.set("rightThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightThreshold: Self = this.set("rightThreshold", js.undefined)
    
    @scala.inline
    def setShouldCancelWhenOutside(value: Boolean): Self = this.set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCancelWhenOutside: Self = this.set("shouldCancelWhenOutside", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = this.set("simultaneousHandlers", js.Array(value :_*))
    
    @scala.inline
    def setSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("simultaneousHandlers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = this.set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimultaneousHandlers: Self = this.set("simultaneousHandlers", js.undefined)
    
    @scala.inline
    def setSimultaneousHandlersNull: Self = this.set("simultaneousHandlers", null)
    
    @scala.inline
    def setUseNativeAnimations(value: Boolean): Self = this.set("useNativeAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeAnimations: Self = this.set("useNativeAnimations", js.undefined)
    
    @scala.inline
    def setWaitForVarargs(value: Ref[js.Any]*): Self = this.set("waitFor", js.Array(value :_*))
    
    @scala.inline
    def setWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("waitFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = this.set("waitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitFor: Self = this.set("waitFor", js.undefined)
    
    @scala.inline
    def setWaitForNull: Self = this.set("waitFor", null)
  }
}
