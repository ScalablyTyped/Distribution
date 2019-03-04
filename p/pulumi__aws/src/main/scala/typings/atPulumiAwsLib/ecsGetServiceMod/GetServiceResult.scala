package typings
package atPulumiAwsLib.ecsGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceResult extends js.Object {
  /**
    * The ARN of the ECS Service
    */
  val arn: java.lang.String
  /**
    * The number of tasks for the ECS Service
    */
  val desiredCount: scala.Double
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The launch type for the ECS Service
    */
  val launchType: java.lang.String
  /**
    * The scheduling strategy for the ECS Service
    */
  val schedulingStrategy: java.lang.String
  /**
    * The family for the latest ACTIVE revision
    */
  val taskDefinition: java.lang.String
}

object GetServiceResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    desiredCount: scala.Double,
    id: java.lang.String,
    launchType: java.lang.String,
    schedulingStrategy: java.lang.String,
    taskDefinition: java.lang.String
  ): GetServiceResult = {
    val __obj = js.Dynamic.literal(arn = arn, desiredCount = desiredCount, id = id, launchType = launchType, schedulingStrategy = schedulingStrategy, taskDefinition = taskDefinition)
  
    __obj.asInstanceOf[GetServiceResult]
  }
}

