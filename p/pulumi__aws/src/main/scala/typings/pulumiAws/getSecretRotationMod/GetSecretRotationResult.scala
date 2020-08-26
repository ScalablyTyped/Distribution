package typings.pulumiAws.getSecretRotationMod

import typings.pulumiAws.outputMod.secretsmanager.GetSecretRotationRotationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretRotationResult extends js.Object {
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN of the secret.
    */
  val rotationEnabled: Boolean = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val rotationLambdaArn: String = js.native
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val rotationRules: js.Array[GetSecretRotationRotationRule] = js.native
  val secretId: String = js.native
}

object GetSecretRotationResult {
  @scala.inline
  def apply(
    id: String,
    rotationEnabled: Boolean,
    rotationLambdaArn: String,
    rotationRules: js.Array[GetSecretRotationRotationRule],
    secretId: String
  ): GetSecretRotationResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretRotationResult]
  }
  @scala.inline
  implicit class GetSecretRotationResultOps[Self <: GetSecretRotationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = this.set("rotationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationLambdaArn(value: String): Self = this.set("rotationLambdaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationRulesVarargs(value: GetSecretRotationRotationRule*): Self = this.set("rotationRules", js.Array(value :_*))
    @scala.inline
    def setRotationRules(value: js.Array[GetSecretRotationRotationRule]): Self = this.set("rotationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretId(value: String): Self = this.set("secretId", value.asInstanceOf[js.Any])
  }
  
}

