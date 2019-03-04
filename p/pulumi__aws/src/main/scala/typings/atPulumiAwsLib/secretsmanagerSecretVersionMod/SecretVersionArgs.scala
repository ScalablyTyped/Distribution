package typings
package atPulumiAwsLib.secretsmanagerSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretVersionArgs extends js.Object {
  /**
    * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
    */
  val secretBinary: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
    */
  val secretString: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
    */
  val versionStages: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object SecretVersionArgs {
  @scala.inline
  def apply(
    secretId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    secretBinary: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    secretString: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    versionStages: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): SecretVersionArgs = {
    val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
    if (secretBinary != null) __obj.updateDynamic("secretBinary")(secretBinary.asInstanceOf[js.Any])
    if (secretString != null) __obj.updateDynamic("secretString")(secretString.asInstanceOf[js.Any])
    if (versionStages != null) __obj.updateDynamic("versionStages")(versionStages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVersionArgs]
  }
}

