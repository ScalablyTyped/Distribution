package typings.atPulumiAws.guarddutyMemberMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty/member", "Member")
@js.native
class Member protected () extends CustomResource {
  /**
    * Create a Member resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MemberArgs) = this()
  def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
  /**
    * AWS account ID for member account.
    */
  val accountId: Output[String] = js.native
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: Output[String] = js.native
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Email address for member account.
    */
  val email: Output[String] = js.native
  /**
    * Message for invitation.
    */
  val invitationMessage: Output[js.UndefOr[String]] = js.native
  val invite: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The status of the relationship between the member account and its master account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
    */
  val relationshipStatus: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): Member = js.native
  def get(name: String, id: Input[ID], state: MemberState): Member = js.native
  def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): Member = js.native
  /**
    * Returns true if the given object is an instance of Member.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
}

