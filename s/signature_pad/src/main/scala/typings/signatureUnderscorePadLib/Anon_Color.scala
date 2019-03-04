package typings
package signatureUnderscorePadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var points: js.Array[signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point]
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String,
    points: js.Array[signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point]
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, points = points)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

