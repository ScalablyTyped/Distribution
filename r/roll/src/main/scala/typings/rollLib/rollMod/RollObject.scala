package typings
package rollLib.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollObject extends js.Object {
  var quantity: scala.Double
  var sides: scala.Double
  var transformations: js.Array[RollTransformation]
}

object RollObject {
  @scala.inline
  def apply(
    quantity: scala.Double,
    sides: scala.Double,
    toString: () => java.lang.String,
    transformations: js.Array[RollTransformation]
  ): RollObject = {
    val __obj = js.Dynamic.literal(quantity = quantity, sides = sides, toString = js.Any.fromFunction0(toString), transformations = transformations)
  
    __obj.asInstanceOf[RollObject]
  }
}

