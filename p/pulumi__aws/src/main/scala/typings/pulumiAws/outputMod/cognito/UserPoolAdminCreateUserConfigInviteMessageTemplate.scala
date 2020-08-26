package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends js.Object {
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[String] = js.native
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[String] = js.native
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[String] = js.native
}

object UserPoolAdminCreateUserConfigInviteMessageTemplate {
  @scala.inline
  def apply(): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigInviteMessageTemplateOps[Self <: UserPoolAdminCreateUserConfigInviteMessageTemplate] (val x: Self) extends AnyVal {
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
    def setEmailMessage(value: String): Self = this.set("emailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("emailMessage", js.undefined)
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    @scala.inline
    def setSmsMessage(value: String): Self = this.set("smsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsMessage: Self = this.set("smsMessage", js.undefined)
  }
  
}

