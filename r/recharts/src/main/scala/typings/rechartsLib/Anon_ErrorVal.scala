package typings
package rechartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorVal extends js.Object {
  var errorVal: js.Any
  var value: js.Any
  var x: scala.Double
  var y: scala.Double
}

object Anon_ErrorVal {
  @scala.inline
  def apply(errorVal: js.Any, value: js.Any, x: scala.Double, y: scala.Double): Anon_ErrorVal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorVal")(errorVal)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_ErrorVal]
  }
}

