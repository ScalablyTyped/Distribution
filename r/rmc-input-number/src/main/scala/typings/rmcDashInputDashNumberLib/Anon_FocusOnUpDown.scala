package typings
package rmcDashInputDashNumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusOnUpDown extends js.Object {
  var focusOnUpDown: scala.Boolean
  var max: scala.Double
  var min: scala.Double
  var prefixCls: java.lang.String
  var step: scala.Double
  var useTouch: scala.Boolean
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onFocus(): scala.Unit
  def parser(input: java.lang.String): java.lang.String
}

object Anon_FocusOnUpDown {
  @scala.inline
  def apply(
    focusOnUpDown: scala.Boolean,
    max: scala.Double,
    min: scala.Double,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onFocus: () => scala.Unit,
    parser: java.lang.String => java.lang.String,
    prefixCls: java.lang.String,
    step: scala.Double,
    useTouch: scala.Boolean
  ): Anon_FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown, max = max, min = min, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), prefixCls = prefixCls, step = step, useTouch = useTouch)
  
    __obj.asInstanceOf[Anon_FocusOnUpDown]
  }
}

