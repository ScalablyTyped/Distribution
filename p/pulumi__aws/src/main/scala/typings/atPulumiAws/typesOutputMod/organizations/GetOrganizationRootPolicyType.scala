package typings.atPulumiAws.typesOutputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrganizationRootPolicyType extends js.Object {
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: String
  var `type`: String
}

object GetOrganizationRootPolicyType {
  @scala.inline
  def apply(status: String, `type`: String): GetOrganizationRootPolicyType = {
    val __obj = js.Dynamic.literal(status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetOrganizationRootPolicyType]
  }
}

