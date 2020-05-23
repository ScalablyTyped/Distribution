package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents the state of a VR sensor at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
trait VRPose extends js.Object {
  val angularAcceleration: Float32Array | Null
  val angularVelocity: Float32Array | Null
  val linearAcceleration: Float32Array | Null
  val linearVelocity: Float32Array | Null
  val orientation: Float32Array | Null
  val position: Float32Array | Null
  val timestamp: Double
}

object VRPose {
  @scala.inline
  def apply(
    timestamp: Double,
    angularAcceleration: Float32Array = null,
    angularVelocity: Float32Array = null,
    linearAcceleration: Float32Array = null,
    linearVelocity: Float32Array = null,
    orientation: Float32Array = null,
    position: Float32Array = null
  ): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], angularAcceleration = angularAcceleration.asInstanceOf[js.Any], angularVelocity = angularVelocity.asInstanceOf[js.Any], linearAcceleration = linearAcceleration.asInstanceOf[js.Any], linearVelocity = linearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRPose]
  }
}

