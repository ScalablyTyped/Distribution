package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolEmailConfiguration extends StObject {
  
  /**
    * The email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
    */
  var emailSendingAccount: js.UndefOr[String] = js.native
  
  /**
    * Sender’s email address or sender’s display name with their email address (e.g. `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
    */
  var fromEmailAddress: js.UndefOr[String] = js.native
  
  /**
    * The REPLY-TO email address.
    */
  var replyToEmailAddress: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the SES verified email identity to to use. Required if `emailSendingAccount` is set to `DEVELOPER`.
    */
  var sourceArn: js.UndefOr[String] = js.native
}
object UserPoolEmailConfiguration {
  
  @scala.inline
  def apply(): UserPoolEmailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolEmailConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolEmailConfigurationMutableBuilder[Self <: UserPoolEmailConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailSendingAccount(value: String): Self = StObject.set(x, "emailSendingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSendingAccountUndefined: Self = StObject.set(x, "emailSendingAccount", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: String): Self = StObject.set(x, "fromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressUndefined: Self = StObject.set(x, "fromEmailAddress", js.undefined)
    
    @scala.inline
    def setReplyToEmailAddress(value: String): Self = StObject.set(x, "replyToEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToEmailAddressUndefined: Self = StObject.set(x, "replyToEmailAddress", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String): Self = StObject.set(x, "sourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "sourceArn", js.undefined)
  }
}
