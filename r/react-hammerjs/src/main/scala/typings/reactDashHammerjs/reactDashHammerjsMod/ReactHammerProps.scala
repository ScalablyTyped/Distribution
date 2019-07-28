package typings.reactDashHammerjs.reactDashHammerjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.hammerjs.HammerListener
import typings.hammerjs.Recognizer
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_ALL
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_DOWN
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_HORIZONTAL
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_LEFT
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_NONE
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_RIGHT
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_UP
import typings.reactDashHammerjs.reactDashHammerjsStrings.DIRECTION_VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHammerProps extends js.Object {
  var action: js.UndefOr[HammerListener] = js.undefined
  var direction: js.UndefOr[
    DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
  ] = js.undefined
  var onDoubleTap: js.UndefOr[HammerListener] = js.undefined
  var onPan: js.UndefOr[HammerListener] = js.undefined
  var onPanCancel: js.UndefOr[HammerListener] = js.undefined
  var onPanEnd: js.UndefOr[HammerListener] = js.undefined
  var onPanStart: js.UndefOr[HammerListener] = js.undefined
  var onPinch: js.UndefOr[HammerListener] = js.undefined
  var onPinchCancel: js.UndefOr[HammerListener] = js.undefined
  var onPinchEnd: js.UndefOr[HammerListener] = js.undefined
  var onPinchIn: js.UndefOr[HammerListener] = js.undefined
  var onPinchOut: js.UndefOr[HammerListener] = js.undefined
  var onPinchStart: js.UndefOr[HammerListener] = js.undefined
  var onPress: js.UndefOr[HammerListener] = js.undefined
  var onPressUp: js.UndefOr[HammerListener] = js.undefined
  var onRotate: js.UndefOr[HammerListener] = js.undefined
  var onRotateCancel: js.UndefOr[HammerListener] = js.undefined
  var onRotateEnd: js.UndefOr[HammerListener] = js.undefined
  var onRotateMove: js.UndefOr[HammerListener] = js.undefined
  var onRotateStart: js.UndefOr[HammerListener] = js.undefined
  var onSwipe: js.UndefOr[HammerListener] = js.undefined
  var onTap: js.UndefOr[HammerListener] = js.undefined
  var options: js.UndefOr[HammerOptionsWithRecognizers] = js.undefined
  var recognizeWith: js.UndefOr[StringDictionary[Recognizer | String]] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ReactHammerProps {
  @scala.inline
  def apply(
    action: HammerListener = null,
    direction: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL = null,
    onDoubleTap: HammerListener = null,
    onPan: HammerListener = null,
    onPanCancel: HammerListener = null,
    onPanEnd: HammerListener = null,
    onPanStart: HammerListener = null,
    onPinch: HammerListener = null,
    onPinchCancel: HammerListener = null,
    onPinchEnd: HammerListener = null,
    onPinchIn: HammerListener = null,
    onPinchOut: HammerListener = null,
    onPinchStart: HammerListener = null,
    onPress: HammerListener = null,
    onPressUp: HammerListener = null,
    onRotate: HammerListener = null,
    onRotateCancel: HammerListener = null,
    onRotateEnd: HammerListener = null,
    onRotateMove: HammerListener = null,
    onRotateStart: HammerListener = null,
    onSwipe: HammerListener = null,
    onTap: HammerListener = null,
    options: HammerOptionsWithRecognizers = null,
    recognizeWith: StringDictionary[Recognizer | String] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
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

