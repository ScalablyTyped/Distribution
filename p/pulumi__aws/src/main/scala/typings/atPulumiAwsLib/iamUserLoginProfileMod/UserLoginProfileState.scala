package typings
package atPulumiAwsLib.iamUserLoginProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLoginProfileState extends js.Object {
  /**
    * The encrypted password, base64 encoded.
    */
  val encryptedPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The fingerprint of the PGP key used to encrypt
    * the password
    */
  val keyFingerprint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The length of the generated
    * password.
    */
  val passwordLength: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Whether the
    * user should be forced to reset the generated password on first login.
    */
  val passwordResetRequired: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Either a base-64 encoded PGP public key, or a
    * keybase username in the form `keybase:username`.
    */
  val pgpKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM user's name.
    */
  val user: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

