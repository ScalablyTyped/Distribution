package typings.pulumiAws.userLoginProfileMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLoginProfileState extends js.Object {
  /**
    * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
    */
  val encryptedPassword: js.UndefOr[Input[String]] = js.native
  /**
    * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
    */
  val keyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordLength: js.UndefOr[Input[Double]] = js.native
  /**
    * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordResetRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val pgpKey: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM user's name.
    */
  val user: js.UndefOr[Input[String]] = js.native
}

object UserLoginProfileState {
  @scala.inline
  def apply(
    encryptedPassword: Input[String] = null,
    keyFingerprint: Input[String] = null,
    passwordLength: Input[Double] = null,
    passwordResetRequired: Input[Boolean] = null,
    pgpKey: Input[String] = null,
    user: Input[String] = null
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

