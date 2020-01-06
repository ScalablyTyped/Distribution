package typings.atPulumiAws.typesInputMod.cognito

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolPasswordPolicy extends js.Object {
  /**
    * The minimum length of the password policy that you have set.
    */
  var minimumLength: js.UndefOr[Input[Double]] = js.native
  /**
    * Whether you have required users to use at least one lowercase letter in their password.
    */
  var requireLowercase: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether you have required users to use at least one number in their password.
    */
  var requireNumbers: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether you have required users to use at least one symbol in their password.
    */
  var requireSymbols: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether you have required users to use at least one uppercase letter in their password.
    */
  var requireUppercase: js.UndefOr[Input[Boolean]] = js.native
}

object UserPoolPasswordPolicy {
  @scala.inline
  def apply(
    minimumLength: Input[Double] = null,
    requireLowercase: Input[Boolean] = null,
    requireNumbers: Input[Boolean] = null,
    requireSymbols: Input[Boolean] = null,
    requireUppercase: Input[Boolean] = null
  ): UserPoolPasswordPolicy = {
    val __obj = js.Dynamic.literal()
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (requireLowercase != null) __obj.updateDynamic("requireLowercase")(requireLowercase.asInstanceOf[js.Any])
    if (requireNumbers != null) __obj.updateDynamic("requireNumbers")(requireNumbers.asInstanceOf[js.Any])
    if (requireSymbols != null) __obj.updateDynamic("requireSymbols")(requireSymbols.asInstanceOf[js.Any])
    if (requireUppercase != null) __obj.updateDynamic("requireUppercase")(requireUppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolPasswordPolicy]
  }
}

