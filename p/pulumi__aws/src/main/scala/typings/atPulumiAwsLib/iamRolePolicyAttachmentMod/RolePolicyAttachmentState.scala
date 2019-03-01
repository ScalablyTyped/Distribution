package typings
package atPulumiAwsLib.iamRolePolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The role the policy should be applied to
    */
  val role: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamRoleMod.Role]] = js.undefined
}

object RolePolicyAttachmentState {
  @scala.inline
  def apply(
    policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null,
    role: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamRoleMod.Role] = null
  ): RolePolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyAttachmentState]
  }
}

