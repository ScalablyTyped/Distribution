package typings.signaturePad

import typings.signaturePad.mod.SignaturePad.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: String
  var points: js.Array[Point]
}

object AnonColor {
  @scala.inline
  def apply(color: String, points: js.Array[Point]): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

