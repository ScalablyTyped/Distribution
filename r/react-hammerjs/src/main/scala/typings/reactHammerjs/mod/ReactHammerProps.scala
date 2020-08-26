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

@js.native
trait ReactHammerProps extends js.Object {
  var action: js.UndefOr[HammerListener] = js.native
  var direction: js.UndefOr[
    DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
  ] = js.native
  var onDoubleTap: js.UndefOr[HammerListener] = js.native
  var onPan: js.UndefOr[HammerListener] = js.native
  var onPanCancel: js.UndefOr[HammerListener] = js.native
  var onPanEnd: js.UndefOr[HammerListener] = js.native
  var onPanStart: js.UndefOr[HammerListener] = js.native
  var onPinch: js.UndefOr[HammerListener] = js.native
  var onPinchCancel: js.UndefOr[HammerListener] = js.native
  var onPinchEnd: js.UndefOr[HammerListener] = js.native
  var onPinchIn: js.UndefOr[HammerListener] = js.native
  var onPinchOut: js.UndefOr[HammerListener] = js.native
  var onPinchStart: js.UndefOr[HammerListener] = js.native
  var onPress: js.UndefOr[HammerListener] = js.native
  var onPressUp: js.UndefOr[HammerListener] = js.native
  var onRotate: js.UndefOr[HammerListener] = js.native
  var onRotateCancel: js.UndefOr[HammerListener] = js.native
  var onRotateEnd: js.UndefOr[HammerListener] = js.native
  var onRotateMove: js.UndefOr[HammerListener] = js.native
  var onRotateStart: js.UndefOr[HammerListener] = js.native
  var onSwipe: js.UndefOr[HammerListener] = js.native
  var onTap: js.UndefOr[HammerListener] = js.native
  var options: js.UndefOr[HammerOptionsWithRecognizers] = js.native
  var recognizeWith: js.UndefOr[StringDictionary[Recognizer | String]] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ReactHammerProps {
  @scala.inline
  def apply(): ReactHammerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactHammerProps]
  }
  @scala.inline
  implicit class ReactHammerPropsOps[Self <: ReactHammerProps] (val x: Self) extends AnyVal {
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
    def setAction(value: /* event */ HammerInput => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setDirection(
      value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
    ): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOnDoubleTap(value: /* event */ HammerInput => Unit): Self = this.set("onDoubleTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleTap: Self = this.set("onDoubleTap", js.undefined)
    @scala.inline
    def setOnPan(value: /* event */ HammerInput => Unit): Self = this.set("onPan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPan: Self = this.set("onPan", js.undefined)
    @scala.inline
    def setOnPanCancel(value: /* event */ HammerInput => Unit): Self = this.set("onPanCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPanCancel: Self = this.set("onPanCancel", js.undefined)
    @scala.inline
    def setOnPanEnd(value: /* event */ HammerInput => Unit): Self = this.set("onPanEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPanEnd: Self = this.set("onPanEnd", js.undefined)
    @scala.inline
    def setOnPanStart(value: /* event */ HammerInput => Unit): Self = this.set("onPanStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPanStart: Self = this.set("onPanStart", js.undefined)
    @scala.inline
    def setOnPinch(value: /* event */ HammerInput => Unit): Self = this.set("onPinch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinch: Self = this.set("onPinch", js.undefined)
    @scala.inline
    def setOnPinchCancel(value: /* event */ HammerInput => Unit): Self = this.set("onPinchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinchCancel: Self = this.set("onPinchCancel", js.undefined)
    @scala.inline
    def setOnPinchEnd(value: /* event */ HammerInput => Unit): Self = this.set("onPinchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinchEnd: Self = this.set("onPinchEnd", js.undefined)
    @scala.inline
    def setOnPinchIn(value: /* event */ HammerInput => Unit): Self = this.set("onPinchIn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinchIn: Self = this.set("onPinchIn", js.undefined)
    @scala.inline
    def setOnPinchOut(value: /* event */ HammerInput => Unit): Self = this.set("onPinchOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinchOut: Self = this.set("onPinchOut", js.undefined)
    @scala.inline
    def setOnPinchStart(value: /* event */ HammerInput => Unit): Self = this.set("onPinchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPinchStart: Self = this.set("onPinchStart", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ HammerInput => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnPressUp(value: /* event */ HammerInput => Unit): Self = this.set("onPressUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressUp: Self = this.set("onPressUp", js.undefined)
    @scala.inline
    def setOnRotate(value: /* event */ HammerInput => Unit): Self = this.set("onRotate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRotate: Self = this.set("onRotate", js.undefined)
    @scala.inline
    def setOnRotateCancel(value: /* event */ HammerInput => Unit): Self = this.set("onRotateCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRotateCancel: Self = this.set("onRotateCancel", js.undefined)
    @scala.inline
    def setOnRotateEnd(value: /* event */ HammerInput => Unit): Self = this.set("onRotateEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRotateEnd: Self = this.set("onRotateEnd", js.undefined)
    @scala.inline
    def setOnRotateMove(value: /* event */ HammerInput => Unit): Self = this.set("onRotateMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRotateMove: Self = this.set("onRotateMove", js.undefined)
    @scala.inline
    def setOnRotateStart(value: /* event */ HammerInput => Unit): Self = this.set("onRotateStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRotateStart: Self = this.set("onRotateStart", js.undefined)
    @scala.inline
    def setOnSwipe(value: /* event */ HammerInput => Unit): Self = this.set("onSwipe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipe: Self = this.set("onSwipe", js.undefined)
    @scala.inline
    def setOnTap(value: /* event */ HammerInput => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    @scala.inline
    def setOptions(value: HammerOptionsWithRecognizers): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRecognizeWith(value: StringDictionary[Recognizer | String]): Self = this.set("recognizeWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecognizeWith: Self = this.set("recognizeWith", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

