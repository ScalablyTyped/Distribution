package typings.pulumiAws.userPolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.userMod.User
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN] = js.native
  /**
    * The user the policy should be applied to
    */
  val user: Input[String | User] = js.native
}

object UserPolicyAttachmentArgs {
  @scala.inline
  def apply(policyArn: Input[ARN], user: Input[String | User]): UserPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPolicyAttachmentArgs]
  }
}

