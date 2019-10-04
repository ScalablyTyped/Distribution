package typings.atPulumiAws.batchComputeEnvironmentMod

import typings.atPulumiAws.typesInputMod.batchNs.ComputeEnvironmentComputeResources
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeEnvironmentArgs extends js.Object {
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
    */
  val computeEnvironmentName: Input[String]
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: js.UndefOr[Input[ComputeEnvironmentComputeResources]] = js.undefined
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: Input[String]
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: Input[String]
}

object ComputeEnvironmentArgs {
  @scala.inline
  def apply(
    computeEnvironmentName: Input[String],
    serviceRole: Input[String],
    `type`: Input[String],
    computeResources: Input[ComputeEnvironmentComputeResources] = null,
    state: Input[String] = null
  ): ComputeEnvironmentArgs = {
    val __obj = js.Dynamic.literal(computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (computeResources != null) __obj.updateDynamic("computeResources")(computeResources.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentArgs]
  }
}

