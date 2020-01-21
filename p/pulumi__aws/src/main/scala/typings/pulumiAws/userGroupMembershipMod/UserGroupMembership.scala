package typings.pulumiAws.userGroupMembershipMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership")
@js.native
class UserGroupMembership protected () extends CustomResource {
  /**
    * Create a UserGroupMembership resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserGroupMembershipArgs) = this()
  def this(name: String, args: UserGroupMembershipArgs, opts: CustomResourceOptions) = this()
  /**
    * A list of [IAM Groups][1] to add the user to
    */
  val groups: Output_[js.Array[String]] = js.native
  /**
    * The name of the [IAM User][2] to add to groups
    */
  val user: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership")
@js.native
object UserGroupMembership extends js.Object {
  /**
    * Get an existing UserGroupMembership resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): UserGroupMembership = js.native
  def get(name: String, id: Input[ID], state: UserGroupMembershipState): UserGroupMembership = js.native
  def get(name: String, id: Input[ID], state: UserGroupMembershipState, opts: CustomResourceOptions): UserGroupMembership = js.native
  /**
    * Returns true if the given object is an instance of UserGroupMembership.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userGroupMembership.UserGroupMembership */ Boolean = js.native
}

