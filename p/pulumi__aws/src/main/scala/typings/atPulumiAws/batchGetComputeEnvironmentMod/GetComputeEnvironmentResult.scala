package typings.atPulumiAws.batchGetComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComputeEnvironmentResult extends js.Object {
  /**
    * The ARN of the compute environment.
    */
  val arn: String
  val computeEnvironmentName: String
  /**
    * The ARN of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ARN of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: String
  /**
    * The state of the compute environment (for example, `ENABLED` or `DISABLED`). If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
    */
  val state: String
  /**
    * The current status of the compute environment (for example, `CREATING` or `VALID`).
    */
  val status: String
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: String
  /**
    * The type of the compute environment (for example, `MANAGED` or `UNMANAGED`).
    */
  val `type`: String
}

object GetComputeEnvironmentResult {
  @scala.inline
  def apply(
    arn: String,
    computeEnvironmentName: String,
    ecsClusterArn: String,
    id: String,
    serviceRole: String,
    state: String,
    status: String,
    statusReason: String,
    `type`: String
  ): GetComputeEnvironmentResult = {
    val __obj = js.Dynamic.literal(arn = arn, computeEnvironmentName = computeEnvironmentName, ecsClusterArn = ecsClusterArn, id = id, serviceRole = serviceRole, state = state, status = status, statusReason = statusReason)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetComputeEnvironmentResult]
  }
}

