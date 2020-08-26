package typings.reactPose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipMove extends js.Object {
  var flipMove: Boolean = js.native
}

object FlipMove {
  @scala.inline
  def apply(flipMove: Boolean): FlipMove = {
    val __obj = js.Dynamic.literal(flipMove = flipMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipMove]
  }
  @scala.inline
  implicit class FlipMoveOps[Self <: FlipMove] (val x: Self) extends AnyVal {
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
    def setFlipMove(value: Boolean): Self = this.set("flipMove", value.asInstanceOf[js.Any])
  }
  
}

