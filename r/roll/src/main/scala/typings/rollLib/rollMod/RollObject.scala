package typings
package rollLib.rollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollObject extends js.Object {
  var quantity: scala.Double
  var sides: scala.Double
  var transformations: js.Array[rollLib.RollTransformation]
}

object RollObject {
  @scala.inline
  def apply(
    quantity: scala.Double,
    sides: scala.Double,
    toString: js.Function0[java.lang.String],
    transformations: js.Array[rollLib.RollTransformation]
  ): RollObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("quantity")(quantity)
    __obj.updateDynamic("sides")(sides)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("transformations")(transformations)
    __obj.asInstanceOf[RollObject]
  }
}

