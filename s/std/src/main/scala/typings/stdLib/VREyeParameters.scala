package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  val offset: Float32Array
  val renderHeight: scala.Double
  val renderWidth: scala.Double
}

@JSGlobal("VREyeParameters")
@js.native
class VREyeParametersCls () extends VREyeParameters {
  /** @deprecated */
  /* CompleteClass */
  override val fieldOfView: VRFieldOfView = js.native
  /* CompleteClass */
  override val offset: Float32Array = js.native
  /* CompleteClass */
  override val renderHeight: scala.Double = js.native
  /* CompleteClass */
  override val renderWidth: scala.Double = js.native
}

@JSGlobal("VREyeParameters")
@js.native
object VREyeParameters
  extends org.scalablytyped.runtime.Instantiable0[VREyeParameters]

