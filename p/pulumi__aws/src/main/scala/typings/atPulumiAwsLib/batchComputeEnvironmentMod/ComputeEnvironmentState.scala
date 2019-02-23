package typings
package atPulumiAwsLib.batchComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeEnvironmentState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
    */
  val computeEnvironmentName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BidPercentageDesiredVcpus]] = js.undefined
  val eccClusterArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

