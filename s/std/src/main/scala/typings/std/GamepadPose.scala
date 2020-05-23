package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
trait GamepadPose extends js.Object {
  val angularAcceleration: Float32Array | Null
  val angularVelocity: Float32Array | Null
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val linearAcceleration: Float32Array | Null
  val linearVelocity: Float32Array | Null
  val orientation: Float32Array | Null
  val position: Float32Array | Null
}

object GamepadPose {
  @scala.inline
  def apply(
    hasOrientation: scala.Boolean,
    hasPosition: scala.Boolean,
    angularAcceleration: Float32Array = null,
    angularVelocity: Float32Array = null,
    linearAcceleration: Float32Array = null,
    linearVelocity: Float32Array = null,
    orientation: Float32Array = null,
    position: Float32Array = null
  ): GamepadPose = {
    val __obj = js.Dynamic.literal(hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any], angularAcceleration = angularAcceleration.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], linearAcceleration = linearAcceleration.asInstanceOf[js.Any], linearVelocity = linearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadPose]
  }
}

