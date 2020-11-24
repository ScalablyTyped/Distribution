package typings.pulumiAws.workflowMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/workflow", "Workflow")
@js.native
class Workflow protected () extends CustomResource {
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
  
  /**
    * Amazon Resource Name (ARN) of Glue Workflow
    */
  val arn: Output_[String] = js.native
  
  /**
    * A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
    */
  val defaultRunProperties: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  
  /**
    * Description of the workflow.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  val maxConcurrentRuns: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The name you assign to this workflow.
    */
  val name: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/workflow", "Workflow")
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
  def get(name: String, id: Input[ID]): Workflow = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Workflow = js.native
  def get(name: String, id: Input[ID], state: WorkflowState): Workflow = js.native
  def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): Workflow = js.native
  
  /**
    * Returns true if the given object is an instance of Workflow.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = js.native
}
