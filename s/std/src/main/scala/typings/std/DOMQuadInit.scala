package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMQuadInit extends js.Object {
  var p1: js.UndefOr[DOMPointInit] = js.native
  var p2: js.UndefOr[DOMPointInit] = js.native
  var p3: js.UndefOr[DOMPointInit] = js.native
  var p4: js.UndefOr[DOMPointInit] = js.native
}

object DOMQuadInit {
  @scala.inline
  def apply(): DOMQuadInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMQuadInit]
  }
  @scala.inline
  implicit class DOMQuadInitOps[Self <: DOMQuadInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setP1(value: DOMPointInit): Self = this.set("p1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP1: Self = this.set("p1", js.undefined)
    @scala.inline
    def setP2(value: DOMPointInit): Self = this.set("p2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP2: Self = this.set("p2", js.undefined)
    @scala.inline
    def setP3(value: DOMPointInit): Self = this.set("p3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP3: Self = this.set("p3", js.undefined)
    @scala.inline
    def setP4(value: DOMPointInit): Self = this.set("p4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP4: Self = this.set("p4", js.undefined)
  }
  
}

