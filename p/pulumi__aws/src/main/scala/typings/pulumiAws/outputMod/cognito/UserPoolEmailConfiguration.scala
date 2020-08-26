package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolEmailConfiguration extends js.Object {
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
  implicit class UserPoolEmailConfigurationOps[Self <: UserPoolEmailConfiguration] (val x: Self) extends AnyVal {
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
    def setEmailSendingAccount(value: String): Self = this.set("emailSendingAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailSendingAccount: Self = this.set("emailSendingAccount", js.undefined)
    @scala.inline
    def setFromEmailAddress(value: String): Self = this.set("fromEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromEmailAddress: Self = this.set("fromEmailAddress", js.undefined)
    @scala.inline
    def setReplyToEmailAddress(value: String): Self = this.set("replyToEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToEmailAddress: Self = this.set("replyToEmailAddress", js.undefined)
    @scala.inline
    def setSourceArn(value: String): Self = this.set("sourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("sourceArn", js.undefined)
  }
  
}

