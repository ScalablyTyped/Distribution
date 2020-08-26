package typings.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollObject extends js.Object {
  var quantity: Double = js.native
  var sides: Double = js.native
  var transformations: js.Array[RollTransformation] = js.native
}

object RollObject {
  @scala.inline
  def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): RollObject = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollObject]
  }
  @scala.inline
  implicit class RollObjectOps[Self <: RollObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSides(value: Double): Self = this.set("sides", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformationsVarargs(value: RollTransformation*): Self = this.set("transformations", js.Array(value :_*))
    @scala.inline
    def setTransformations(value: js.Array[RollTransformation]): Self = this.set("transformations", value.asInstanceOf[js.Any])
  }
  
}

