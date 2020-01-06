package typings.atPulumiAws.batchComputeEnvironmentMod

import typings.atPulumiAws.typesInputMod.batch.ComputeEnvironmentComputeResources
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
    */
  val computeEnvironmentName: js.UndefOr[Input[String]] = js.native
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: js.UndefOr[Input[ComputeEnvironmentComputeResources]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: js.UndefOr[Input[String]] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: js.UndefOr[Input[String]] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object ComputeEnvironmentState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    computeEnvironmentName: Input[String] = null,
    computeResources: Input[ComputeEnvironmentComputeResources] = null,
    ecsClusterArn: Input[String] = null,
    serviceRole: Input[String] = null,
    state: Input[String] = null,
    status: Input[String] = null,
    statusReason: Input[String] = null,
    `type`: Input[String] = null
  ): ComputeEnvironmentState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (computeEnvironmentName != null) __obj.updateDynamic("computeEnvironmentName")(computeEnvironmentName.asInstanceOf[js.Any])
    if (computeResources != null) __obj.updateDynamic("computeResources")(computeResources.asInstanceOf[js.Any])
    if (ecsClusterArn != null) __obj.updateDynamic("ecsClusterArn")(ecsClusterArn.asInstanceOf[js.Any])
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentState]
  }
}

