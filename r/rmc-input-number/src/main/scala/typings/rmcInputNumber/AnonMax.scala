package typings.rmcInputNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Double
  var min: Double
  var step: Double
  def onBlur(): Unit
  def onChange(): Unit
  def onFocus(): Unit
  def parser(input: String): String
}

object AnonMax {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    parser: String => String,
    step: Double
  ): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

