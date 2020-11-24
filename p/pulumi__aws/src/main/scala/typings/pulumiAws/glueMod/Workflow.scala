package typings.pulumiAws.glueMod

import typings.pulumiAws.workflowMod.WorkflowArgs
import typings.pulumiAws.workflowMod.WorkflowState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue", "Workflow")
@js.native
class Workflow protected ()
  extends typings.pulumiAws.workflowMod.Workflow {
  /**
    * Create a Workflow resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: WorkflowArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: WorkflowArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/glue", "Workflow")
@js.native
object Workflow extends js.Object {
  
  /**
    * Get an existing Workflow resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.workflowMod.Workflow = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.workflowMod.Workflow = js.native
  def get(name: String, id: Input[ID], state: WorkflowState): typings.pulumiAws.workflowMod.Workflow = js.native
  def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): typings.pulumiAws.workflowMod.Workflow = js.native
  
  /**
    * Returns true if the given object is an instance of Workflow.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = js.native
}
