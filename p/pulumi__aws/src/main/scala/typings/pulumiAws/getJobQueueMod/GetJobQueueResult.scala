package typings.pulumiAws.getJobQueueMod

import typings.pulumiAws.outputMod.batch.GetJobQueueComputeEnvironmentOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobQueueResult extends js.Object {
  /**
    * The ARN of the job queue.
    */
  val arn: String = js.native
  /**
    * The compute environments that are attached to the job queue and the order in
    * which job placement is preferred. Compute environments are selected for job placement in ascending order.
    * * `compute_environment_order.#.order` - The order of the compute environment.
    * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
    */
  val computeEnvironmentOrders: js.Array[GetJobQueueComputeEnvironmentOrder] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The priority of the job queue. Job queues with a higher priority are evaluated first when
    * associated with the same compute environment.
    */
  val priority: Double = js.native
  /**
    * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
    */
  val state: String = js.native
  /**
    * The current status of the job queue (for example, `CREATING` or `VALID`).
    */
  val status: String = js.native
  /**
    * A short, human-readable string to provide additional details about the current status
    * of the job queue.
    */
  val statusReason: String = js.native
}

object GetJobQueueResult {
  @scala.inline
  def apply(
    arn: String,
    computeEnvironmentOrders: js.Array[GetJobQueueComputeEnvironmentOrder],
    id: String,
    name: String,
    priority: Double,
    state: String,
    status: String,
    statusReason: String
  ): GetJobQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], computeEnvironmentOrders = computeEnvironmentOrders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobQueueResult]
  }
}

