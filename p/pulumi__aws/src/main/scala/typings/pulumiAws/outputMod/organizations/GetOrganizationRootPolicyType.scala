package typings.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationRootPolicyType extends js.Object {
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: String = js.native
  var `type`: String = js.native
}

object GetOrganizationRootPolicyType {
  @scala.inline
  def apply(status: String, `type`: String): GetOrganizationRootPolicyType = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationRootPolicyType]
  }
}

