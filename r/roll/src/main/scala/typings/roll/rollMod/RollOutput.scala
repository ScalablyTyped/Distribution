package typings.roll.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollOutput extends js.Object {
  var calculations: js.Array[Double]
  var input: RollObject
  var result: Double
  var rolled: js.Array[Double]
}

object RollOutput {
  @scala.inline
  def apply(calculations: js.Array[Double], input: RollObject, result: Double, rolled: js.Array[Double]): RollOutput = {
    val __obj = js.Dynamic.literal(calculations = calculations, input = input, result = result, rolled = rolled)
  
    __obj.asInstanceOf[RollOutput]
  }
}

