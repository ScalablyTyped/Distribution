package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchGestureHandlerEventExtra extends js.Object {
  var focalX: Double
  var focalY: Double
  var scale: Double
  var velocity: Double
}

object PinchGestureHandlerEventExtra {
  @scala.inline
  def apply(focalX: Double, focalY: Double, scale: Double, velocity: Double): PinchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(focalX = focalX, focalY = focalY, scale = scale, velocity = velocity)
  
    __obj.asInstanceOf[PinchGestureHandlerEventExtra]
  }
}

