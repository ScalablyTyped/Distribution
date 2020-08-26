package typings.reactNotificationSystem.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemStyle extends js.Object {
  var DefaultStyle: js.UndefOr[CSSProperties] = js.native
  var error: js.UndefOr[CSSProperties] = js.native
  var info: js.UndefOr[CSSProperties] = js.native
  var success: js.UndefOr[CSSProperties] = js.native
  var warning: js.UndefOr[CSSProperties] = js.native
}

object ItemStyle {
  @scala.inline
  def apply(): ItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyle]
  }
  @scala.inline
  implicit class ItemStyleOps[Self <: ItemStyle] (val x: Self) extends AnyVal {
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
    def setDefaultStyle(value: CSSProperties): Self = this.set("DefaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyle: Self = this.set("DefaultStyle", js.undefined)
    @scala.inline
    def setError(value: CSSProperties): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInfo(value: CSSProperties): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setSuccess(value: CSSProperties): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWarning(value: CSSProperties): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

