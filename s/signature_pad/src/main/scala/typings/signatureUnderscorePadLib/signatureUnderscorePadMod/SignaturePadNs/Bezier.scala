package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bezier extends js.Object {
  var control1: CurveControl
  var control2: CurveControl
  var endPoint: Point
  var endWidth: scala.Double
  var startPoint: Point
  var startWidth: scala.Double
  def _point(t: scala.Double, start: scala.Double, c1: scala.Double, c2: scala.Double, end: scala.Double): scala.Double
  def length(): scala.Double
}

object Bezier {
  @scala.inline
  def apply(
    _point: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    control1: CurveControl,
    control2: CurveControl,
    endPoint: Point,
    endWidth: scala.Double,
    length: js.Function0[scala.Double],
    startPoint: Point,
    startWidth: scala.Double
  ): Bezier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_point")(_point)
    __obj.updateDynamic("control1")(control1)
    __obj.updateDynamic("control2")(control2)
    __obj.updateDynamic("endPoint")(endPoint)
    __obj.updateDynamic("endWidth")(endWidth)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("startPoint")(startPoint)
    __obj.updateDynamic("startWidth")(startWidth)
    __obj.asInstanceOf[Bezier]
  }
}

