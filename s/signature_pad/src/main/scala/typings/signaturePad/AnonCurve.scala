package typings.signaturePad

import typings.signaturePad.mod.SignaturePad.Bezier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurve extends js.Object {
  var color: String
  var curve: Bezier
}

object AnonCurve {
  @scala.inline
  def apply(color: String, curve: Bezier): AnonCurve = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurve]
  }
}

