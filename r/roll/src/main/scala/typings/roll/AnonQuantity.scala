package typings.roll

import typings.roll.mod.RollTransformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuantity extends js.Object {
  var quantity: Double
  var sides: Double
  var transformations: js.Array[RollTransformation]
}

object AnonQuantity {
  @scala.inline
  def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): AnonQuantity = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuantity]
  }
}

