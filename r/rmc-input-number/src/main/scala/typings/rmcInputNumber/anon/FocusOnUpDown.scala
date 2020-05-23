package typings.rmcInputNumber.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOnUpDown extends js.Object {
  var focusOnUpDown: Boolean
  var max: Double
  var min: Double
  var prefixCls: String
  var step: Double
  var useTouch: Boolean
  def onBlur(): Unit
  def onChange(): Unit
  def onFocus(): Unit
  def parser(input: String): String
}

object FocusOnUpDown {
  @scala.inline
  def apply(
    focusOnUpDown: Boolean,
    max: Double,
    min: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    parser: String => String,
    prefixCls: String,
    step: Double,
    useTouch: Boolean
  ): FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), prefixCls = prefixCls.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOnUpDown]
  }
}

