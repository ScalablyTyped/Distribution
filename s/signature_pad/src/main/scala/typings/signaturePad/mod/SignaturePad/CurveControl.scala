package typings.signaturePad.mod.SignaturePad

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
    val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurveControl]
  }
}

