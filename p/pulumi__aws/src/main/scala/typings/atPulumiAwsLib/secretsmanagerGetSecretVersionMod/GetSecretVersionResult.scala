package typings
package atPulumiAwsLib.secretsmanagerGetSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretVersionResult extends js.Object {
  /**
    * The ARN of the secret.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val secretBinary: java.lang.String
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val secretString: java.lang.String
  /**
    * The unique identifier of this version of the secret.
    */
  val versionId: java.lang.String
  val versionStages: js.Array[java.lang.String]
}

object GetSecretVersionResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    secretBinary: java.lang.String,
    secretString: java.lang.String,
    versionId: java.lang.String,
    versionStages: js.Array[java.lang.String]
  ): GetSecretVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("secretBinary")(secretBinary)
    __obj.updateDynamic("secretString")(secretString)
    __obj.updateDynamic("versionId")(versionId)
    __obj.updateDynamic("versionStages")(versionStages)
    __obj.asInstanceOf[GetSecretVersionResult]
  }
}

