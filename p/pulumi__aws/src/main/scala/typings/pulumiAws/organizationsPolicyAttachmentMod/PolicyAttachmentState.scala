package typings.pulumiAws.organizationsPolicyAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachmentState extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want to attach to the target.
    */
  val policyId: js.UndefOr[Input[String]] = js.native
  /**
    * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
    */
  val targetId: js.UndefOr[Input[String]] = js.native
}

object PolicyAttachmentState {
  @scala.inline
  def apply(): PolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttachmentState]
  }
  @scala.inline
  implicit class PolicyAttachmentStateOps[Self <: PolicyAttachmentState] (val x: Self) extends AnyVal {
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
    def setPolicyId(value: Input[String]): Self = this.set("policyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyId: Self = this.set("policyId", js.undefined)
    @scala.inline
    def setTargetId(value: Input[String]): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

