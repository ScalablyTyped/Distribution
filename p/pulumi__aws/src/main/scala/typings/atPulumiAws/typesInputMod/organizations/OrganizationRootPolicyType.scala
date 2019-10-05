package typings.atPulumiAws.typesInputMod.organizations

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationRootPolicyType extends js.Object {
  /**
    * The status of the policy type as it relates to the associated root
    */
  var status: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object OrganizationRootPolicyType {
  @scala.inline
  def apply(status: Input[String] = null, `type`: Input[String] = null): OrganizationRootPolicyType = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationRootPolicyType]
  }
}

