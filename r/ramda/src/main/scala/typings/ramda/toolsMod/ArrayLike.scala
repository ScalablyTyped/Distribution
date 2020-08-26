package typings.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLike extends js.Object {
  var nodeType: Double = js.native
}

object ArrayLike {
  @scala.inline
  def apply(nodeType: Double): ArrayLike = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLike]
  }
  @scala.inline
  implicit class ArrayLikeOps[Self <: ArrayLike] (val x: Self) extends AnyVal {
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
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
  }
  
}

