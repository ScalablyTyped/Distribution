package typings.atPulumiAws.iamRolePolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamRoleMod.Role
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN]
  /**
    * The role the policy should be applied to
    */
  val role: Input[String | Role]
}

object RolePolicyAttachmentArgs {
  @scala.inline
  def apply(policyArn: Input[ARN], role: Input[String | Role]): RolePolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RolePolicyAttachmentArgs]
  }
}

