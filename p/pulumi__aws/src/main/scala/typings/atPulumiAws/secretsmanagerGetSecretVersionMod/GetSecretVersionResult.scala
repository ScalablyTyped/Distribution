package typings.atPulumiAws.secretsmanagerGetSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretVersionResult extends js.Object {
  /**
    * The ARN of the secret.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val secretBinary: String
  val secretId: String
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val secretString: String
  /**
    * The unique identifier of this version of the secret.
    */
  val versionId: String
  val versionStage: js.UndefOr[String] = js.undefined
  val versionStages: js.Array[String]
}

object GetSecretVersionResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    secretBinary: String,
    secretId: String,
    secretString: String,
    versionId: String,
    versionStages: js.Array[String],
    versionStage: String = null
  ): GetSecretVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, secretBinary = secretBinary, secretId = secretId, secretString = secretString, versionId = versionId, versionStages = versionStages)
    if (versionStage != null) __obj.updateDynamic("versionStage")(versionStage)
    __obj.asInstanceOf[GetSecretVersionResult]
  }
}

