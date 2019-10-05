package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
trait VRFrameData extends js.Object {
  val leftProjectionMatrix: Float32Array
  val leftViewMatrix: Float32Array
  val pose: VRPose
  val rightProjectionMatrix: Float32Array
  val rightViewMatrix: Float32Array
  val timestamp: Double
}

@JSGlobal("VRFrameData")
@js.native
object VRFrameData extends Instantiable0[VRFrameData]

