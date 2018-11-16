package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GamepadPose extends js.Object {
  val angularAcceleration: Float32Array | scala.Null
  val angularVelocity: Float32Array | scala.Null
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val linearAcceleration: Float32Array | scala.Null
  val linearVelocity: Float32Array | scala.Null
  val orientation: Float32Array | scala.Null
  val position: Float32Array | scala.Null
}

@JSGlobal("GamepadPose")
@js.native
object GamepadPose
  extends ScalablyTyped.runtime.Instantiable0[GamepadPose]

