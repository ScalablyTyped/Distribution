package typings.rcGesture.mod

import typings.rcGesture.rcGestureStrings.all
import typings.rcGesture.rcGestureStrings.horizontal
import typings.rcGesture.rcGestureStrings.vertical
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGesture extends js.Object {
  var direction: js.UndefOr[all | vertical | horizontal] = js.undefined
  var enablePinch: js.UndefOr[Boolean] = js.undefined
  var enableRotate: js.UndefOr[Boolean] = js.undefined
  var onPan: js.UndefOr[GestureHandler] = js.undefined
  var onPanCancel: js.UndefOr[GestureHandler] = js.undefined
  var onPanDown: js.UndefOr[GestureHandler] = js.undefined
  var onPanEnd: js.UndefOr[GestureHandler] = js.undefined
  var onPanLeft: js.UndefOr[GestureHandler] = js.undefined
  var onPanMove: js.UndefOr[GestureHandler] = js.undefined
  var onPanRight: js.UndefOr[GestureHandler] = js.undefined
  var onPanStart: js.UndefOr[GestureHandler] = js.undefined
  var onPanUp: js.UndefOr[GestureHandler] = js.undefined
  var onPinch: js.UndefOr[GestureHandler] = js.undefined
  var onPinchCancel: js.UndefOr[GestureHandler] = js.undefined
  var onPinchEnd: js.UndefOr[GestureHandler] = js.undefined
  var onPinchIn: js.UndefOr[GestureHandler] = js.undefined
  var onPinchMove: js.UndefOr[GestureHandler] = js.undefined
  var onPinchOut: js.UndefOr[GestureHandler] = js.undefined
  var onPinchStart: js.UndefOr[GestureHandler] = js.undefined
  var onPress: js.UndefOr[GestureHandler] = js.undefined
  var onPressUp: js.UndefOr[GestureHandler] = js.undefined
  var onRotate: js.UndefOr[GestureHandler] = js.undefined
  var onRotateCancel: js.UndefOr[GestureHandler] = js.undefined
  var onRotateEnd: js.UndefOr[GestureHandler] = js.undefined
  var onRotateMove: js.UndefOr[GestureHandler] = js.undefined
  var onRotateStart: js.UndefOr[GestureHandler] = js.undefined
  var onSwipe: js.UndefOr[GestureHandler] = js.undefined
  var onSwipeDown: js.UndefOr[GestureHandler] = js.undefined
  var onSwipeLeft: js.UndefOr[GestureHandler] = js.undefined
  var onSwipeRight: js.UndefOr[GestureHandler] = js.undefined
  var onSwipeUp: js.UndefOr[GestureHandler] = js.undefined
  var onTap: js.UndefOr[GestureHandler] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
}

object IGesture {
  @scala.inline
  def apply(
    direction: all | vertical | horizontal = null,
    enablePinch: js.UndefOr[Boolean] = js.undefined,
    enableRotate: js.UndefOr[Boolean] = js.undefined,
    onPan: /* s */ IGestureStatus => Unit = null,
    onPanCancel: /* s */ IGestureStatus => Unit = null,
    onPanDown: /* s */ IGestureStatus => Unit = null,
    onPanEnd: /* s */ IGestureStatus => Unit = null,
    onPanLeft: /* s */ IGestureStatus => Unit = null,
    onPanMove: /* s */ IGestureStatus => Unit = null,
    onPanRight: /* s */ IGestureStatus => Unit = null,
    onPanStart: /* s */ IGestureStatus => Unit = null,
    onPanUp: /* s */ IGestureStatus => Unit = null,
    onPinch: /* s */ IGestureStatus => Unit = null,
    onPinchCancel: /* s */ IGestureStatus => Unit = null,
    onPinchEnd: /* s */ IGestureStatus => Unit = null,
    onPinchIn: /* s */ IGestureStatus => Unit = null,
    onPinchMove: /* s */ IGestureStatus => Unit = null,
    onPinchOut: /* s */ IGestureStatus => Unit = null,
    onPinchStart: /* s */ IGestureStatus => Unit = null,
    onPress: /* s */ IGestureStatus => Unit = null,
    onPressUp: /* s */ IGestureStatus => Unit = null,
    onRotate: /* s */ IGestureStatus => Unit = null,
    onRotateCancel: /* s */ IGestureStatus => Unit = null,
    onRotateEnd: /* s */ IGestureStatus => Unit = null,
    onRotateMove: /* s */ IGestureStatus => Unit = null,
    onRotateStart: /* s */ IGestureStatus => Unit = null,
    onSwipe: /* s */ IGestureStatus => Unit = null,
    onSwipeDown: /* s */ IGestureStatus => Unit = null,
    onSwipeLeft: /* s */ IGestureStatus => Unit = null,
    onSwipeRight: /* s */ IGestureStatus => Unit = null,
    onSwipeUp: /* s */ IGestureStatus => Unit = null,
    onTap: /* s */ IGestureStatus => Unit = null,
    onTouchCancel: TouchEvent[HTMLElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLElement] => Unit = null
  ): IGesture = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinch)) __obj.updateDynamic("enablePinch")(enablePinch.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotate)) __obj.updateDynamic("enableRotate")(enableRotate.asInstanceOf[js.Any])
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(js.Any.fromFunction1(onPanCancel))
    if (onPanDown != null) __obj.updateDynamic("onPanDown")(js.Any.fromFunction1(onPanDown))
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(js.Any.fromFunction1(onPanEnd))
    if (onPanLeft != null) __obj.updateDynamic("onPanLeft")(js.Any.fromFunction1(onPanLeft))
    if (onPanMove != null) __obj.updateDynamic("onPanMove")(js.Any.fromFunction1(onPanMove))
    if (onPanRight != null) __obj.updateDynamic("onPanRight")(js.Any.fromFunction1(onPanRight))
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(js.Any.fromFunction1(onPanStart))
    if (onPanUp != null) __obj.updateDynamic("onPanUp")(js.Any.fromFunction1(onPanUp))
    if (onPinch != null) __obj.updateDynamic("onPinch")(js.Any.fromFunction1(onPinch))
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(js.Any.fromFunction1(onPinchCancel))
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(js.Any.fromFunction1(onPinchEnd))
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(js.Any.fromFunction1(onPinchIn))
    if (onPinchMove != null) __obj.updateDynamic("onPinchMove")(js.Any.fromFunction1(onPinchMove))
    if (onPinchOut != null) __obj.updateDynamic("onPinchOut")(js.Any.fromFunction1(onPinchOut))
    if (onPinchStart != null) __obj.updateDynamic("onPinchStart")(js.Any.fromFunction1(onPinchStart))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressUp != null) __obj.updateDynamic("onPressUp")(js.Any.fromFunction1(onPressUp))
    if (onRotate != null) __obj.updateDynamic("onRotate")(js.Any.fromFunction1(onRotate))
    if (onRotateCancel != null) __obj.updateDynamic("onRotateCancel")(js.Any.fromFunction1(onRotateCancel))
    if (onRotateEnd != null) __obj.updateDynamic("onRotateEnd")(js.Any.fromFunction1(onRotateEnd))
    if (onRotateMove != null) __obj.updateDynamic("onRotateMove")(js.Any.fromFunction1(onRotateMove))
    if (onRotateStart != null) __obj.updateDynamic("onRotateStart")(js.Any.fromFunction1(onRotateStart))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction1(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction1(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction1(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction1(onSwipeUp))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[IGesture]
  }
}

