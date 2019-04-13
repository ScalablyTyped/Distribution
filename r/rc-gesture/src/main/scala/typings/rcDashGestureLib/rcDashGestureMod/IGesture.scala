package typings
package rcDashGestureLib.rcDashGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGesture extends js.Object {
  var direction: js.UndefOr[
    rcDashGestureLib.rcDashGestureLibStrings.all | rcDashGestureLib.rcDashGestureLibStrings.vertical | rcDashGestureLib.rcDashGestureLibStrings.horizontal
  ] = js.undefined
  var enablePinch: js.UndefOr[scala.Boolean] = js.undefined
  var enableRotate: js.UndefOr[scala.Boolean] = js.undefined
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
  var onTouchCancel: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchEnd: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchMove: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement]] = js.undefined
}

object IGesture {
  @scala.inline
  def apply(
    direction: rcDashGestureLib.rcDashGestureLibStrings.all | rcDashGestureLib.rcDashGestureLibStrings.vertical | rcDashGestureLib.rcDashGestureLibStrings.horizontal = null,
    enablePinch: js.UndefOr[scala.Boolean] = js.undefined,
    enableRotate: js.UndefOr[scala.Boolean] = js.undefined,
    onPan: GestureHandler = null,
    onPanCancel: GestureHandler = null,
    onPanDown: GestureHandler = null,
    onPanEnd: GestureHandler = null,
    onPanLeft: GestureHandler = null,
    onPanMove: GestureHandler = null,
    onPanRight: GestureHandler = null,
    onPanStart: GestureHandler = null,
    onPanUp: GestureHandler = null,
    onPinch: GestureHandler = null,
    onPinchCancel: GestureHandler = null,
    onPinchEnd: GestureHandler = null,
    onPinchIn: GestureHandler = null,
    onPinchMove: GestureHandler = null,
    onPinchOut: GestureHandler = null,
    onPinchStart: GestureHandler = null,
    onPress: GestureHandler = null,
    onPressUp: GestureHandler = null,
    onRotate: GestureHandler = null,
    onRotateCancel: GestureHandler = null,
    onRotateEnd: GestureHandler = null,
    onRotateMove: GestureHandler = null,
    onRotateStart: GestureHandler = null,
    onSwipe: GestureHandler = null,
    onSwipeDown: GestureHandler = null,
    onSwipeLeft: GestureHandler = null,
    onSwipeRight: GestureHandler = null,
    onSwipeUp: GestureHandler = null,
    onTap: GestureHandler = null,
    onTouchCancel: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTouchEnd: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTouchMove: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[stdLib.HTMLElement] = null
  ): IGesture = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinch)) __obj.updateDynamic("enablePinch")(enablePinch)
    if (!js.isUndefined(enableRotate)) __obj.updateDynamic("enableRotate")(enableRotate)
    if (onPan != null) __obj.updateDynamic("onPan")(onPan)
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(onPanCancel)
    if (onPanDown != null) __obj.updateDynamic("onPanDown")(onPanDown)
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(onPanEnd)
    if (onPanLeft != null) __obj.updateDynamic("onPanLeft")(onPanLeft)
    if (onPanMove != null) __obj.updateDynamic("onPanMove")(onPanMove)
    if (onPanRight != null) __obj.updateDynamic("onPanRight")(onPanRight)
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(onPanStart)
    if (onPanUp != null) __obj.updateDynamic("onPanUp")(onPanUp)
    if (onPinch != null) __obj.updateDynamic("onPinch")(onPinch)
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(onPinchCancel)
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(onPinchEnd)
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(onPinchIn)
    if (onPinchMove != null) __obj.updateDynamic("onPinchMove")(onPinchMove)
    if (onPinchOut != null) __obj.updateDynamic("onPinchOut")(onPinchOut)
    if (onPinchStart != null) __obj.updateDynamic("onPinchStart")(onPinchStart)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onPressUp != null) __obj.updateDynamic("onPressUp")(onPressUp)
    if (onRotate != null) __obj.updateDynamic("onRotate")(onRotate)
    if (onRotateCancel != null) __obj.updateDynamic("onRotateCancel")(onRotateCancel)
    if (onRotateEnd != null) __obj.updateDynamic("onRotateEnd")(onRotateEnd)
    if (onRotateMove != null) __obj.updateDynamic("onRotateMove")(onRotateMove)
    if (onRotateStart != null) __obj.updateDynamic("onRotateStart")(onRotateStart)
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(onSwipe)
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(onSwipeDown)
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(onSwipeLeft)
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(onSwipeRight)
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(onSwipeUp)
    if (onTap != null) __obj.updateDynamic("onTap")(onTap)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    __obj.asInstanceOf[IGesture]
  }
}

