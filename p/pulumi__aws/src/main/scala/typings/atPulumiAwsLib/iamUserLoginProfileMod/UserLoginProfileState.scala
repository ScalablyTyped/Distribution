package typings
package atPulumiAwsLib.iamUserLoginProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLoginProfileState extends js.Object {
  /**
    * The encrypted password, base64 encoded. Only available if password was handled on Terraform resource creation, not import.
    */
  val encryptedPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on Terraform resource creation, not import.
    */
  val keyFingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordLength: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordResetRequired: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val pgpKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM user's name.
    */
  val user: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object UserLoginProfileState {
  @scala.inline
  def apply(
    encryptedPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyFingerprint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    passwordLength: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    passwordResetRequired: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    pgpKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    user: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): UserLoginProfileState = {
    val __obj = js.Dynamic.literal()
    if (encryptedPassword != null) __obj.updateDynamic("encryptedPassword")(encryptedPassword.asInstanceOf[js.Any])
    if (keyFingerprint != null) __obj.updateDynamic("keyFingerprint")(keyFingerprint.asInstanceOf[js.Any])
    if (passwordLength != null) __obj.updateDynamic("passwordLength")(passwordLength.asInstanceOf[js.Any])
    if (passwordResetRequired != null) __obj.updateDynamic("passwordResetRequired")(passwordResetRequired.asInstanceOf[js.Any])
    if (pgpKey != null) __obj.updateDynamic("pgpKey")(pgpKey.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLoginProfileState]
  }
}

