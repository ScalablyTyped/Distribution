package typings.atPulumiAws.iamUserPolicyAttachmentMod

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamUserMod.User
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * The user the policy should be applied to
    */
  val user: js.UndefOr[Input[String | User]] = js.native
}

object UserPolicyAttachmentState {
  @scala.inline
  def apply(policyArn: Input[ARN] = null, user: Input[String | User] = null): UserPolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPolicyAttachmentState]
  }
}

