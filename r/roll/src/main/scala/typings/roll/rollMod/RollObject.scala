package typings.roll.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollObject extends js.Object {
  var quantity: Double
  var sides: Double
  var transformations: js.Array[RollTransformation]
}

object RollObject {
  @scala.inline
  def apply(
    quantity: Double,
    sides: Double,
    toString: () => String,
    transformations: js.Array[RollTransformation]
  ): RollObject = {
    val __obj = js.Dynamic.literal(quantity = quantity, sides = sides, toString = js.Any.fromFunction0(toString), transformations = transformations)
  
    __obj.asInstanceOf[RollObject]
  }
}

