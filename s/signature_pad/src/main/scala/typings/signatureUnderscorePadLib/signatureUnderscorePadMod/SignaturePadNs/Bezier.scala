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

