package typings.std

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

object VRFieldOfView {
  @scala.inline
  def apply(downDegrees: Double, leftDegrees: Double, rightDegrees: Double, upDegrees: Double): VRFieldOfView = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees.asInstanceOf[js.Any], leftDegrees = leftDegrees.asInstanceOf[js.Any], rightDegrees = rightDegrees.asInstanceOf[js.Any], upDegrees = upDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFieldOfView]
  }
}

