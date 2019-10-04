package typings.atPulumiAws.typesOutputMod.organizationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationRoot extends js.Object {
  /**
    * ARN of the root
    */
  var arn: String
  /**
    * Identifier of the root
    */
  var id: String
  /**
    * The name of the policy type
    */
  var name: String
  /**
    * List of policy types enabled for this root. All elements have these attributes:
    */
  var policyTypes: js.Array[OrganizationRootPolicyType]
}

object OrganizationRoot {
  @scala.inline
  def apply(arn: String, id: String, name: String, policyTypes: js.Array[OrganizationRootPolicyType]): OrganizationRoot = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, policyTypes = policyTypes)
  
    __obj.asInstanceOf[OrganizationRoot]
  }
}

