package typings
package atPulumiAwsLib.batchGetComputeEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComputeEnvironmentResult extends js.Object {
  /**
    * The ARN of the compute environment.
    */
  val arn: java.lang.String
  /**
    * The ARN of the underlying Amazon ECS cluster used by the compute environment.
    */
  val ecsClusterArn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ARN of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: java.lang.String
  /**
    * The state of the compute environment (for example, `ENABLED` or `DISABLED`). If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues.
    */
  val state: java.lang.String
  /**
    * The current status of the compute environment (for example, `CREATING` or `VALID`).
    */
  val status: java.lang.String
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  val statusReason: java.lang.String
  /**
    * The type of the compute environment (for example, `MANAGED` or `UNMANAGED`).
    */
  val `type`: java.lang.String
}

object GetComputeEnvironmentResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    ecsClusterArn: java.lang.String,
    id: java.lang.String,
    serviceRole: java.lang.String,
    state: java.lang.String,
    status: java.lang.String,
    statusReason: java.lang.String,
    `type`: java.lang.String
  ): GetComputeEnvironmentResult = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("ecsClusterArn")(ecsClusterArn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("serviceRole")(serviceRole)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusReason")(statusReason)
    __obj.asInstanceOf[GetComputeEnvironmentResult]
  }
}

