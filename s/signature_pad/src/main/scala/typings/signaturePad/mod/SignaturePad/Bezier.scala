package typings.signaturePad.mod.SignaturePad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bezier extends js.Object {
  var control1: CurveControl
  var control2: CurveControl
  var endPoint: Point
  var endWidth: Double
  var startPoint: Point
  var startWidth: Double
  def _point(t: Double, start: Double, c1: Double, c2: Double, end: Double): Double
  def length(): Double
}

object Bezier {
  @scala.inline
  def apply(
    _point: (Double, Double, Double, Double, Double) => Double,
    control1: CurveControl,
    control2: CurveControl,
    endPoint: Point,
    endWidth: Double,
    length: () => Double,
    startPoint: Point,
    startWidth: Double
  ): Bezier = {
    val __obj = js.Dynamic.literal(_point = js.Any.fromFunction5(_point), control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], endWidth = endWidth.asInstanceOf[js.Any], length = js.Any.fromFunction0(length), startPoint = startPoint.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bezier]
  }
}

