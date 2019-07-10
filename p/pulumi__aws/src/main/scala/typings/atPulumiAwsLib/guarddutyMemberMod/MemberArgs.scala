package typings
package atPulumiAwsLib.guarddutyMemberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberArgs extends js.Object {
  /**
    * AWS account ID for member account.
    */
  val accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Email address for member account.
    */
  val email: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Message for invitation.
    */
  val invitationMessage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val invite: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object MemberArgs {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    email: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    disableEmailNotification: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    invitationMessage: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    invite: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): MemberArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (disableEmailNotification != null) __obj.updateDynamic("disableEmailNotification")(disableEmailNotification.asInstanceOf[js.Any])
    if (invitationMessage != null) __obj.updateDynamic("invitationMessage")(invitationMessage.asInstanceOf[js.Any])
    if (invite != null) __obj.updateDynamic("invite")(invite.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberArgs]
  }
}

