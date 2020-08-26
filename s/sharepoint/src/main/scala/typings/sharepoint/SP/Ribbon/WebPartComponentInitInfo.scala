package typings.sharepoint.SP.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPartComponentInitInfo extends js.Object {
  var allowWebPartAdder: Boolean = js.native
  var editable: Boolean = js.native
  var isEditMode: Boolean = js.native
}

object WebPartComponentInitInfo {
  @scala.inline
  def apply(allowWebPartAdder: Boolean, editable: Boolean, isEditMode: Boolean): WebPartComponentInitInfo = {
    val __obj = js.Dynamic.literal(allowWebPartAdder = allowWebPartAdder.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], isEditMode = isEditMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPartComponentInitInfo]
  }
  @scala.inline
  implicit class WebPartComponentInitInfoOps[Self <: WebPartComponentInitInfo] (val x: Self) extends AnyVal {
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
    def setAllowWebPartAdder(value: Boolean): Self = this.set("allowWebPartAdder", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEditMode(value: Boolean): Self = this.set("isEditMode", value.asInstanceOf[js.Any])
  }
  
}

