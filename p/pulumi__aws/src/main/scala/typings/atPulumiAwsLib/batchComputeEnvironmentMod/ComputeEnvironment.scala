package typings
package atPulumiAwsLib.batchComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch/computeEnvironment", "ComputeEnvironment")
@js.native
class ComputeEnvironment protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ComputeEnvironmentArgs) = this()
  def this(name: java.lang.String, args: ComputeEnvironmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
    */
  val computeEnvironmentName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BidPercentage]] = js.native
  val eccClusterArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironmentState
  ): atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironment = js.native
}

