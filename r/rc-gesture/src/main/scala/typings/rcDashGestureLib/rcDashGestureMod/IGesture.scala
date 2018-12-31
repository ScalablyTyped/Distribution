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
  var onTouchCancel: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLElement]] = js.undefined
  var onTouchEnd: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLElement]] = js.undefined
  var onTouchMove: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLElement]] = js.undefined
}

