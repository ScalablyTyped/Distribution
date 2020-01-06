package typings.atPulumiAws.batchJobQueueMod

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(
    arn: Input[String] = null,
    computeEnvironments: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    priority: Input[Double] = null,
    state: Input[String] = null
  ): JobQueueState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (computeEnvironments != null) __obj.updateDynamic("computeEnvironments")(computeEnvironments.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueState]
  }
}

