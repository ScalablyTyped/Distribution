package typings
package atPulumiAwsLib.backupSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup/selection", "Selection")
@js.native
class Selection protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Selection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SelectionArgs) = this()
  def this(name: java.lang.String, args: SelectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
    */
  val iamRoleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The display name of a resource selection document.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The backup plan ID to be associated with the selection of resources.
    */
  val planId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
    */
  val resources: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Tag-based conditions used to specify a set of resources to assign to a backup plan.
    */
  val selectionTags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_KeyType]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.backupSelectionMod.Selection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.backupSelectionMod.SelectionState
  ): atPulumiAwsLib.backupSelectionMod.Selection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.backupSelectionMod.SelectionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.backupSelectionMod.Selection = js.native
  /**
    * Returns true if the given object is an instance of Selection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ scala.Boolean = js.native
}

