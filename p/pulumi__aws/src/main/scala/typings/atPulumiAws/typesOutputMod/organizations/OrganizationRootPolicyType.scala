package typings.atPulumiAws.typesOutputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationRootPolicyType extends js.Object {
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: String
  var `type`: String
}

object OrganizationRootPolicyType {
  @scala.inline
  def apply(status: String, `type`: String): OrganizationRootPolicyType = {
    val __obj = js.Dynamic.literal(status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrganizationRootPolicyType]
  }
}

