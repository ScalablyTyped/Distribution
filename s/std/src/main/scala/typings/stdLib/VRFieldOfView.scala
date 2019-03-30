package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The VRFieldOfView interface of the WebVR API represents a field of view defined by 4 different degree values describing the view from a center point. */
trait VRFieldOfView extends js.Object {
  val downDegrees: scala.Double
  val leftDegrees: scala.Double
  val rightDegrees: scala.Double
  val upDegrees: scala.Double
}

@JSGlobal("VRFieldOfView")
@js.native
class VRFieldOfViewCls () extends VRFieldOfView {
  /* CompleteClass */
  override val downDegrees: scala.Double = js.native
  /* CompleteClass */
  override val leftDegrees: scala.Double = js.native
  /* CompleteClass */
  override val rightDegrees: scala.Double = js.native
  /* CompleteClass */
  override val upDegrees: scala.Double = js.native
}

@JSGlobal("VRFieldOfView")
@js.native
object VRFieldOfView
  extends org.scalablytyped.runtime.Instantiable0[VRFieldOfView]

