package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationGestureHandlerEventExtra extends js.Object {
  var anchorX: Double = js.native
  var anchorY: Double = js.native
  var rotation: Double = js.native
  var velocity: Double = js.native
}

object RotationGestureHandlerEventExtra {
  @scala.inline
  def apply(anchorX: Double, anchorY: Double, rotation: Double, velocity: Double): RotationGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class RotationGestureHandlerEventExtraOps[Self <: RotationGestureHandlerEventExtra] (val x: Self) extends AnyVal {
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
    def setAnchorX(value: Double): Self = this.set("anchorX", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorY(value: Double): Self = this.set("anchorY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
  
}

