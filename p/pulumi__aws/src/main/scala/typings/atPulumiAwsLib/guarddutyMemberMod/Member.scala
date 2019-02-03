package typings
package atPulumiAwsLib.guarddutyMemberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/member", "Member")
@js.native
class Member protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Member resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: MemberArgs) = this()
  def this(name: java.lang.String, args: MemberArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * AWS account ID for member account.
    */
  val accountId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Email address for member account.
    */
  val email: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Message for invitation.
    */
  val invitationMessage: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the Terraform state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The status of the relationship between the member account and its master account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
    */
  val relationshipStatus: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/guardduty/member", "Member")
@js.native
object Member extends js.Object {
  /**
    * Get an existing Member resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.guarddutyMemberMod.Member = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyMemberMod.MemberState
  ): atPulumiAwsLib.guarddutyMemberMod.Member = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.guarddutyMemberMod.MemberState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.guarddutyMemberMod.Member = js.native
}

