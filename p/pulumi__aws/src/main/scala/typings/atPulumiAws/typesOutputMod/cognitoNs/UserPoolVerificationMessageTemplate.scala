package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolVerificationMessageTemplate extends js.Object {
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
  @scala.inline
  def apply(
    emailMessage: String,
    emailMessageByLink: String,
    emailSubject: String,
    emailSubjectByLink: String,
    smsMessage: String,
    defaultEmailOption: String = null
  ): UserPoolVerificationMessageTemplate = {
    val __obj = js.Dynamic.literal(emailMessage = emailMessage, emailMessageByLink = emailMessageByLink, emailSubject = emailSubject, emailSubjectByLink = emailSubjectByLink, smsMessage = smsMessage)
    if (defaultEmailOption != null) __obj.updateDynamic("defaultEmailOption")(defaultEmailOption)
    __obj.asInstanceOf[UserPoolVerificationMessageTemplate]
  }
}

