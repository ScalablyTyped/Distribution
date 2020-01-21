package typings.signaturePad

import typings.signaturePad.mod.SignaturePad.Bezier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorCurve extends js.Object {
  var color: String
  var curve: Bezier
}

object AnonColorCurve {
  @scala.inline
  def apply(color: String, curve: Bezier): AnonColorCurve = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorCurve]
  }
}

