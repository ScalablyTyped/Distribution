package typings.atPulumiAws.backupSelectionMod

import typings.atPulumiAws.typesOutputMod.backupNs.SelectionSelectionTag
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup/selection", "Selection")
@js.native
class Selection protected () extends CustomResource {
  /**
    * Create a Selection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SelectionArgs) = this()
  def this(name: String, args: SelectionArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
    */
  val iamRoleArn: Output[String] = js.native
  /**
    * The display name of a resource selection document.
    */
  val name: Output[String] = js.native
  /**
    * The backup plan ID to be associated with the selection of resources.
    */
  val planId: Output[String] = js.native
  /**
    * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
    */
  val resources: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Tag-based conditions used to specify a set of resources to assign to a backup plan.
    */
  val selectionTags: Output[js.UndefOr[js.Array[SelectionSelectionTag]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/backup/selection", "Selection")
@js.native
object Selection extends js.Object {
  /**
    * Get an existing Selection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Selection = js.native
  def get(name: String, id: Input[ID], state: SelectionState): Selection = js.native
  def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): Selection = js.native
  /**
    * Returns true if the given object is an instance of Selection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = js.native
}

