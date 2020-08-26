package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bcc extends js.Object {
  var bcc: js.Any = js.native
  var bypass_list_management: js.Any = js.native
  var footer: js.Any = js.native
  var sandbox_mode: js.Any = js.native
  var spam_check: js.Any = js.native
}

object Bcc {
  @scala.inline
  def apply(
    bcc: js.Any,
    bypass_list_management: js.Any,
    footer: js.Any,
    sandbox_mode: js.Any,
    spam_check: js.Any
  ): Bcc = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], bypass_list_management = bypass_list_management.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], sandbox_mode = sandbox_mode.asInstanceOf[js.Any], spam_check = spam_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bcc]
  }
  @scala.inline
  implicit class BccOps[Self <: Bcc] (val x: Self) extends AnyVal {
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
    def setBcc(value: js.Any): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def setBypass_list_management(value: js.Any): Self = this.set("bypass_list_management", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSandbox_mode(value: js.Any): Self = this.set("sandbox_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpam_check(value: js.Any): Self = this.set("spam_check", value.asInstanceOf[js.Any])
  }
  
}

