package typings.pulumiAws.computeEnvironmentMod

import typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentArgs extends js.Object {
  val computeEnvironmentName: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
    */
  val computeEnvironmentNamePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: js.UndefOr[Input[ComputeEnvironmentComputeResources]] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: Input[String] = js.native
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: Input[String] = js.native
}

object ComputeEnvironmentArgs {
  @scala.inline
  def apply(
    serviceRole: Input[String],
    `type`: Input[String],
    computeEnvironmentName: Input[String] = null,
    computeEnvironmentNamePrefix: Input[String] = null,
    computeResources: Input[ComputeEnvironmentComputeResources] = null,
    state: Input[String] = null
  ): ComputeEnvironmentArgs = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (computeEnvironmentName != null) __obj.updateDynamic("computeEnvironmentName")(computeEnvironmentName.asInstanceOf[js.Any])
    if (computeEnvironmentNamePrefix != null) __obj.updateDynamic("computeEnvironmentNamePrefix")(computeEnvironmentNamePrefix.asInstanceOf[js.Any])
    if (computeResources != null) __obj.updateDynamic("computeResources")(computeResources.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentArgs]
  }
}

