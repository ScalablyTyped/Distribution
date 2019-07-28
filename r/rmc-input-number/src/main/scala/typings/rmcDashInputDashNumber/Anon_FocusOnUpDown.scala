package typings.rmcDashInputDashNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusOnUpDown extends js.Object {
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

object Anon_FocusOnUpDown {
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
  ): Anon_FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown, max = max, min = min, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), prefixCls = prefixCls, step = step, useTouch = useTouch)
  
    __obj.asInstanceOf[Anon_FocusOnUpDown]
  }
}

