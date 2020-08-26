package typings.pulumiAws.rolePolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * The role the policy should be applied to
    */
  val role: js.UndefOr[Input[String | Role]] = js.native
}

object RolePolicyAttachmentState {
  @scala.inline
  def apply(): RolePolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RolePolicyAttachmentState]
  }
  @scala.inline
  implicit class RolePolicyAttachmentStateOps[Self <: RolePolicyAttachmentState] (val x: Self) extends AnyVal {
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
    def deletePolicyArn: Self = this.set("policyArn", js.undefined)
    @scala.inline
    def setRole(value: Input[String | Role]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

