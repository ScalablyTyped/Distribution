package typings.atPulumiAws.guarddutyMemberMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberState extends js.Object {
  /**
    * AWS account ID for member account.
    */
  val accountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Email address for member account.
    */
  val email: js.UndefOr[Input[String]] = js.undefined
  /**
    * Message for invitation.
    */
  val invitationMessage: js.UndefOr[Input[String]] = js.undefined
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The status of the relationship between the member account and its master account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
    */
  val relationshipStatus: js.UndefOr[Input[String]] = js.undefined
}

object MemberState {
  @scala.inline
  def apply(
    accountId: Input[String] = null,
    detectorId: Input[String] = null,
    disableEmailNotification: Input[Boolean] = null,
    email: Input[String] = null,
    invitationMessage: Input[String] = null,
    invite: Input[Boolean] = null,
    relationshipStatus: Input[String] = null
  ): MemberState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (disableEmailNotification != null) __obj.updateDynamic("disableEmailNotification")(disableEmailNotification.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invitationMessage != null) __obj.updateDynamic("invitationMessage")(invitationMessage.asInstanceOf[js.Any])
    if (invite != null) __obj.updateDynamic("invite")(invite.asInstanceOf[js.Any])
    if (relationshipStatus != null) __obj.updateDynamic("relationshipStatus")(relationshipStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberState]
  }
}

