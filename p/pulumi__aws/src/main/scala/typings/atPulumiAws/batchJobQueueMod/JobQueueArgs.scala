package typings.atPulumiAws.batchJobQueueMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobQueueArgs extends js.Object {
  /**
    * Specifies the set of compute environments
    * mapped to a job queue and their order.  The position of the compute environments
    * in the list will dictate the order. You can associate up to 3 compute environments
    * with a job queue.
    */
  val computeEnvironments: Input[js.Array[Input[String]]] = js.native
  /**
    * Specifies the name of the job queue.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The priority of the job queue. Job queues with a higher priority
    * are evaluated first when associated with the same compute environment.
    */
  val priority: Input[Double] = js.native
  /**
    * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
    */
  val state: Input[String] = js.native
}

object JobQueueArgs {
  @scala.inline
  def apply(
    computeEnvironments: Input[js.Array[Input[String]]],
    priority: Input[Double],
    state: Input[String],
    name: Input[String] = null
  ): JobQueueArgs = {
    val __obj = js.Dynamic.literal(computeEnvironments = computeEnvironments.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueArgs]
  }
}

