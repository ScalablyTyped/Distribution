package typings.atPulumiAws.iotPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iotMod.Policy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentState extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: js.UndefOr[Input[String | Policy]] = js.native
  /**
    * The identity to which the policy is attached.
    */
  val target: js.UndefOr[Input[ARN]] = js.native
}

object PolicyAttachmentState {
  @scala.inline
  def apply(policy: Input[String | Policy] = null, target: Input[ARN] = null): PolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentState]
  }
}

