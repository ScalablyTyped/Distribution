package typings
package signatureUnderscorePadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurve extends js.Object {
  var color: java.lang.String
  var curve: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Bezier
}

object Anon_ColorCurve {
  @scala.inline
  def apply(
    color: java.lang.String,
    curve: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Bezier
  ): Anon_ColorCurve = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("curve")(curve)
    __obj.asInstanceOf[Anon_ColorCurve]
  }
}

