package typings.signatureUnderscorePad

import typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePad.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String
  var points: js.Array[Point]
}

object Anon_Color {
  @scala.inline
  def apply(color: String, points: js.Array[Point]): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

