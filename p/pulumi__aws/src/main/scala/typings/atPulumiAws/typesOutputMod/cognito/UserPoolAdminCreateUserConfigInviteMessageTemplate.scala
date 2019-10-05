package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends js.Object {
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
  @scala.inline
  def apply(emailMessage: String = null, emailSubject: String = null, smsMessage: String = null): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage)
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject)
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage)
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
}

