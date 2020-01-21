package typings.pulumiAws.getPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the policy.
    */
  val arn: String = js.native
  /**
    * The description of the policy.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the IAM policy.
    */
  val name: String = js.native
  /**
    * The path to the policy.
    */
  val path: String = js.native
  /**
    * The policy document of the policy.
    */
  val policy: String = js.native
}

object GetPolicyResult {
  @scala.inline
  def apply(arn: String, description: String, id: String, name: String, path: String, policy: String): GetPolicyResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPolicyResult]
  }
}

