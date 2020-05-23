package typings.reactHammerjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hammerjs.HammerInput
import typings.hammerjs.HammerListener
import typings.hammerjs.Recognizer
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_ALL
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_DOWN
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_HORIZONTAL
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_LEFT
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_NONE
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_RIGHT
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_UP
import typings.reactHammerjs.reactHammerjsStrings.DIRECTION_VERTICAL
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
    action: /* event */ HammerInput => Unit = null,
    direction: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL = null,
    onDoubleTap: /* event */ HammerInput => Unit = null,
    onPan: /* event */ HammerInput => Unit = null,
    onPanCancel: /* event */ HammerInput => Unit = null,
    onPanEnd: /* event */ HammerInput => Unit = null,
    onPanStart: /* event */ HammerInput => Unit = null,
    onPinch: /* event */ HammerInput => Unit = null,
    onPinchCancel: /* event */ HammerInput => Unit = null,
    onPinchEnd: /* event */ HammerInput => Unit = null,
    onPinchIn: /* event */ HammerInput => Unit = null,
    onPinchOut: /* event */ HammerInput => Unit = null,
    onPinchStart: /* event */ HammerInput => Unit = null,
    onPress: /* event */ HammerInput => Unit = null,
    onPressUp: /* event */ HammerInput => Unit = null,
    onRotate: /* event */ HammerInput => Unit = null,
    onRotateCancel: /* event */ HammerInput => Unit = null,
    onRotateEnd: /* event */ HammerInput => Unit = null,
    onRotateMove: /* event */ HammerInput => Unit = null,
    onRotateStart: /* event */ HammerInput => Unit = null,
    onSwipe: /* event */ HammerInput => Unit = null,
    onTap: /* event */ HammerInput => Unit = null,
    options: HammerOptionsWithRecognizers = null,
    recognizeWith: StringDictionary[Recognizer | String] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ReactHammerProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onDoubleTap != null) __obj.updateDynamic("onDoubleTap")(js.Any.fromFunction1(onDoubleTap))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(js.Any.fromFunction1(onPanCancel))
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(js.Any.fromFunction1(onPanEnd))
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(js.Any.fromFunction1(onPanStart))
    if (onPinch != null) __obj.updateDynamic("onPinch")(js.Any.fromFunction1(onPinch))
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(js.Any.fromFunction1(onPinchCancel))
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(js.Any.fromFunction1(onPinchEnd))
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(js.Any.fromFunction1(onPinchIn))
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
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (recognizeWith != null) __obj.updateDynamic("recognizeWith")(recognizeWith.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHammerProps]
  }
}

