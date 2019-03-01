package typings
package signatureUnderscorePadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorPoint extends js.Object {
  var color: java.lang.String
  var point: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point
}

object Anon_ColorPoint {
  @scala.inline
  def apply(
    color: java.lang.String,
    point: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point
  ): Anon_ColorPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[Anon_ColorPoint]
  }
}

