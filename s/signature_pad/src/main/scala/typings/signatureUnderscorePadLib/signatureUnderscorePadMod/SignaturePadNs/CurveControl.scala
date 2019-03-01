package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveControl extends js.Object {
  var c1: Point
  var c2: Point
}

object CurveControl {
  @scala.inline
  def apply(c1: Point, c2: Point): CurveControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c1")(c1)
    __obj.updateDynamic("c2")(c2)
    __obj.asInstanceOf[CurveControl]
  }
}

