package typings
package reactDashHammerjsLib.reactDashHammerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHammerProps extends js.Object {
  var action: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var direction: js.UndefOr[
    reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_NONE | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_LEFT | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_RIGHT | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_UP | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_DOWN | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_HORIZONTAL | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_VERTICAL | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_ALL
  ] = js.undefined
  var onDoubleTap: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPan: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPanCancel: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPanEnd: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPanStart: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPinch: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPinchCancel: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPinchEnd: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPinchIn: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPinchOut: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPinchStart: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPress: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onPressUp: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onRotate: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onRotateCancel: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onRotateEnd: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onRotateMove: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onRotateStart: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onSwipe: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var onTap: js.UndefOr[hammerjsLib.HammerListener] = js.undefined
  var options: js.UndefOr[reactDashHammerjsLib.HammerOptionsWithRecognizers] = js.undefined
  var recognizeWith: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[hammerjsLib.Recognizer | java.lang.String]
  ] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactHammerProps {
  @scala.inline
  def apply(
    action: hammerjsLib.HammerListener = null,
    direction: reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_NONE | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_LEFT | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_RIGHT | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_UP | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_DOWN | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_HORIZONTAL | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_VERTICAL | reactDashHammerjsLib.reactDashHammerjsLibStrings.DIRECTION_ALL = null,
    onDoubleTap: hammerjsLib.HammerListener = null,
    onPan: hammerjsLib.HammerListener = null,
    onPanCancel: hammerjsLib.HammerListener = null,
    onPanEnd: hammerjsLib.HammerListener = null,
    onPanStart: hammerjsLib.HammerListener = null,
    onPinch: hammerjsLib.HammerListener = null,
    onPinchCancel: hammerjsLib.HammerListener = null,
    onPinchEnd: hammerjsLib.HammerListener = null,
    onPinchIn: hammerjsLib.HammerListener = null,
    onPinchOut: hammerjsLib.HammerListener = null,
    onPinchStart: hammerjsLib.HammerListener = null,
    onPress: hammerjsLib.HammerListener = null,
    onPressUp: hammerjsLib.HammerListener = null,
    onRotate: hammerjsLib.HammerListener = null,
    onRotateCancel: hammerjsLib.HammerListener = null,
    onRotateEnd: hammerjsLib.HammerListener = null,
    onRotateMove: hammerjsLib.HammerListener = null,
    onRotateStart: hammerjsLib.HammerListener = null,
    onSwipe: hammerjsLib.HammerListener = null,
    onTap: hammerjsLib.HammerListener = null,
    options: reactDashHammerjsLib.HammerOptionsWithRecognizers = null,
    recognizeWith: org.scalablytyped.runtime.StringDictionary[hammerjsLib.Recognizer | java.lang.String] = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactHammerProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onDoubleTap != null) __obj.updateDynamic("onDoubleTap")(onDoubleTap)
    if (onPan != null) __obj.updateDynamic("onPan")(onPan)
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(onPanCancel)
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(onPanEnd)
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(onPanStart)
    if (onPinch != null) __obj.updateDynamic("onPinch")(onPinch)
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(onPinchCancel)
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(onPinchEnd)
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(onPinchIn)
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
    if (onTap != null) __obj.updateDynamic("onTap")(onTap)
    if (options != null) __obj.updateDynamic("options")(options)
    if (recognizeWith != null) __obj.updateDynamic("recognizeWith")(recognizeWith)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ReactHammerProps]
  }
}

