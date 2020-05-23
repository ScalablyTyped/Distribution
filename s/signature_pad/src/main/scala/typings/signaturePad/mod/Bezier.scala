package typings.signaturePad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signature_pad", "Bezier")
@js.native
class Bezier protected () extends js.Object {
  def this(startPoint: Point, control1: Point, control2: Point, endPoint: Point) = this()
  var control1: CurveControl = js.native
  var control2: CurveControl = js.native
  var endPoint: Point = js.native
  var endWidth: Double = js.native
  var startPoint: Point = js.native
  var startWidth: Double = js.native
  def _point(t: Double, start: Double, c1: Double, c2: Double, end: Double): Double = js.native
  def length(): Double = js.native
}

