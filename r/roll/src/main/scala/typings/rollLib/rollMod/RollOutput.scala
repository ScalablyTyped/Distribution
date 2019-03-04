package typings
package rollLib.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollOutput extends js.Object {
  var calculations: js.Array[scala.Double]
  var input: RollObject
  var result: scala.Double
  var rolled: js.Array[scala.Double]
}

object RollOutput {
  @scala.inline
  def apply(
    calculations: js.Array[scala.Double],
    input: RollObject,
    result: scala.Double,
    rolled: js.Array[scala.Double]
  ): RollOutput = {
    val __obj = js.Dynamic.literal(calculations = calculations, input = input, result = result, rolled = rolled)
  
    __obj.asInstanceOf[RollOutput]
  }
}

