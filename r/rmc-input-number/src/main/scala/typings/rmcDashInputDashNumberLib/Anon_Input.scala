package typings
package rmcDashInputDashNumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  var max: scala.Double
  var min: scala.Double
  var step: scala.Double
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onFocus(): scala.Unit
  def parser(input: java.lang.String): java.lang.String
}

object Anon_Input {
  @scala.inline
  def apply(
    max: scala.Double,
    min: scala.Double,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onFocus: () => scala.Unit,
    parser: java.lang.String => java.lang.String,
    step: scala.Double
  ): Anon_Input = {
    val __obj = js.Dynamic.literal(max = max, min = min, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), step = step)
  
    __obj.asInstanceOf[Anon_Input]
  }
}

