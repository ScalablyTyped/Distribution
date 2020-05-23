package typings.signaturePad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signature_pad", "Point")
@js.native
class Point protected () extends js.Object {
  def this(x: Double, y: Double, time: Double) = this()
  var color: js.UndefOr[String] = js.native
  var time: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def distanceTo(start: Point): Double = js.native
  def velocityFrom(start: Point): Double = js.native
}

