package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolEmailConfiguration extends js.Object {
  /**
    * Instruct Cognito to either use its built-in functional or Amazon SES to send out emails.
    */
  var emailSendingAccount: js.UndefOr[String] = js.undefined
  /**
    * The REPLY-TO email address.
    */
  var replyToEmailAddress: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the email source.
    */
  var sourceArn: js.UndefOr[String] = js.undefined
}

object UserPoolEmailConfiguration {
  @scala.inline
  def apply(emailSendingAccount: String = null, replyToEmailAddress: String = null, sourceArn: String = null): UserPoolEmailConfiguration = {
    val __obj = js.Dynamic.literal()
    if (emailSendingAccount != null) __obj.updateDynamic("emailSendingAccount")(emailSendingAccount)
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress)
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn)
    __obj.asInstanceOf[UserPoolEmailConfiguration]
  }
}

