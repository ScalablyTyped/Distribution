package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolPasswordPolicy extends js.Object {
  /**
    * The minimum length of the password policy that you have set.
    */
  var minimumLength: js.UndefOr[Double] = js.native
  /**
    * Whether you have required users to use at least one lowercase letter in their password.
    */
  var requireLowercase: js.UndefOr[Boolean] = js.native
  /**
    * Whether you have required users to use at least one number in their password.
    */
  var requireNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Whether you have required users to use at least one symbol in their password.
    */
  var requireSymbols: js.UndefOr[Boolean] = js.native
  /**
    * Whether you have required users to use at least one uppercase letter in their password.
    */
  var requireUppercase: js.UndefOr[Boolean] = js.native
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.
    */
  var temporaryPasswordValidityDays: js.UndefOr[Double] = js.native
}

object UserPoolPasswordPolicy {
  @scala.inline
  def apply(): UserPoolPasswordPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolPasswordPolicy]
  }
  @scala.inline
  implicit class UserPoolPasswordPolicyOps[Self <: UserPoolPasswordPolicy] (val x: Self) extends AnyVal {
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
    def setMinimumLength(value: Double): Self = this.set("minimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumLength: Self = this.set("minimumLength", js.undefined)
    @scala.inline
    def setRequireLowercase(value: Boolean): Self = this.set("requireLowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireLowercase: Self = this.set("requireLowercase", js.undefined)
    @scala.inline
    def setRequireNumbers(value: Boolean): Self = this.set("requireNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireNumbers: Self = this.set("requireNumbers", js.undefined)
    @scala.inline
    def setRequireSymbols(value: Boolean): Self = this.set("requireSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireSymbols: Self = this.set("requireSymbols", js.undefined)
    @scala.inline
    def setRequireUppercase(value: Boolean): Self = this.set("requireUppercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireUppercase: Self = this.set("requireUppercase", js.undefined)
    @scala.inline
    def setTemporaryPasswordValidityDays(value: Double): Self = this.set("temporaryPasswordValidityDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporaryPasswordValidityDays: Self = this.set("temporaryPasswordValidityDays", js.undefined)
  }
  
}

