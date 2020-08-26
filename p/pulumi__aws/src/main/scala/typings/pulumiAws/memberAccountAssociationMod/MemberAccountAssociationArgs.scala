package typings.pulumiAws.memberAccountAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccountAssociationArgs extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: Input[String] = js.native
}

object MemberAccountAssociationArgs {
  @scala.inline
  def apply(memberAccountId: Input[String]): MemberAccountAssociationArgs = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountAssociationArgs]
  }
  @scala.inline
  implicit class MemberAccountAssociationArgsOps[Self <: MemberAccountAssociationArgs] (val x: Self) extends AnyVal {
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
    def setMemberAccountId(value: Input[String]): Self = this.set("memberAccountId", value.asInstanceOf[js.Any])
  }
  
}

