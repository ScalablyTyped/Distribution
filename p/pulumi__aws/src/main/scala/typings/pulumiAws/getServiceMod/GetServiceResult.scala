package typings.pulumiAws.getServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceResult extends js.Object {
  /**
    * The ARN of the ECS Service
    */
  val arn: String = js.native
  val clusterArn: String = js.native
  /**
    * The number of tasks for the ECS Service
    */
  val desiredCount: Double = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The launch type for the ECS Service
    */
  val launchType: String = js.native
  /**
    * The scheduling strategy for the ECS Service
    */
  val schedulingStrategy: String = js.native
  val serviceName: String = js.native
  /**
    * The family for the latest ACTIVE revision
    */
  val taskDefinition: String = js.native
}

object GetServiceResult {
  @scala.inline
  def apply(
    arn: String,
    clusterArn: String,
    desiredCount: Double,
    id: String,
    launchType: String,
    schedulingStrategy: String,
    serviceName: String,
    taskDefinition: String
  ): GetServiceResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], clusterArn = clusterArn.asInstanceOf[js.Any], desiredCount = desiredCount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchType = launchType.asInstanceOf[js.Any], schedulingStrategy = schedulingStrategy.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceResult]
  }
}

