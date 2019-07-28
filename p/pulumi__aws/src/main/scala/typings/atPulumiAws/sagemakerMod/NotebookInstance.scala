package typings.atPulumiAws.sagemakerMod

import typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstanceArgs
import typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstanceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker", "NotebookInstance")
@js.native
class NotebookInstance protected ()
  extends typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance {
  /**
    * Create a NotebookInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NotebookInstanceArgs) = this()
  def this(name: String, args: NotebookInstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance = js.native
  def get(name: String, id: Input[ID], state: NotebookInstanceState): typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance = js.native
  def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.sagemakerNotebookInstanceMod.NotebookInstance = js.native
  /**
    * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
}

