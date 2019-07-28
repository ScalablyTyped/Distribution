package typings.atPulumiAws.iamAccountPasswordPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPasswordPolicyArgs extends js.Object {
  /**
    * Whether to allow users to change their own password
    */
  val allowUsersToChangePassword: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether users are prevented from setting a new password after their password has expired
    * (i.e. require administrator reset)
    */
  val hardExpiry: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The number of days that an user password is valid.
    */
  val maxPasswordAge: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Minimum length to require for user passwords.
    */
  val minimumPasswordLength: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of previous passwords that users are prevented from reusing.
    */
  val passwordReusePrevention: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Whether to require lowercase characters for user passwords.
    */
  val requireLowercaseCharacters: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether to require numbers for user passwords.
    */
  val requireNumbers: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether to require symbols for user passwords.
    */
  val requireSymbols: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether to require uppercase characters for user passwords.
    */
  val requireUppercaseCharacters: js.UndefOr[Input[Boolean]] = js.undefined
}

object AccountPasswordPolicyArgs {
  @scala.inline
  def apply(
    allowUsersToChangePassword: Input[Boolean] = null,
    hardExpiry: Input[Boolean] = null,
    maxPasswordAge: Input[Double] = null,
    minimumPasswordLength: Input[Double] = null,
    passwordReusePrevention: Input[Double] = null,
    requireLowercaseCharacters: Input[Boolean] = null,
    requireNumbers: Input[Boolean] = null,
    requireSymbols: Input[Boolean] = null,
    requireUppercaseCharacters: Input[Boolean] = null
  ): AccountPasswordPolicyArgs = {
    val __obj = js.Dynamic.literal()
    if (allowUsersToChangePassword != null) __obj.updateDynamic("allowUsersToChangePassword")(allowUsersToChangePassword.asInstanceOf[js.Any])
    if (hardExpiry != null) __obj.updateDynamic("hardExpiry")(hardExpiry.asInstanceOf[js.Any])
    if (maxPasswordAge != null) __obj.updateDynamic("maxPasswordAge")(maxPasswordAge.asInstanceOf[js.Any])
    if (minimumPasswordLength != null) __obj.updateDynamic("minimumPasswordLength")(minimumPasswordLength.asInstanceOf[js.Any])
    if (passwordReusePrevention != null) __obj.updateDynamic("passwordReusePrevention")(passwordReusePrevention.asInstanceOf[js.Any])
    if (requireLowercaseCharacters != null) __obj.updateDynamic("requireLowercaseCharacters")(requireLowercaseCharacters.asInstanceOf[js.Any])
    if (requireNumbers != null) __obj.updateDynamic("requireNumbers")(requireNumbers.asInstanceOf[js.Any])
    if (requireSymbols != null) __obj.updateDynamic("requireSymbols")(requireSymbols.asInstanceOf[js.Any])
    if (requireUppercaseCharacters != null) __obj.updateDynamic("requireUppercaseCharacters")(requireUppercaseCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountPasswordPolicyArgs]
  }
}

