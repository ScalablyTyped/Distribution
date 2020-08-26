package typings.rcAlign.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoint extends js.Object {
  var clientX: js.UndefOr[Double] = js.native
  var clientY: js.UndefOr[Double] = js.native
  var pageX: js.UndefOr[Double] = js.native
  var pageY: js.UndefOr[Double] = js.native
}

object TargetPoint {
  @scala.inline
  def apply(): TargetPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoint]
  }
  @scala.inline
  implicit class TargetPointOps[Self <: TargetPoint] (val x: Self) extends AnyVal {
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
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientX: Self = this.set("clientX", js.undefined)
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientY: Self = this.set("clientY", js.undefined)
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
  }
  
}

