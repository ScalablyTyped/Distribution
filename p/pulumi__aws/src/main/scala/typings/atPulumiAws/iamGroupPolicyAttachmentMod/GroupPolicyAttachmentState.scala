package typings.atPulumiAws.iamGroupPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamGroupMod.Group
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPolicyAttachmentState extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: js.UndefOr[Input[String | Group]] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[Input[ARN]] = js.native
}

object GroupPolicyAttachmentState {
  @scala.inline
  def apply(group: Input[String | Group] = null, policyArn: Input[ARN] = null): GroupPolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyAttachmentState]
  }
}

