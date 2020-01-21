package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationGestureHandlerEventExtra extends js.Object {
  var anchorX: Double
  var anchorY: Double
  var rotation: Double
  var velocity: Double
}

object RotationGestureHandlerEventExtra {
  @scala.inline
  def apply(anchorX: Double, anchorY: Double, rotation: Double, velocity: Double): RotationGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RotationGestureHandlerEventExtra]
  }
}

