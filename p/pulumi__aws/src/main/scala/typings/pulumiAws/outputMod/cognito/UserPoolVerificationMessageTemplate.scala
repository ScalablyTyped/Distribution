package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolVerificationMessageTemplate extends StObject {
  
  /**
    * The default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
    */
  var defaultEmailOption: js.UndefOr[String] = js.undefined
  
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: String
  
  /**
    * The email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
    */
  var emailMessageByLink: String
  
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: String
  
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var emailSubjectByLink: String
  
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: String
}
object UserPoolVerificationMessageTemplate {
  
  inline def apply(
    emailMessage: String,
    emailMessageByLink: String,
    emailSubject: String,
    emailSubjectByLink: String,
    smsMessage: String
  ): UserPoolVerificationMessageTemplate = {
    val __obj = js.Dynamic.literal(emailMessage = emailMessage.asInstanceOf[js.Any], emailMessageByLink = emailMessageByLink.asInstanceOf[js.Any], emailSubject = emailSubject.asInstanceOf[js.Any], emailSubjectByLink = emailSubjectByLink.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolVerificationMessageTemplate]
  }
  
  extension [Self <: UserPoolVerificationMessageTemplate](x: Self) {
    
    inline def setDefaultEmailOption(value: String): Self = StObject.set(x, "defaultEmailOption", value.asInstanceOf[js.Any])
    
    inline def setDefaultEmailOptionUndefined: Self = StObject.set(x, "defaultEmailOption", js.undefined)
    
    inline def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageByLink(value: String): Self = StObject.set(x, "emailMessageByLink", value.asInstanceOf[js.Any])
    
    inline def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectByLink(value: String): Self = StObject.set(x, "emailSubjectByLink", value.asInstanceOf[js.Any])
    
    inline def setSmsMessage(value: String): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
  }
}
