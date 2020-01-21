package typings.signaturePad

import typings.signaturePad.mod.SignaturePad.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorPoint extends js.Object {
  var color: String
  var point: Point
}

object AnonColorPoint {
  @scala.inline
  def apply(color: String, point: Point): AnonColorPoint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorPoint]
  }
}

