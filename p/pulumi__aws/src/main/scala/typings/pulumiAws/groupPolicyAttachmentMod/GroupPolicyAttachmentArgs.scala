package typings.pulumiAws.groupPolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Group
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPolicyAttachmentArgs extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: Input[String | Group] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN] = js.native
}

object GroupPolicyAttachmentArgs {
  @scala.inline
  def apply(group: Input[String | Group], policyArn: Input[ARN]): GroupPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], policyArn = policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyAttachmentArgs]
  }
  @scala.inline
  implicit class GroupPolicyAttachmentArgsOps[Self <: GroupPolicyAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setGroup(value: Input[String | Group]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyArn(value: Input[ARN]): Self = this.set("policyArn", value.asInstanceOf[js.Any])
  }
  
}

