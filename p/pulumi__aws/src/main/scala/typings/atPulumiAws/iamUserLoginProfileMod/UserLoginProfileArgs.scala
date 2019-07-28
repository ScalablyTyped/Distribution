package typings.atPulumiAws.iamUserLoginProfileMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLoginProfileArgs extends js.Object {
  /**
    * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordLength: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val passwordResetRequired: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
    */
  val pgpKey: Input[String]
  /**
    * The IAM user's name.
    */
  val user: Input[String]
}

object UserLoginProfileArgs {
  @scala.inline
  def apply(
    pgpKey: Input[String],
    user: Input[String],
    passwordLength: Input[Double] = null,
    passwordResetRequired: Input[Boolean] = null
  ): UserLoginProfileArgs = {
    val __obj = js.Dynamic.literal(pgpKey = pgpKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (passwordLength != null) __obj.updateDynamic("passwordLength")(passwordLength.asInstanceOf[js.Any])
    if (passwordResetRequired != null) __obj.updateDynamic("passwordResetRequired")(passwordResetRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLoginProfileArgs]
  }
}

