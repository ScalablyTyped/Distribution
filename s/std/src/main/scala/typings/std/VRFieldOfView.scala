package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents a field of view defined by 4 different degree values describing the view from a center point. */
trait VRFieldOfView extends js.Object {
  val downDegrees: Double
  val leftDegrees: Double
  val rightDegrees: Double
  val upDegrees: Double
}

@JSGlobal("VRFieldOfView")
@js.native
class VRFieldOfViewCls () extends VRFieldOfView {
  /* CompleteClass */
  override val downDegrees: Double = js.native
  /* CompleteClass */
  override val leftDegrees: Double = js.native
  /* CompleteClass */
  override val rightDegrees: Double = js.native
  /* CompleteClass */
  override val upDegrees: Double = js.native
}

@JSGlobal("VRFieldOfView")
@js.native
object VRFieldOfView extends Instantiable0[VRFieldOfView]

