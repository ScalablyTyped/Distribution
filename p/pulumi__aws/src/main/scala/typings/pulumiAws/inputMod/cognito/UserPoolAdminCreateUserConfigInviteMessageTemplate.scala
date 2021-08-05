package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends StObject {
  
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[Input[String]] = js.undefined
}
object UserPoolAdminCreateUserConfigInviteMessageTemplate {
  
  inline def apply(): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
  
  extension [Self <: UserPoolAdminCreateUserConfigInviteMessageTemplate](x: Self) {
    
    inline def setEmailMessage(value: Input[String]): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    inline def setEmailSubject(value: Input[String]): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    inline def setSmsMessage(value: Input[String]): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageUndefined: Self = StObject.set(x, "smsMessage", js.undefined)
  }
}
