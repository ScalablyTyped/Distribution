package typings.pulumiAws.securityhubMemberMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberArgs extends js.Object {
  /**
    * The ID of the member AWS account.
    */
  val accountId: Input[String] = js.native
  /**
    * The email of the member AWS account.
    */
  val email: Input[String] = js.native
  /**
    * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.native
}

object MemberArgs {
  @scala.inline
  def apply(accountId: Input[String], email: Input[String]): MemberArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberArgs]
  }
  @scala.inline
  implicit class MemberArgsOps[Self <: MemberArgs] (val x: Self) extends AnyVal {
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
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvite(value: Input[Boolean]): Self = this.set("invite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvite: Self = this.set("invite", js.undefined)
  }
  
}

