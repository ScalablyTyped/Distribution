package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolEmailConfiguration extends StObject {
  
  /**
    * The email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
    */
  var emailSendingAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Sender’s email address or sender’s display name with their email address (e.g. `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
    */
  var fromEmailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The REPLY-TO email address.
    */
  var replyToEmailAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the SES verified email identity to to use. Required if `emailSendingAccount` is set to `DEVELOPER`.
    */
  var sourceArn: js.UndefOr[String] = js.undefined
}
object UserPoolEmailConfiguration {
  
  inline def apply(): UserPoolEmailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolEmailConfiguration]
  }
  
  extension [Self <: UserPoolEmailConfiguration](x: Self) {
    
    inline def setEmailSendingAccount(value: String): Self = StObject.set(x, "emailSendingAccount", value.asInstanceOf[js.Any])
    
    inline def setEmailSendingAccountUndefined: Self = StObject.set(x, "emailSendingAccount", js.undefined)
    
    inline def setFromEmailAddress(value: String): Self = StObject.set(x, "fromEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setFromEmailAddressUndefined: Self = StObject.set(x, "fromEmailAddress", js.undefined)
    
    inline def setReplyToEmailAddress(value: String): Self = StObject.set(x, "replyToEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setReplyToEmailAddressUndefined: Self = StObject.set(x, "replyToEmailAddress", js.undefined)
    
    inline def setSourceArn(value: String): Self = StObject.set(x, "sourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "sourceArn", js.undefined)
  }
}
