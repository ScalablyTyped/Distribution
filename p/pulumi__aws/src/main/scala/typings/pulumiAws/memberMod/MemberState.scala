package typings.pulumiAws.memberMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberState extends js.Object {
  
  /**
    * AWS account ID for member account.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Email address for member account.
    */
  val email: js.UndefOr[Input[String]] = js.native
  
  /**
    * Message for invitation.
    */
  val invitationMessage: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
    */
  val relationshipStatus: js.UndefOr[Input[String]] = js.native
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
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    
    @scala.inline
    def setDisableEmailNotification(value: Input[Boolean]): Self = this.set("disableEmailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEmailNotification: Self = this.set("disableEmailNotification", js.undefined)
    
    @scala.inline
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setInvitationMessage(value: Input[String]): Self = this.set("invitationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationMessage: Self = this.set("invitationMessage", js.undefined)
    
    @scala.inline
    def setInvite(value: Input[Boolean]): Self = this.set("invite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvite: Self = this.set("invite", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: Input[String]): Self = this.set("relationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipStatus: Self = this.set("relationshipStatus", js.undefined)
  }
}
