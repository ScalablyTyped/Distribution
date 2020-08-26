package typings.serialport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions extends js.Object {
  var brk: js.UndefOr[Boolean] = js.native
  var cts: js.UndefOr[Boolean] = js.native
  var dsr: js.UndefOr[Boolean] = js.native
  var dtr: js.UndefOr[Boolean] = js.native
  var rts: js.UndefOr[Boolean] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
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
    def setBrk(value: Boolean): Self = this.set("brk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrk: Self = this.set("brk", js.undefined)
    @scala.inline
    def setCts(value: Boolean): Self = this.set("cts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCts: Self = this.set("cts", js.undefined)
    @scala.inline
    def setDsr(value: Boolean): Self = this.set("dsr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDsr: Self = this.set("dsr", js.undefined)
    @scala.inline
    def setDtr(value: Boolean): Self = this.set("dtr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtr: Self = this.set("dtr", js.undefined)
    @scala.inline
    def setRts(value: Boolean): Self = this.set("rts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRts: Self = this.set("rts", js.undefined)
  }
  
}

