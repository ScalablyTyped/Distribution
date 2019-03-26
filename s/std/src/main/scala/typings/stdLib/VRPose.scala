package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRPose extends js.Object {
  val angularAcceleration: Float32Array | scala.Null
  val angularVelocity: Float32Array | scala.Null
  val linearAcceleration: Float32Array | scala.Null
  val linearVelocity: Float32Array | scala.Null
  val orientation: Float32Array | scala.Null
  val position: Float32Array | scala.Null
  val timestamp: scala.Double
}

@JSGlobal("VRPose")
@js.native
class VRPoseCls () extends VRPose {
  /* CompleteClass */
  override val angularAcceleration: Float32Array | scala.Null = js.native
  /* CompleteClass */
  override val angularVelocity: Float32Array | scala.Null = js.native
  /* CompleteClass */
  override val linearAcceleration: Float32Array | scala.Null = js.native
  /* CompleteClass */
  override val linearVelocity: Float32Array | scala.Null = js.native
  /* CompleteClass */
  override val orientation: Float32Array | scala.Null = js.native
  /* CompleteClass */
  override val position: Float32Array | scala.Null = js.native
  /* CompleteClass */
  override val timestamp: scala.Double = js.native
}

@JSGlobal("VRPose")
@js.native
object VRPose
  extends org.scalablytyped.runtime.Instantiable0[VRPose]

