package typings.atPulumiAws.organizationsPolicyAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentState extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: js.UndefOr[Input[String]] = js.native
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: js.UndefOr[Input[String]] = js.native
}

object PolicyAttachmentState {
  @scala.inline
  def apply(policyId: Input[String] = null, targetId: Input[String] = null): PolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policyId != null) __obj.updateDynamic("policyId")(policyId.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentState]
  }
}

