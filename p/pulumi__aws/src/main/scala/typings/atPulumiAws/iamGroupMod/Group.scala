package typings.atPulumiAws.iamGroupMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/group", "Group")
@js.native
class Group protected () extends CustomResource {
  /**
    * Create a Group resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: GroupArgs) = this()
  def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN assigned by AWS for this group.
    */
  val arn: Output[String] = js.native
  /**
    * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
    */
  val name: Output[String] = js.native
  /**
    * Path in which to create the group.
    */
  val path: Output[js.UndefOr[String]] = js.native
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/group", "Group")
@js.native
object Group extends js.Object {
  /**
    * Get an existing Group resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Group = js.native
  def get(name: String, id: Input[ID], state: GroupState): Group = js.native
  def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = js.native
  /**
    * Returns true if the given object is an instance of Group.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/group.Group */ Boolean = js.native
}

