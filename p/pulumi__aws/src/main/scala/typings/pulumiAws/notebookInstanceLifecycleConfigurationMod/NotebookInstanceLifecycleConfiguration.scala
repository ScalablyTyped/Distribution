package typings.pulumiAws.notebookInstanceLifecycleConfigurationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration")
@js.native
class NotebookInstanceLifecycleConfiguration protected () extends CustomResource {
  /**
    * Create a NotebookInstanceLifecycleConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs) = this()
  def this(name: String, args: NotebookInstanceLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  /**
    * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
    */
  val onCreate: Output_[js.UndefOr[String]] = js.native
  /**
    * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
    */
  val onStart: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration")
@js.native
object NotebookInstanceLifecycleConfiguration extends js.Object {
  /**
    * Get an existing NotebookInstanceLifecycleConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NotebookInstanceLifecycleConfiguration = js.native
  def get(name: String, id: Input[ID], state: NotebookInstanceLifecycleConfigurationState): NotebookInstanceLifecycleConfiguration = js.native
  def get(
    name: String,
    id: Input[ID],
    state: NotebookInstanceLifecycleConfigurationState,
    opts: CustomResourceOptions
  ): NotebookInstanceLifecycleConfiguration = js.native
  /**
    * Returns true if the given object is an instance of NotebookInstanceLifecycleConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration.NotebookInstanceLifecycleConfiguration */ Boolean = js.native
}

