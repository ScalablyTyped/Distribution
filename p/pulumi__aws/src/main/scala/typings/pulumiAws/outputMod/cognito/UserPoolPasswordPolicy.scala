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
  def apply(
    minimumLength: Int | Double = null,
    requireLowercase: js.UndefOr[Boolean] = js.undefined,
    requireNumbers: js.UndefOr[Boolean] = js.undefined,
    requireSymbols: js.UndefOr[Boolean] = js.undefined,
    requireUppercase: js.UndefOr[Boolean] = js.undefined,
    temporaryPasswordValidityDays: Int | Double = null
  ): UserPoolPasswordPolicy = {
    val __obj = js.Dynamic.literal()
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (!js.isUndefined(requireLowercase)) __obj.updateDynamic("requireLowercase")(requireLowercase.asInstanceOf[js.Any])
    if (!js.isUndefined(requireNumbers)) __obj.updateDynamic("requireNumbers")(requireNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSymbols)) __obj.updateDynamic("requireSymbols")(requireSymbols.asInstanceOf[js.Any])
    if (!js.isUndefined(requireUppercase)) __obj.updateDynamic("requireUppercase")(requireUppercase.asInstanceOf[js.Any])
    if (temporaryPasswordValidityDays != null) __obj.updateDynamic("temporaryPasswordValidityDays")(temporaryPasswordValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolPasswordPolicy]
  }
}

