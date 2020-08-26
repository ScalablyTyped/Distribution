package typings.pulumiAws.quicksightGroupMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/quicksight/group", "Group")
@js.native
class Group protected () extends CustomResource {
  /**
    * Create a Group resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GroupArgs) = this()
  def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of group
    */
  val arn: Output_[String] = js.native
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: Output_[String] = js.native
  /**
    * A description for the group.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A name for the group.
    */
  val groupName: Output_[String] = js.native
  /**
    * The namespace. Currently, you should set this to `default`.
    */
  val namespace: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/quicksight/group", "Group")
@js.native
object Group extends js.Object {
  /**
    * Get an existing Group resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Group = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Group = js.native
  def get(name: String, id: Input[ID], state: GroupState): Group = js.native
  def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = js.native
  /**
    * Returns true if the given object is an instance of Group.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/group.Group */ Boolean = js.native
}

