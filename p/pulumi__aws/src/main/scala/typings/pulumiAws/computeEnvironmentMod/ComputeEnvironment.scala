package typings.pulumiAws.computeEnvironmentMod

import typings.pulumiAws.outputMod.batch.ComputeEnvironmentComputeResources
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch/computeEnvironment", "ComputeEnvironment")
@js.native
class ComputeEnvironment protected () extends CustomResource {
  /**
    * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ComputeEnvironmentArgs) = this()
  def this(name: String, args: ComputeEnvironmentArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  val arn: Output_[String] = js.native
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
    */
  val computeEnvironmentName: Output_[String] = js.native
  /**
    * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
    */
  val computeEnvironmentNamePrefix: Output_[js.UndefOr[String]] = js.native
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: Output_[js.UndefOr[ComputeEnvironmentComputeResources]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: Output_[String] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: Output_[String] = js.native
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: Output_[js.UndefOr[String]] = js.native
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  val status: Output_[String] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: Output_[String] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/batch/computeEnvironment", "ComputeEnvironment")
@js.native
object ComputeEnvironment extends js.Object {
  /**
    * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ComputeEnvironment = js.native
  def get(name: String, id: Input[ID], state: ComputeEnvironmentState): ComputeEnvironment = js.native
  def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): ComputeEnvironment = js.native
  /**
    * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = js.native
}

