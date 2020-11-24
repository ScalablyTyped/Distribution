package typings.pulumiAws.memberMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberArgs extends js.Object {
  
  /**
    * AWS account ID for member account.
    */
  val accountId: Input[String] = js.native
  
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: Input[String] = js.native
  
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Email address for member account.
    */
  val email: Input[String] = js.native
  
  /**
    * Message for invitation.
    */
  val invitationMessage: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.native
}
object MemberArgs {
  
  @scala.inline
  def apply(accountId: Input[String], detectorId: Input[String], email: Input[String]): MemberArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
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
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEmailNotification(value: Input[Boolean]): Self = this.set("disableEmailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEmailNotification: Self = this.set("disableEmailNotification", js.undefined)
    
    @scala.inline
    def setInvitationMessage(value: Input[String]): Self = this.set("invitationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationMessage: Self = this.set("invitationMessage", js.undefined)
    
    @scala.inline
    def setInvite(value: Input[Boolean]): Self = this.set("invite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvite: Self = this.set("invite", js.undefined)
  }
}
