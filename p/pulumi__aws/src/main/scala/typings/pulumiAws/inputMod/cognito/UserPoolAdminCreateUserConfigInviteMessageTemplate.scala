package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends StObject {
  
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[Input[String]] = js.native
  
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[Input[String]] = js.native
  
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[Input[String]] = js.native
}
object UserPoolAdminCreateUserConfigInviteMessageTemplate {
  
  @scala.inline
  def apply(): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
  
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigInviteMessageTemplateMutableBuilder[Self <: UserPoolAdminCreateUserConfigInviteMessageTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailMessage(value: Input[String]): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: Input[String]): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setSmsMessage(value: Input[String]): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMessageUndefined: Self = StObject.set(x, "smsMessage", js.undefined)
  }
}
