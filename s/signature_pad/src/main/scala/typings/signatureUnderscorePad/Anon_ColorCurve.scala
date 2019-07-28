package typings.signatureUnderscorePad

import typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePadNs.Bezier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurve extends js.Object {
  var color: String
  var curve: Bezier
}

object Anon_ColorCurve {
  @scala.inline
  def apply(color: String, curve: Bezier): Anon_ColorCurve = {
    val __obj = js.Dynamic.literal(color = color, curve = curve)
  
    __obj.asInstanceOf[Anon_ColorCurve]
  }
}

