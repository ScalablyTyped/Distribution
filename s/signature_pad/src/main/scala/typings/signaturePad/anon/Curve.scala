package typings.signaturePad.anon

import typings.signaturePad.mod.Bezier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Curve extends js.Object {
  var color: String = js.native
  var curve: Bezier = js.native
}

object Curve {
  @scala.inline
  def apply(color: String, curve: Bezier): Curve = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
  @scala.inline
  implicit class CurveOps[Self <: Curve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurve(value: Bezier): Self = this.set("curve", value.asInstanceOf[js.Any])
  }
  
}

