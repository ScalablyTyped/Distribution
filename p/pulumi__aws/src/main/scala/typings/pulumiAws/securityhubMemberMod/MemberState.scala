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
    * The status of the relationship between the member account and its master account.
    */
  val memberStatus: js.UndefOr[Input[String]] = js.native
}

object MemberState {
  @scala.inline
  def apply(
    accountId: Input[String] = null,
    email: Input[String] = null,
    invite: Input[Boolean] = null,
    masterId: Input[String] = null,
    memberStatus: Input[String] = null
  ): MemberState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invite != null) __obj.updateDynamic("invite")(invite.asInstanceOf[js.Any])
    if (masterId != null) __obj.updateDynamic("masterId")(masterId.asInstanceOf[js.Any])
    if (memberStatus != null) __obj.updateDynamic("memberStatus")(memberStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberState]
  }
}

