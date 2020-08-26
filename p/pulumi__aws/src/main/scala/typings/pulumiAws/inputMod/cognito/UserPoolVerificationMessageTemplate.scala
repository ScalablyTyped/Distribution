package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolVerificationMessageTemplate extends js.Object {
  /**
    * The default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
    */
  var defaultEmailOption: js.UndefOr[Input[String]] = js.native
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[Input[String]] = js.native
  /**
    * The email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
    */
  var emailMessageByLink: js.UndefOr[Input[String]] = js.native
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[Input[String]] = js.native
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var emailSubjectByLink: js.UndefOr[Input[String]] = js.native
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[Input[String]] = js.native
}

object UserPoolVerificationMessageTemplate {
  @scala.inline
  def apply(): UserPoolVerificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolVerificationMessageTemplate]
  }
  @scala.inline
  implicit class UserPoolVerificationMessageTemplateOps[Self <: UserPoolVerificationMessageTemplate] (val x: Self) extends AnyVal {
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
    def setDefaultEmailOption(value: Input[String]): Self = this.set("defaultEmailOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEmailOption: Self = this.set("defaultEmailOption", js.undefined)
    @scala.inline
    def setEmailMessage(value: Input[String]): Self = this.set("emailMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessage: Self = this.set("emailMessage", js.undefined)
    @scala.inline
    def setEmailMessageByLink(value: Input[String]): Self = this.set("emailMessageByLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailMessageByLink: Self = this.set("emailMessageByLink", js.undefined)
    @scala.inline
    def setEmailSubject(value: Input[String]): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    @scala.inline
    def setEmailSubjectByLink(value: Input[String]): Self = this.set("emailSubjectByLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailSubjectByLink: Self = this.set("emailSubjectByLink", js.undefined)
    @scala.inline
    def setSmsMessage(value: Input[String]): Self = this.set("smsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmsMessage: Self = this.set("smsMessage", js.undefined)
  }
  
}

