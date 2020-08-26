package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOptions extends js.Object {
  var triggerName: js.UndefOr[String] = js.native
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
}

object ValidateOptions {
  @scala.inline
  def apply(): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions]
  }
  @scala.inline
  implicit class ValidateOptionsOps[Self <: ValidateOptions] (val x: Self) extends AnyVal {
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
    def setTriggerName(value: String): Self = this.set("triggerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerName: Self = this.set("triggerName", js.undefined)
    @scala.inline
    def setValidateMessages(value: ValidateMessages): Self = this.set("validateMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateMessages: Self = this.set("validateMessages", js.undefined)
  }
  
}

