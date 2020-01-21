package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolVerificationMessageTemplate extends js.Object {
  /**
    * The default email option. Must be either `CONFIRM_WITH_CODE` or `CONFIRM_WITH_LINK`. Defaults to `CONFIRM_WITH_CODE`.
    */
  var defaultEmailOption: js.UndefOr[Input[String]] = js.native
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[Input[String]] = js.native
  /**
    * The email message template for sending a confirmation link to the user, it must contain the `{##Click Here##}` placeholder.
    */
  var emailMessageByLink: js.UndefOr[Input[String]] = js.native
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[Input[String]] = js.native
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var emailSubjectByLink: js.UndefOr[Input[String]] = js.native
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[Input[String]] = js.native
}

object UserPoolVerificationMessageTemplate {
  @scala.inline
  def apply(
    defaultEmailOption: Input[String] = null,
    emailMessage: Input[String] = null,
    emailMessageByLink: Input[String] = null,
    emailSubject: Input[String] = null,
    emailSubjectByLink: Input[String] = null,
    smsMessage: Input[String] = null
  ): UserPoolVerificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (defaultEmailOption != null) __obj.updateDynamic("defaultEmailOption")(defaultEmailOption.asInstanceOf[js.Any])
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (emailMessageByLink != null) __obj.updateDynamic("emailMessageByLink")(emailMessageByLink.asInstanceOf[js.Any])
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject.asInstanceOf[js.Any])
    if (emailSubjectByLink != null) __obj.updateDynamic("emailSubjectByLink")(emailSubjectByLink.asInstanceOf[js.Any])
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolVerificationMessageTemplate]
  }
}

