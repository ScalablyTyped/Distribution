package typings.atPulumiAws.iamGroupPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamGroupMod.Group
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyAttachmentArgs extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: Input[Group]
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN]
}

object GroupPolicyAttachmentArgs {
  @scala.inline
  def apply(group: Input[Group], policyArn: Input[ARN]): GroupPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], policyArn = policyArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupPolicyAttachmentArgs]
  }
}

