package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathStep extends js.Object {
  var direction: DirectionConstant = js.native
  var dx: Double = js.native
  var dy: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object PathStep {
  @scala.inline
  def apply(direction: DirectionConstant, dx: Double, dy: Double, x: Double, y: Double): PathStep = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathStep]
  }
  @scala.inline
  implicit class PathStepOps[Self <: PathStep] (val x: Self) extends AnyVal {
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
    def setDirection(value: DirectionConstant): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

