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
    *
    * @deprecated Use password_policy.temporary_password_validity_days instead
    */
  var unusedAccountValidityDays: Double = js.native
}

object UserPoolAdminCreateUserConfig {
  @scala.inline
  def apply(unusedAccountValidityDays: Double): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal(unusedAccountValidityDays = unusedAccountValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigOps[Self <: UserPoolAdminCreateUserConfig] (val x: Self) extends AnyVal {
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
    def setUnusedAccountValidityDays(value: Double): Self = this.set("unusedAccountValidityDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowAdminCreateUserOnly(value: Boolean): Self = this.set("allowAdminCreateUserOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAdminCreateUserOnly: Self = this.set("allowAdminCreateUserOnly", js.undefined)
    @scala.inline
    def setInviteMessageTemplate(value: UserPoolAdminCreateUserConfigInviteMessageTemplate): Self = this.set("inviteMessageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteMessageTemplate: Self = this.set("inviteMessageTemplate", js.undefined)
  }
  
}

