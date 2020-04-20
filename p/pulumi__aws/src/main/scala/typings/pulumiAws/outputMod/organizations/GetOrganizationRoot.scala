package typings.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationRoot extends js.Object {
  /**
    * ARN of the root
    */
  var arn: String = js.native
  /**
    * Identifier of the root
    */
  var id: String = js.native
  /**
    * The name of the policy type
    */
  var name: String = js.native
  /**
    * List of policy types enabled for this root. All elements have these attributes:
    */
  var policyTypes: js.Array[GetOrganizationRootPolicyType] = js.native
}

object GetOrganizationRoot {
  @scala.inline
  def apply(arn: String, id: String, name: String, policyTypes: js.Array[GetOrganizationRootPolicyType]): GetOrganizationRoot = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policyTypes = policyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationRoot]
  }
}

