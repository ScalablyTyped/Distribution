package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolVerificationMessageTemplate extends js.Object {
  /**
    * The default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
    */
  var defaultEmailOption: js.UndefOr[String] = js.native
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: String = js.native
  /**
    * The email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
    */
  var emailMessageByLink: String = js.native
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: String = js.native
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var emailSubjectByLink: String = js.native
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: String = js.native
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
    val __obj = js.Dynamic.literal(emailMessage = emailMessage.asInstanceOf[js.Any], emailMessageByLink = emailMessageByLink.asInstanceOf[js.Any], emailSubject = emailSubject.asInstanceOf[js.Any], emailSubjectByLink = emailSubjectByLink.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
    if (defaultEmailOption != null) __obj.updateDynamic("defaultEmailOption")(defaultEmailOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolVerificationMessageTemplate]
  }
}

