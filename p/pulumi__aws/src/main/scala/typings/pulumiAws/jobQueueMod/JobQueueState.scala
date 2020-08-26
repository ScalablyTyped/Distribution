package typings.pulumiAws.jobQueueMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobQueueState extends js.Object {
  /**
    * The Amazon Resource Name of the job queue.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the set of compute environments
    * mapped to a job queue and their order.  The position of the compute environments
    * in the list will dictate the order. You can associate up to 3 compute environments
    * with a job queue.
    */
  val computeEnvironments: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Specifies the name of the job queue.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The priority of the job queue. Job queues with a higher priority
    * are evaluated first when associated with the same compute environment.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
  /**
    * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
    */
  val state: js.UndefOr[Input[String]] = js.native
}

object JobQueueState {
  @scala.inline
  def apply(): JobQueueState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobQueueState]
  }
  @scala.inline
  implicit class JobQueueStateOps[Self <: JobQueueState] (val x: Self) extends AnyVal {
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
    def setComputeEnvironmentsVarargs(value: Input[String]*): Self = this.set("computeEnvironments", js.Array(value :_*))
    @scala.inline
    def setComputeEnvironments(value: Input[js.Array[Input[String]]]): Self = this.set("computeEnvironments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeEnvironments: Self = this.set("computeEnvironments", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

