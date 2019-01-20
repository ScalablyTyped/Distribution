package typings
package atPulumiAwsLib.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker", "NotebookInstance")
@js.native
class NotebookInstance protected ()
  extends atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstance {
  /**
    * Create a NotebookInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstanceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/sagemaker", "NotebookInstance")
@js.native
object NotebookInstance extends js.Object {
  /**
    * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstanceState
  ): atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sagemakerNotebookInstanceMod.NotebookInstance = js.native
}

