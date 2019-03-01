package typings
package atPulumiAwsLib.organizationsPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachmentState extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object PolicyAttachmentState {
  @scala.inline
  def apply(
    policyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    targetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policyId != null) __obj.updateDynamic("policyId")(policyId.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentState]
  }
}

