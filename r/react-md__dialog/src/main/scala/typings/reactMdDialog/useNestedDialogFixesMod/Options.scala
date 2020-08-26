package typings.reactMdDialog.useNestedDialogFixesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var disableEscapeClose: Boolean = js.native
  var disabled: Boolean = js.native
  var id: String = js.native
  var visible: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(disableEscapeClose: Boolean, disabled: Boolean, id: String, visible: Boolean): Options = {
    val __obj = js.Dynamic.literal(disableEscapeClose = disableEscapeClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDisableEscapeClose(value: Boolean): Self = this.set("disableEscapeClose", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

