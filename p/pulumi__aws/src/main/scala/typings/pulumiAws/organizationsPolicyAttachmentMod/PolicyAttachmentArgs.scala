package typings.pulumiAws.organizationsPolicyAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentArgs extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: Input[String] = js.native
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: Input[String] = js.native
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(policyId: Input[String], targetId: Input[String]): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
}

