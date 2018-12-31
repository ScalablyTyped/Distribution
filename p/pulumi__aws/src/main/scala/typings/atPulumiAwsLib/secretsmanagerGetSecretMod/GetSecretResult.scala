package typings
package atPulumiAwsLib.secretsmanagerGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecretResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret.
    */
  val arn: java.lang.String
  /**
    * A description of the secret.
    */
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
    */
  val kmsKeyId: java.lang.String
  val name: java.lang.String
  /**
    * The resource-based policy document that's attached to the secret.
    */
  val policy: java.lang.String
  /**
    * Whether rotation is enabled or not.
    */
  val rotationEnabled: scala.Boolean
  /**
    * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
    */
  val rotationLambdaArn: java.lang.String
  /**
    * Rotation rules if rotation is enabled.
    */
  val rotationRules: js.Array[atPulumiAwsLib.Anon_AutomaticallyAfterDays]
  /**
    * Tags of the secret.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

