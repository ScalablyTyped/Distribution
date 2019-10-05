package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolPasswordPolicy extends js.Object {
  /**
    * The minimum length of the password policy that you have set.
    */
  var minimumLength: js.UndefOr[Double] = js.undefined
  /**
    * Whether you have required users to use at least one lowercase letter in their password.
    */
  var requireLowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether you have required users to use at least one number in their password.
    */
  var requireNumbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether you have required users to use at least one symbol in their password.
    */
  var requireSymbols: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether you have required users to use at least one uppercase letter in their password.
    */
  var requireUppercase: js.UndefOr[Boolean] = js.undefined
}

object UserPoolPasswordPolicy {
  @scala.inline
  def apply(
    minimumLength: Int | Double = null,
    requireLowercase: js.UndefOr[Boolean] = js.undefined,
    requireNumbers: js.UndefOr[Boolean] = js.undefined,
    requireSymbols: js.UndefOr[Boolean] = js.undefined,
    requireUppercase: js.UndefOr[Boolean] = js.undefined
  ): UserPoolPasswordPolicy = {
    val __obj = js.Dynamic.literal()
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (!js.isUndefined(requireLowercase)) __obj.updateDynamic("requireLowercase")(requireLowercase)
    if (!js.isUndefined(requireNumbers)) __obj.updateDynamic("requireNumbers")(requireNumbers)
    if (!js.isUndefined(requireSymbols)) __obj.updateDynamic("requireSymbols")(requireSymbols)
    if (!js.isUndefined(requireUppercase)) __obj.updateDynamic("requireUppercase")(requireUppercase)
    __obj.asInstanceOf[UserPoolPasswordPolicy]
  }
}

