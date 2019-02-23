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
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the Terraform state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

