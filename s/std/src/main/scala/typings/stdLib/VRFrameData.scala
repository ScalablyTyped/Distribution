package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object VRFrameData
  extends org.scalablytyped.runtime.Instantiable0[VRFrameData]

