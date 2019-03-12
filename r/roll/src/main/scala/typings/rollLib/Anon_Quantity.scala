package typings
package rollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quantity extends js.Object {
  var quantity: scala.Double
  var sides: scala.Double
  var transformations: js.Array[RollTransformation]
}

object Anon_Quantity {
  @scala.inline
  def apply(
    quantity: scala.Double,
    sides: scala.Double,
    toString: () => java.lang.String,
    transformations: js.Array[RollTransformation]
  ): Anon_Quantity = {
    val __obj = js.Dynamic.literal(quantity = quantity, sides = sides, toString = js.Any.fromFunction0(toString), transformations = transformations)
  
    __obj.asInstanceOf[Anon_Quantity]
  }
}

