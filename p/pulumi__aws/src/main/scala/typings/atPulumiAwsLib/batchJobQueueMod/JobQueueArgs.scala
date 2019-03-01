package typings
package atPulumiAwsLib.batchJobQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobQueueArgs extends js.Object {
  /**
    * Specifies the set of compute environments
    * mapped to a job queue and their order.  The position of the compute environments
    * in the list will dictate the order. You can associate up to 3 compute environments
    * with a job queue.
    */
  val computeEnvironments: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * Specifies the name of the job queue.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The priority of the job queue. Job queues with a higher priority
    * are evaluated first when associated with the same compute environment.
    */
  val priority: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
    */
  val state: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object JobQueueArgs {
  @scala.inline
  def apply(
    computeEnvironments: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    priority: atPulumiPulumiLib.outputMod.Input[scala.Double],
    state: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): JobQueueArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computeEnvironments")(computeEnvironments.asInstanceOf[js.Any])
    __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueArgs]
  }
}

