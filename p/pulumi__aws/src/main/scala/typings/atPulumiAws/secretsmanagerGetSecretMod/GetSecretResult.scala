package typings.atPulumiAws.secretsmanagerGetSecretMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.secretsmanager.GetSecretRotationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret.
    */
  val arn: String
  /**
    * A description of the secret.
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
    */
  val kmsKeyId: String
  val name: String
  /**
    * The resource-based policy document that's attached to the secret.
    */
  val policy: String
  /**
    * Whether rotation is enabled or not.
    */
  val rotationEnabled: Boolean
  /**
    * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
    */
  val rotationLambdaArn: String
  /**
    * Rotation rules if rotation is enabled.
    */
  val rotationRules: js.Array[GetSecretRotationRule]
  /**
    * Tags of the secret.
    */
  val tags: StringDictionary[js.Any]
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
    tags: StringDictionary[js.Any]
  ): GetSecretResult = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, kmsKeyId = kmsKeyId, name = name, policy = policy, rotationEnabled = rotationEnabled, rotationLambdaArn = rotationLambdaArn, rotationRules = rotationRules, tags = tags)
  
    __obj.asInstanceOf[GetSecretResult]
  }
}

