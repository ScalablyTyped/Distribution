package typings.roll.anon

import typings.roll.mod.RollTransformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quantity extends js.Object {
  var quantity: Double
  var sides: Double
  var transformations: js.Array[RollTransformation]
}

object Quantity {
  @scala.inline
  def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): Quantity = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quantity]
  }
}

