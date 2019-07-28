package typings.atPulumiAws.iamGetPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the policy.
    */
  val arn: String
  /**
    * The description of the policy.
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The name of the IAM policy.
    */
  val name: String
  /**
    * The path to the policy.
    */
  val path: String
  /**
    * The policy document of the policy.
    */
  val policy: String
}

object GetPolicyResult {
  @scala.inline
  def apply(arn: String, description: String, id: String, name: String, path: String, policy: String): GetPolicyResult = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, name = name, path = path, policy = policy)
  
    __obj.asInstanceOf[GetPolicyResult]
  }
}

