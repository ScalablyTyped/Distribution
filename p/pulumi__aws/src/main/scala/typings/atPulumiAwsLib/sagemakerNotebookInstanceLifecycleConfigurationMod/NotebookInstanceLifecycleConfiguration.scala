package typings
package atPulumiAwsLib.sagemakerNotebookInstanceLifecycleConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker/notebookInstanceLifecycleConfiguration", "NotebookInstanceLifecycleConfiguration")
@js.native
class NotebookInstanceLifecycleConfiguration protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a NotebookInstanceLifecycleConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: NotebookInstanceLifecycleConfigurationArgs) = this()
  def this(name: java.lang.String, args: NotebookInstanceLifecycleConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the lifecycle configuration (must be unique). If omitted, Terraform will assign a random, unique name.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
    */
  val onCreate: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it's created.
    */
  val onStart: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationState
  ): atPulumiAwsLib.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfigurationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sagemakerNotebookInstanceLifecycleConfigurationMod.NotebookInstanceLifecycleConfiguration = js.native
}

