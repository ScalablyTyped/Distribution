package typings.pulumiAws.secretVersionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretVersionState extends js.Object {
  /**
    * The ARN of the secret.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
    */
  val secretBinary: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
    */
  val secretString: js.UndefOr[Input[String]] = js.native
  /**
    * The unique identifier of the version of the secret.
    */
  val versionId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
    */
  val versionStages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object SecretVersionState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    secretBinary: Input[String] = null,
    secretId: Input[String] = null,
    secretString: Input[String] = null,
    versionId: Input[String] = null,
    versionStages: Input[js.Array[Input[String]]] = null
  ): SecretVersionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (secretBinary != null) __obj.updateDynamic("secretBinary")(secretBinary.asInstanceOf[js.Any])
    if (secretId != null) __obj.updateDynamic("secretId")(secretId.asInstanceOf[js.Any])
    if (secretString != null) __obj.updateDynamic("secretString")(secretString.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    if (versionStages != null) __obj.updateDynamic("versionStages")(versionStages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVersionState]
  }
}

