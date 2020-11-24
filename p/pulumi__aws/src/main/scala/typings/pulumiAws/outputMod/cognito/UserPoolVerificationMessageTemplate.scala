package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolVerificationMessageTemplate extends js.Object {
  
  /**
    * The default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
    */
  var defaultEmailOption: js.UndefOr[String] = js.native
  
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: String = js.native
  
  /**
    * The email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
    */
  var emailMessageByLink: String = js.native
  
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: String = js.native
  
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var emailSubjectByLink: String = js.native
  
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: String = js.native
}
object UserPoolVerificationMessageTemplate {
  
  @scala.inline
  def apply(
    emailMessage: String,
    emailMessageByLink: String,
    emailSubject: String,
    emailSubjectByLink: String,
    smsMessage: String
  ): UserPoolVerificationMessageTemplate = {
    val __obj = js.Dynamic.literal(emailMessage = emailMessage.asInstanceOf[js.Any], emailMessageByLink = emailMessageByLink.asInstanceOf[js.Any], emailSubject = emailSubject.asInstanceOf[js.Any], emailSubjectByLink = emailSubjectByLink.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
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
    def setEmailMessage(value: String): Self = this.set("emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageByLink(value: String): Self = this.set("emailMessageByLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectByLink(value: String): Self = this.set("emailSubjectByLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMessage(value: String): Self = this.set("smsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEmailOption(value: String): Self = this.set("defaultEmailOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEmailOption: Self = this.set("defaultEmailOption", js.undefined)
  }
}
