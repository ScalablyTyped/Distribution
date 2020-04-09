package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolEmailConfiguration extends js.Object {
  /**
    * Instruct Cognito to either use its built-in functional or Amazon SES to send out emails.
    */
  var emailSendingAccount: js.UndefOr[Input[String]] = js.native
  /**
    * Sender’s email address or sender’s name with their email address (e.g. "john@smith.com" or "John Smith <john@smith.com>")
    */
  var fromEmailAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The REPLY-TO email address.
    */
  var replyToEmailAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the email source.
    */
  var sourceArn: js.UndefOr[Input[String]] = js.native
}

object UserPoolEmailConfiguration {
  @scala.inline
  def apply(
    emailSendingAccount: Input[String] = null,
    fromEmailAddress: Input[String] = null,
    replyToEmailAddress: Input[String] = null,
    sourceArn: Input[String] = null
  ): UserPoolEmailConfiguration = {
    val __obj = js.Dynamic.literal()
    if (emailSendingAccount != null) __obj.updateDynamic("emailSendingAccount")(emailSendingAccount.asInstanceOf[js.Any])
    if (fromEmailAddress != null) __obj.updateDynamic("fromEmailAddress")(fromEmailAddress.asInstanceOf[js.Any])
    if (replyToEmailAddress != null) __obj.updateDynamic("replyToEmailAddress")(replyToEmailAddress.asInstanceOf[js.Any])
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolEmailConfiguration]
  }
}

