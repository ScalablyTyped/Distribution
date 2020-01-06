package typings.atPulumiAws.typesOutputMod.cognito

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
    * The user account expiration limit, in days, after which the account is no longer usable.
    */
  var unusedAccountValidityDays: js.UndefOr[Double] = js.native
}

object UserPoolAdminCreateUserConfig {
  @scala.inline
  def apply(
    allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.undefined,
    inviteMessageTemplate: UserPoolAdminCreateUserConfigInviteMessageTemplate = null,
    unusedAccountValidityDays: Int | Double = null
  ): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdminCreateUserOnly)) __obj.updateDynamic("allowAdminCreateUserOnly")(allowAdminCreateUserOnly.asInstanceOf[js.Any])
    if (inviteMessageTemplate != null) __obj.updateDynamic("inviteMessageTemplate")(inviteMessageTemplate.asInstanceOf[js.Any])
    if (unusedAccountValidityDays != null) __obj.updateDynamic("unusedAccountValidityDays")(unusedAccountValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
}

