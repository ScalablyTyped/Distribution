package typings
package atPulumiAwsLib.iamGroupPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyAttachmentArgs extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamGroupMod.Group]
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
}

object GroupPolicyAttachmentArgs {
  @scala.inline
  def apply(
    group: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamGroupMod.Group],
    policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  ): GroupPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyAttachmentArgs]
  }
}

