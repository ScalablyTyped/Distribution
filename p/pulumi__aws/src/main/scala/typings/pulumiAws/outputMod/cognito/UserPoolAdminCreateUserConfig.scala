package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAdminCreateUserConfig extends js.Object {
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.native
  /**
    * The invite message template structure.
    */
  var inviteMessageTemplate: js.UndefOr[UserPoolAdminCreateUserConfigInviteMessageTemplate] = js.native
  /**
    * **DEPRECATED** Use password_policy.temporary_password_validity_days instead - The user account expiration limit, in days, after which the account is no longer usable.
    */
  var unusedAccountValidityDays: Double = js.native
}

object UserPoolAdminCreateUserConfig {
  @scala.inline
  def apply(
    unusedAccountValidityDays: Double,
    allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.undefined,
    inviteMessageTemplate: UserPoolAdminCreateUserConfigInviteMessageTemplate = null
  ): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal(unusedAccountValidityDays = unusedAccountValidityDays.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAdminCreateUserOnly)) __obj.updateDynamic("allowAdminCreateUserOnly")(allowAdminCreateUserOnly.get.asInstanceOf[js.Any])
    if (inviteMessageTemplate != null) __obj.updateDynamic("inviteMessageTemplate")(inviteMessageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
}

