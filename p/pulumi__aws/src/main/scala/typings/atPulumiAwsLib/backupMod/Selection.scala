package typings
package atPulumiAwsLib.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup", "Selection")
@js.native
class Selection protected ()
  extends atPulumiAwsLib.backupSelectionMod.Selection {
  /**
    * Create a Selection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.backupSelectionMod.SelectionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.backupSelectionMod.SelectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/backup", "Selection")
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

