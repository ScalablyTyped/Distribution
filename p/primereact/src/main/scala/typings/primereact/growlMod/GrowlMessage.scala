package typings.primereact.growlMod

import typings.primereact.primereactStrings.error
import typings.primereact.primereactStrings.info
import typings.primereact.primereactStrings.success
import typings.primereact.primereactStrings.warn
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrowlMessage extends js.Object {
  var closable: js.UndefOr[Boolean] = js.native
  var detail: js.UndefOr[ReactNode] = js.native
  var life: js.UndefOr[Double] = js.native
  var severity: js.UndefOr[success | info | warn | error] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
  var summary: js.UndefOr[ReactNode] = js.native
}

object GrowlMessage {
  @scala.inline
  def apply(): GrowlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrowlMessage]
  }
  @scala.inline
  implicit class GrowlMessageOps[Self <: GrowlMessage] (val x: Self) extends AnyVal {
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
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setDetail(value: ReactNode): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setLife(value: Double): Self = this.set("life", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLife: Self = this.set("life", js.undefined)
    @scala.inline
    def setSeverity(value: success | info | warn | error): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    @scala.inline
    def setSummary(value: ReactNode): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

