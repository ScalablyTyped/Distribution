package typings.ranjs.anon

import typings.ranjs.mod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait D extends js.Object {
  var D: Matrix = js.native
  var L: Matrix = js.native
}

object D {
  @scala.inline
  def apply(D: Matrix, L: Matrix): D = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
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
    def setD(value: Matrix): Self = this.set("D", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: Matrix): Self = this.set("L", value.asInstanceOf[js.Any])
  }
  
}

