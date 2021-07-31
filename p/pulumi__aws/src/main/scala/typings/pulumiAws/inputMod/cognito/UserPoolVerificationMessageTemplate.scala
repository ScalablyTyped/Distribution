package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolVerificationMessageTemplate extends StObject {
  
  /**
    * The default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
    */
  var defaultEmailOption: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
    */
  var emailMessageByLink: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var emailSubjectByLink: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[Input[String]] = js.undefined
}
object UserPoolVerificationMessageTemplate {
  
  @scala.inline
  def apply(): UserPoolVerificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolVerificationMessageTemplate]
  }
  
  @scala.inline
  implicit class UserPoolVerificationMessageTemplateMutableBuilder[Self <: UserPoolVerificationMessageTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEmailOption(value: Input[String]): Self = StObject.set(x, "defaultEmailOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEmailOptionUndefined: Self = StObject.set(x, "defaultEmailOption", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: Input[String]): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageByLink(value: Input[String]): Self = StObject.set(x, "emailMessageByLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageByLinkUndefined: Self = StObject.set(x, "emailMessageByLink", js.undefined)
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: Input[String]): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectByLink(value: Input[String]): Self = StObject.set(x, "emailSubjectByLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectByLinkUndefined: Self = StObject.set(x, "emailSubjectByLink", js.undefined)
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setSmsMessage(value: Input[String]): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMessageUndefined: Self = StObject.set(x, "smsMessage", js.undefined)
  }
}
