package typings
package atPulumiAwsLib.batchGetJobQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobQueueResult extends js.Object {
  /**
    * The ARN of the job queue.
    */
  val arn: java.lang.String
  /**
    * The compute environments that are attached to the job queue and the order in
    * which job placement is preferred. Compute environments are selected for job placement in ascending order.
    * * `compute_environment_order.#.order` - The order of the compute environment.
    * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
    */
  val computeEnvironmentOrders: js.Array[atPulumiAwsLib.Anon_ComputeEnvironment]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  /**
    * The priority of the job queue. Job queues with a higher priority are evaluated first when
    * associated with the same compute environment.
    */
  val priority: scala.Double
  /**
    * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
    */
  val state: java.lang.String
  /**
    * The current status of the job queue (for example, `CREATING` or `VALID`).
    */
  val status: java.lang.String
  /**
    * A short, human-readable string to provide additional details about the current status
    * of the job queue.
    */
  val statusReason: java.lang.String
}

object GetJobQueueResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    computeEnvironmentOrders: js.Array[atPulumiAwsLib.Anon_ComputeEnvironment],
    id: java.lang.String,
    name: java.lang.String,
    priority: scala.Double,
    state: java.lang.String,
    status: java.lang.String,
    statusReason: java.lang.String
  ): GetJobQueueResult = {
    val __obj = js.Dynamic.literal(arn = arn, computeEnvironmentOrders = computeEnvironmentOrders, id = id, name = name, priority = priority, state = state, status = status, statusReason = statusReason)
  
    __obj.asInstanceOf[GetJobQueueResult]
  }
}

