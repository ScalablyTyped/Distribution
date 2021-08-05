package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends StObject {
  
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[String] = js.undefined
  
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[String] = js.undefined
}
object UserPoolAdminCreateUserConfigInviteMessageTemplate {
  
  inline def apply(): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
  
  extension [Self <: UserPoolAdminCreateUserConfigInviteMessageTemplate](x: Self) {
    
    inline def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    inline def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    inline def setSmsMessage(value: String): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageUndefined: Self = StObject.set(x, "smsMessage", js.undefined)
  }
}
