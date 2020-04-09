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
  def apply(accountId: Input[String], email: Input[String], invite: Input[Boolean] = null): MemberArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (invite != null) __obj.updateDynamic("invite")(invite.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberArgs]
  }
}

