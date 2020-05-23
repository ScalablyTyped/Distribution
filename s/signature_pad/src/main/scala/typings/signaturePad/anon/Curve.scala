package typings.signaturePad.anon

import typings.signaturePad.mod.Bezier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Curve extends js.Object {
  var color: String
  var curve: Bezier
}

object Curve {
  @scala.inline
  def apply(color: String, curve: Bezier): Curve = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
}

