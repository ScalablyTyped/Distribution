package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("GamepadPose")
@js.native
class GamepadPoseCls () extends GamepadPose {
  /* CompleteClass */
  override val angularAcceleration: Float32Array | Null = js.native
  /* CompleteClass */
  override val angularVelocity: Float32Array | Null = js.native
  /* CompleteClass */
  override val hasOrientation: scala.Boolean = js.native
  /* CompleteClass */
  override val hasPosition: scala.Boolean = js.native
  /* CompleteClass */
  override val linearAcceleration: Float32Array | Null = js.native
  /* CompleteClass */
  override val linearVelocity: Float32Array | Null = js.native
  /* CompleteClass */
  override val orientation: Float32Array | Null = js.native
  /* CompleteClass */
  override val position: Float32Array | Null = js.native
}

@JSGlobal("GamepadPose")
@js.native
object GamepadPose extends Instantiable0[GamepadPose]

