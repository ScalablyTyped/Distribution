package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the WebVR API represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
trait VRFrameData extends js.Object {
  val leftProjectionMatrix: Float32Array
  val leftViewMatrix: Float32Array
  val pose: VRPose
  val rightProjectionMatrix: Float32Array
  val rightViewMatrix: Float32Array
  val timestamp: scala.Double
}

@JSGlobal("VRFrameData")
@js.native
class VRFrameDataCls () extends VRFrameData {
  /* CompleteClass */
  override val leftProjectionMatrix: Float32Array = js.native
  /* CompleteClass */
  override val leftViewMatrix: Float32Array = js.native
  /* CompleteClass */
  override val pose: VRPose = js.native
  /* CompleteClass */
  override val rightProjectionMatrix: Float32Array = js.native
  /* CompleteClass */
  override val rightViewMatrix: Float32Array = js.native
  /* CompleteClass */
  override val timestamp: scala.Double = js.native
}

@JSGlobal("VRFrameData")
@js.native
object VRFrameData
  extends org.scalablytyped.runtime.Instantiable0[VRFrameData]

