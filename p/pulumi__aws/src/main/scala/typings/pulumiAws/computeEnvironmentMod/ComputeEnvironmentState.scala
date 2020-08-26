package typings.pulumiAws.computeEnvironmentMod

import typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources
import typings.pulumiPulumi.outputMod.Input
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
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
    */
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
  def apply(): ComputeEnvironmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeEnvironmentState]
  }
  @scala.inline
  implicit class ComputeEnvironmentStateOps[Self <: ComputeEnvironmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setComputeEnvironmentName(value: Input[String]): Self = this.set("computeEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeEnvironmentName: Self = this.set("computeEnvironmentName", js.undefined)
    @scala.inline
    def setComputeEnvironmentNamePrefix(value: Input[String]): Self = this.set("computeEnvironmentNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeEnvironmentNamePrefix: Self = this.set("computeEnvironmentNamePrefix", js.undefined)
    @scala.inline
    def setComputeResources(value: Input[ComputeEnvironmentComputeResources]): Self = this.set("computeResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeResources: Self = this.set("computeResources", js.undefined)
    @scala.inline
    def setEcsClusterArn(value: Input[String]): Self = this.set("ecsClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsClusterArn: Self = this.set("ecsClusterArn", js.undefined)
    @scala.inline
    def setServiceRole(value: Input[String]): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRole: Self = this.set("serviceRole", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusReason(value: Input[String]): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

