package typings.recharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorVal extends js.Object {
  var errorVal: js.Any
  var value: js.Any
  var x: Double
  var y: Double
}

object ErrorVal {
  @scala.inline
  def apply(errorVal: js.Any, value: js.Any, x: Double, y: Double): ErrorVal = {
    val __obj = js.Dynamic.literal(errorVal = errorVal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorVal]
  }
}

