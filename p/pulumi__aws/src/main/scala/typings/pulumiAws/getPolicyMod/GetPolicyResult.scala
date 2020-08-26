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
    * The provider-assigned unique ID for this managed resource.
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
  @scala.inline
  implicit class GetPolicyResultOps[Self <: GetPolicyResult] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
  
}

