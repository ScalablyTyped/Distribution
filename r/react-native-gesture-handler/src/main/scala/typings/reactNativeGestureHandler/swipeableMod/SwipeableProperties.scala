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
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, react-native-gesture-handler.react-native-gesture-handler/Swipeable.SwipeableExcludes> */
trait SwipeableProperties extends js.Object {
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
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.undefined
  var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.undefined
}

object SwipeableProperties {
  @scala.inline
  def apply(
    activeOffsetX: Double | js.Array[Double] = null,
    activeOffsetY: Double | js.Array[Double] = null,
    avgTouches: js.UndefOr[Boolean] = js.undefined,
    childrenContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    failOffsetX: Double | js.Array[Double] = null,
    failOffsetY: Double | js.Array[Double] = null,
    friction: js.UndefOr[Double] = js.undefined,
    hitSlop: Double | Bottom | Left | Right | Height | BottomHeight = null,
    id: String = null,
    leftThreshold: js.UndefOr[Double] = js.undefined,
    maxDeltaX: js.UndefOr[Double] = js.undefined,
    maxDeltaY: js.UndefOr[Double] = js.undefined,
    maxPointers: js.UndefOr[Double] = js.undefined,
    minDeltaX: js.UndefOr[Double] = js.undefined,
    minDeltaY: js.UndefOr[Double] = js.undefined,
    minDist: js.UndefOr[Double] = js.undefined,
    minOffsetX: js.UndefOr[Double] = js.undefined,
    minOffsetY: js.UndefOr[Double] = js.undefined,
    minPointers: js.UndefOr[Double] = js.undefined,
    minVelocity: js.UndefOr[Double] = js.undefined,
    minVelocityX: js.UndefOr[Double] = js.undefined,
    minVelocityY: js.UndefOr[Double] = js.undefined,
    onSwipeableClose: () => Unit = null,
    onSwipeableLeftOpen: () => Unit = null,
    onSwipeableLeftWillOpen: () => Unit = null,
    onSwipeableOpen: () => Unit = null,
    onSwipeableRightOpen: () => Unit = null,
    onSwipeableRightWillOpen: () => Unit = null,
    onSwipeableWillClose: () => Unit = null,
    onSwipeableWillOpen: () => Unit = null,
    overshootFriction: js.UndefOr[Double] = js.undefined,
    overshootLeft: js.UndefOr[Boolean] = js.undefined,
    overshootRight: js.UndefOr[Boolean] = js.undefined,
    renderLeftActions: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactNode = null,
    renderRightActions: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactNode = null,
    rightThreshold: js.UndefOr[Double] = js.undefined,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined,
    waitFor: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined
  ): SwipeableProperties = {
    val __obj = js.Dynamic.literal()
    if (activeOffsetX != null) __obj.updateDynamic("activeOffsetX")(activeOffsetX.asInstanceOf[js.Any])
    if (activeOffsetY != null) __obj.updateDynamic("activeOffsetY")(activeOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(avgTouches)) __obj.updateDynamic("avgTouches")(avgTouches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(childrenContainerStyle)) __obj.updateDynamic("childrenContainerStyle")(childrenContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (failOffsetX != null) __obj.updateDynamic("failOffsetX")(failOffsetX.asInstanceOf[js.Any])
    if (failOffsetY != null) __obj.updateDynamic("failOffsetY")(failOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(leftThreshold)) __obj.updateDynamic("leftThreshold")(leftThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeltaX)) __obj.updateDynamic("maxDeltaX")(maxDeltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeltaY)) __obj.updateDynamic("maxDeltaY")(maxDeltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPointers)) __obj.updateDynamic("maxPointers")(maxPointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDeltaX)) __obj.updateDynamic("minDeltaX")(minDeltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDeltaY)) __obj.updateDynamic("minDeltaY")(minDeltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDist)) __obj.updateDynamic("minDist")(minDist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOffsetX)) __obj.updateDynamic("minOffsetX")(minOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOffsetY)) __obj.updateDynamic("minOffsetY")(minOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPointers)) __obj.updateDynamic("minPointers")(minPointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVelocity)) __obj.updateDynamic("minVelocity")(minVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVelocityX)) __obj.updateDynamic("minVelocityX")(minVelocityX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVelocityY)) __obj.updateDynamic("minVelocityY")(minVelocityY.get.asInstanceOf[js.Any])
    if (onSwipeableClose != null) __obj.updateDynamic("onSwipeableClose")(js.Any.fromFunction0(onSwipeableClose))
    if (onSwipeableLeftOpen != null) __obj.updateDynamic("onSwipeableLeftOpen")(js.Any.fromFunction0(onSwipeableLeftOpen))
    if (onSwipeableLeftWillOpen != null) __obj.updateDynamic("onSwipeableLeftWillOpen")(js.Any.fromFunction0(onSwipeableLeftWillOpen))
    if (onSwipeableOpen != null) __obj.updateDynamic("onSwipeableOpen")(js.Any.fromFunction0(onSwipeableOpen))
    if (onSwipeableRightOpen != null) __obj.updateDynamic("onSwipeableRightOpen")(js.Any.fromFunction0(onSwipeableRightOpen))
    if (onSwipeableRightWillOpen != null) __obj.updateDynamic("onSwipeableRightWillOpen")(js.Any.fromFunction0(onSwipeableRightWillOpen))
    if (onSwipeableWillClose != null) __obj.updateDynamic("onSwipeableWillClose")(js.Any.fromFunction0(onSwipeableWillClose))
    if (onSwipeableWillOpen != null) __obj.updateDynamic("onSwipeableWillOpen")(js.Any.fromFunction0(onSwipeableWillOpen))
    if (!js.isUndefined(overshootFriction)) __obj.updateDynamic("overshootFriction")(overshootFriction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootLeft)) __obj.updateDynamic("overshootLeft")(overshootLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootRight)) __obj.updateDynamic("overshootRight")(overshootRight.get.asInstanceOf[js.Any])
    if (renderLeftActions != null) __obj.updateDynamic("renderLeftActions")(js.Any.fromFunction2(renderLeftActions))
    if (renderRightActions != null) __obj.updateDynamic("renderRightActions")(js.Any.fromFunction2(renderRightActions))
    if (!js.isUndefined(rightThreshold)) __obj.updateDynamic("rightThreshold")(rightThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneousHandlers)) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitFor)) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableProperties]
  }
}

