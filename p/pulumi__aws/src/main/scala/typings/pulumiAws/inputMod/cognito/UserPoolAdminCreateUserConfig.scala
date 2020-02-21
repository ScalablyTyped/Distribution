package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAdminCreateUserConfig extends js.Object {
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var allowAdminCreateUserOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The invite message template structure.
    */
  var inviteMessageTemplate: js.UndefOr[Input[UserPoolAdminCreateUserConfigInviteMessageTemplate]] = js.native
  /**
    * **DEPRECATED** Use password_policy.temporary_password_validity_days instead - The user account expiration limit, in days, after which the account is no longer usable.
    */
  var unusedAccountValidityDays: js.UndefOr[Input[Double]] = js.native
}

object UserPoolAdminCreateUserConfig {
  @scala.inline
  def apply(
    allowAdminCreateUserOnly: Input[Boolean] = null,
    inviteMessageTemplate: Input[UserPoolAdminCreateUserConfigInviteMessageTemplate] = null,
    unusedAccountValidityDays: Input[Double] = null
  ): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal()
    if (allowAdminCreateUserOnly != null) __obj.updateDynamic("allowAdminCreateUserOnly")(allowAdminCreateUserOnly.asInstanceOf[js.Any])
    if (inviteMessageTemplate != null) __obj.updateDynamic("inviteMessageTemplate")(inviteMessageTemplate.asInstanceOf[js.Any])
    if (unusedAccountValidityDays != null) __obj.updateDynamic("unusedAccountValidityDays")(unusedAccountValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
}

