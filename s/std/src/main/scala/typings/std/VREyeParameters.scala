package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information required to correctly render a scene for a given eye, including field of view information. */
trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  val offset: Float32Array
  val renderHeight: Double
  val renderWidth: Double
}

@JSGlobal("VREyeParameters")
@js.native
object VREyeParameters extends Instantiable0[VREyeParameters]

