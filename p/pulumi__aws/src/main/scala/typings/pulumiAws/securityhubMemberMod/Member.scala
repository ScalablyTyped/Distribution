package typings.pulumiAws.securityhubMemberMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/securityhub/member", "Member")
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
    * The ID of the member AWS account.
    */
  val accountId: Output_[String] = js.native
  /**
    * The email of the member AWS account.
    */
  val email: Output_[String] = js.native
  /**
    * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
    */
  val invite: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The ID of the master Security Hub AWS account.
    */
  val masterId: Output_[String] = js.native
  /**
    * The status of the relationship between the member account and its master account.
    */
  val memberStatus: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/securityhub/member", "Member")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/member.Member */ Boolean = js.native
}

