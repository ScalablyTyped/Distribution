package typings.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions extends js.Object {
  var emails: js.Array[String] = js.native
  var emailsCryptType: EmailCryptType = js.native
}

object EmailOptions {
  @scala.inline
  def apply(emails: js.Array[String], emailsCryptType: EmailCryptType): EmailOptions = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], emailsCryptType = emailsCryptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
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
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailsCryptType(value: EmailCryptType): Self = this.set("emailsCryptType", value.asInstanceOf[js.Any])
  }
  
}

