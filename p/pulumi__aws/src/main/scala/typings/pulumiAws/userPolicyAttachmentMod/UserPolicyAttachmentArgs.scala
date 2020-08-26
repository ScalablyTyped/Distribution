package typings.pulumiAws.userPolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.User
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
  @scala.inline
  implicit class UserPolicyAttachmentArgsOps[Self <: UserPolicyAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setPolicyArn(value: Input[ARN]): Self = this.set("policyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Input[String | User]): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

