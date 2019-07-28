package typings.atPulumiAws.batchGetJobQueueMod

import typings.atPulumiAws.Anon_ComputeEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobQueueResult extends js.Object {
  /**
    * The ARN of the job queue.
    */
  val arn: String
  /**
    * The compute environments that are attached to the job queue and the order in
    * which job placement is preferred. Compute environments are selected for job placement in ascending order.
    * * `compute_environment_order.#.order` - The order of the compute environment.
    * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
    */
  val computeEnvironmentOrders: js.Array[Anon_ComputeEnvironment]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * The priority of the job queue. Job queues with a higher priority are evaluated first when
    * associated with the same compute environment.
    */
  val priority: Double
  /**
    * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
    */
  val state: String
  /**
    * The current status of the job queue (for example, `CREATING` or `VALID`).
    */
  val status: String
  /**
    * A short, human-readable string to provide additional details about the current status
    * of the job queue.
    */
  val statusReason: String
}

object GetJobQueueResult {
  @scala.inline
  def apply(
    arn: String,
    computeEnvironmentOrders: js.Array[Anon_ComputeEnvironment],
    id: String,
    name: String,
    priority: Double,
    state: String,
    status: String,
    statusReason: String
  ): GetJobQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn, computeEnvironmentOrders = computeEnvironmentOrders, id = id, name = name, priority = priority, state = state, status = status, statusReason = statusReason)
  
    __obj.asInstanceOf[GetJobQueueResult]
  }
}

