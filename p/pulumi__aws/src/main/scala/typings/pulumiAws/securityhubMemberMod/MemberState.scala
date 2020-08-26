package typings.pulumiAws.securityhubMemberMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberState extends js.Object {
  /**
    * The ID of the member AWS account.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * The email of the member AWS account.
    */
  val email: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the master Security Hub AWS account.
    */
  val masterId: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the member account relationship.
    */
  val memberStatus: js.UndefOr[Input[String]] = js.native
}

object MemberState {
  @scala.inline
  def apply(): MemberState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberState]
  }
  @scala.inline
  implicit class MemberStateOps[Self <: MemberState] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInvite(value: Input[Boolean]): Self = this.set("invite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvite: Self = this.set("invite", js.undefined)
    @scala.inline
    def setMasterId(value: Input[String]): Self = this.set("masterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterId: Self = this.set("masterId", js.undefined)
    @scala.inline
    def setMemberStatus(value: Input[String]): Self = this.set("memberStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberStatus: Self = this.set("memberStatus", js.undefined)
  }
  
}

