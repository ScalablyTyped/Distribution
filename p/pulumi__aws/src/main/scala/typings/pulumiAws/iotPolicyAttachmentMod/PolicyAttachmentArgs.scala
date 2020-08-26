package typings.pulumiAws.iotPolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iotMod.Policy
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentArgs extends js.Object {
  /**
    * The name of the policy to attach.
    */
  val policy: Input[String | Policy] = js.native
  /**
    * The identity to which the policy is attached.
    */
  val target: Input[ARN] = js.native
}

object PolicyAttachmentArgs {
  @scala.inline
  def apply(policy: Input[String | Policy], target: Input[ARN]): PolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttachmentArgs]
  }
  @scala.inline
  implicit class PolicyAttachmentArgsOps[Self <: PolicyAttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicy(value: Input[String | Policy]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Input[ARN]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

