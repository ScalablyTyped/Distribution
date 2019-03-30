package typings
package atPulumiAwsLib.iamUserLoginProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLoginProfileArgs extends js.Object {
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
  val pgpKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The IAM user's name.
    */
  val user: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object UserLoginProfileArgs {
  @scala.inline
  def apply(
    pgpKey: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    user: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    passwordLength: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    passwordResetRequired: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): UserLoginProfileArgs = {
    val __obj = js.Dynamic.literal(pgpKey = pgpKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (passwordLength != null) __obj.updateDynamic("passwordLength")(passwordLength.asInstanceOf[js.Any])
    if (passwordResetRequired != null) __obj.updateDynamic("passwordResetRequired")(passwordResetRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLoginProfileArgs]
  }
}

