package typings.atPulumiAws.typesInputMod.organizations

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationRoot extends js.Object {
  /**
    * ARN of the root
    */
  var arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of the root
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the policy type
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of policy types enabled for this root. All elements have these attributes:
    */
  var policyTypes: js.UndefOr[Input[js.Array[Input[OrganizationRootPolicyType]]]] = js.undefined
}

object OrganizationRoot {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    id: Input[String] = null,
    name: Input[String] = null,
    policyTypes: Input[js.Array[Input[OrganizationRootPolicyType]]] = null
  ): OrganizationRoot = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyTypes != null) __obj.updateDynamic("policyTypes")(policyTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationRoot]
  }
}

