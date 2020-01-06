package typings.atPulumiAws.secretsmanagerGetSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretVersionResult extends js.Object {
  /**
    * The ARN of the secret.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val secretBinary: String = js.native
  val secretId: String = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val secretString: String = js.native
  /**
    * The unique identifier of this version of the secret.
    */
  val versionId: String = js.native
  val versionStage: js.UndefOr[String] = js.native
  val versionStages: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], secretBinary = secretBinary.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any], secretString = secretString.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any], versionStages = versionStages.asInstanceOf[js.Any])
    if (versionStage != null) __obj.updateDynamic("versionStage")(versionStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretVersionResult]
  }
}

