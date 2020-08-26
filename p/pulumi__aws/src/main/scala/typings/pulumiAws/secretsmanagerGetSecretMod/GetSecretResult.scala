package typings.pulumiAws.secretsmanagerGetSecretMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.GetSecretRotationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret.
    */
  val arn: String = js.native
  /**
    * A description of the secret.
    */
  val description: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
    */
  val kmsKeyId: String = js.native
  val name: String = js.native
  /**
    * The resource-based policy document that's attached to the secret.
    */
  val policy: String = js.native
  /**
    * Whether rotation is enabled or not.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
    */
  val rotationEnabled: Boolean = js.native
  /**
    * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
    */
  val rotationLambdaArn: String = js.native
  /**
    * Rotation rules if rotation is enabled.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation data source instead
    */
  val rotationRules: js.Array[GetSecretRotationRule] = js.native
  /**
    * Tags of the secret.
    */
  val tags: StringDictionary[String] = js.native
}

object GetSecretResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    id: String,
    kmsKeyId: String,
    name: String,
    policy: String,
    rotationEnabled: Boolean,
    rotationLambdaArn: String,
    rotationRules: js.Array[GetSecretRotationRule],
    tags: StringDictionary[String]
  ): GetSecretResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretResult]
  }
  @scala.inline
  implicit class GetSecretResultOps[Self <: GetSecretResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = this.set("rotationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationLambdaArn(value: String): Self = this.set("rotationLambdaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationRulesVarargs(value: GetSecretRotationRule*): Self = this.set("rotationRules", js.Array(value :_*))
    @scala.inline
    def setRotationRules(value: js.Array[GetSecretRotationRule]): Self = this.set("rotationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

