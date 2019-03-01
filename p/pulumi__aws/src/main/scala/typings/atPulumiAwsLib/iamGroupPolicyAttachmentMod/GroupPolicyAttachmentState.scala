package typings
package atPulumiAwsLib.iamGroupPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyAttachmentState extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamGroupMod.Group]] = js.undefined
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
}

object GroupPolicyAttachmentState {
  @scala.inline
  def apply(
    group: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamGroupMod.Group] = null,
    policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null
  ): GroupPolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyAttachmentState]
  }
}

