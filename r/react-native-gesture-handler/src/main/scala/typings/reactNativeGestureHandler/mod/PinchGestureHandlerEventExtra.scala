package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinchGestureHandlerEventExtra extends js.Object {
  var focalX: Double = js.native
  var focalY: Double = js.native
  var scale: Double = js.native
  var velocity: Double = js.native
}

object PinchGestureHandlerEventExtra {
  @scala.inline
  def apply(focalX: Double, focalY: Double, scale: Double, velocity: Double): PinchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(focalX = focalX.asInstanceOf[js.Any], focalY = focalY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class PinchGestureHandlerEventExtraOps[Self <: PinchGestureHandlerEventExtra] (val x: Self) extends AnyVal {
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
    def setFocalX(value: Double): Self = this.set("focalX", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocalY(value: Double): Self = this.set("focalY", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
  
}

