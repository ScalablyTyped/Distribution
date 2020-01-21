package typings.pulumiAws.groupMembershipMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/groupMembership", "GroupMembership")
@js.native
class GroupMembership protected () extends CustomResource {
  /**
    * Create a GroupMembership resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupMembershipArgs) = this()
  def this(name: String, args: GroupMembershipArgs, opts: CustomResourceOptions) = this()
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: Output_[String] = js.native
  /**
    * The name to identify the Group Membership
    */
  val name: Output_[String] = js.native
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: Output_[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/groupMembership", "GroupMembership")
@js.native
object GroupMembership extends js.Object {
  /**
    * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): GroupMembership = js.native
  def get(name: String, id: Input[ID], state: GroupMembershipState): GroupMembership = js.native
  def get(name: String, id: Input[ID], state: GroupMembershipState, opts: CustomResourceOptions): GroupMembership = js.native
  /**
    * Returns true if the given object is an instance of GroupMembership.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupMembership.GroupMembership */ Boolean = js.native
}

