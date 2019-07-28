package typings.atPulumiAws.ecsGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceResult extends js.Object {
  /**
    * The ARN of the ECS Service
    */
  val arn: String
  val clusterArn: String
  /**
    * The number of tasks for the ECS Service
    */
  val desiredCount: Double
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The launch type for the ECS Service
    */
  val launchType: String
  /**
    * The scheduling strategy for the ECS Service
    */
  val schedulingStrategy: String
  val serviceName: String
  /**
    * The family for the latest ACTIVE revision
    */
  val taskDefinition: String
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
    val __obj = js.Dynamic.literal(arn = arn, clusterArn = clusterArn, desiredCount = desiredCount, id = id, launchType = launchType, schedulingStrategy = schedulingStrategy, serviceName = serviceName, taskDefinition = taskDefinition)
  
    __obj.asInstanceOf[GetServiceResult]
  }
}

