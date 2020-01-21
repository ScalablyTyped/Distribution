package typings.pulumiAws.groupPolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamGroupMod.Group
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
}

