package typings.signaturePad

import typings.signaturePad.mod.SignaturePad.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPoint extends js.Object {
  var color: String
  var point: Point
}

object AnonPoint {
  @scala.inline
  def apply(color: String, point: Point): AnonPoint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPoint]
  }
}

