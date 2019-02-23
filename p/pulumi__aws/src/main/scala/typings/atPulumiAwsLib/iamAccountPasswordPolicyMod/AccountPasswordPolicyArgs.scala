package typings
package atPulumiAwsLib.iamAccountPasswordPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPasswordPolicyArgs extends js.Object {
  /**
    * Whether to allow users to change their own password
    */
  val allowUsersToChangePassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether users are prevented from setting a new password after their password has expired
    * (i.e. require administrator reset)
    */
  val hardExpiry: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of days that an user password is valid.
    */
  val maxPasswordAge: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Minimum length to require for user passwords.
    */
  val minimumPasswordLength: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The number of previous passwords that users are prevented from reusing.
    */
  val passwordReusePrevention: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Whether to require lowercase characters for user passwords.
    */
  val requireLowercaseCharacters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether to require numbers for user passwords.
    */
  val requireNumbers: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether to require symbols for user passwords.
    */
  val requireSymbols: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether to require uppercase characters for user passwords.
    */
  val requireUppercaseCharacters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

