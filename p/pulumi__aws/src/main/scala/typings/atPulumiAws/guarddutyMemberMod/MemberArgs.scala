package typings.atPulumiAws.guarddutyMemberMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberArgs extends js.Object {
  /**
    * AWS account ID for member account.
    */
  val accountId: Input[String]
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: Input[String]
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Email address for member account.
    */
  val email: Input[String]
  /**
    * Message for invitation.
    */
  val invitationMessage: js.UndefOr[Input[String]] = js.undefined
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.undefined
}

object MemberArgs {
  @scala.inline
  def apply(
    accountId: Input[String],
    detectorId: Input[String],
    email: Input[String],
    disableEmailNotification: Input[Boolean] = null,
    invitationMessage: Input[String] = null,
    invite: Input[Boolean] = null
  ): MemberArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (disableEmailNotification != null) __obj.updateDynamic("disableEmailNotification")(disableEmailNotification.asInstanceOf[js.Any])
    if (invitationMessage != null) __obj.updateDynamic("invitationMessage")(invitationMessage.asInstanceOf[js.Any])
    if (invite != null) __obj.updateDynamic("invite")(invite.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberArgs]
  }
}

