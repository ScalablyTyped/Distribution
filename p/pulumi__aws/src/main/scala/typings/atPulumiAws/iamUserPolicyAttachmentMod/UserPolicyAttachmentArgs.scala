package typings.atPulumiAws.iamUserPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamUserMod.User
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN]
  /**
    * The user the policy should be applied to
    */
  val user: Input[User]
}

object UserPolicyAttachmentArgs {
  @scala.inline
  def apply(policyArn: Input[ARN], user: Input[User]): UserPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPolicyAttachmentArgs]
  }
}

