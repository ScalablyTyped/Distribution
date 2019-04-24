package typings
package atPulumiAwsLib.iamGetPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the policy.
    */
  val arn: java.lang.String
  /**
    * The description of the policy.
    */
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the IAM policy.
    */
  val name: java.lang.String
  /**
    * The path to the policy.
    */
  val path: java.lang.String
  /**
    * The policy document of the policy.
    */
  val policy: java.lang.String
}

object GetPolicyResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    policy: java.lang.String
  ): GetPolicyResult = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, name = name, path = path, policy = policy)
  
    __obj.asInstanceOf[GetPolicyResult]
  }
}

