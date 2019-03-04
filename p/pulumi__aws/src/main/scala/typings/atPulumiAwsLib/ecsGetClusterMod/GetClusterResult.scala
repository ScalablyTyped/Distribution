package typings
package atPulumiAwsLib.ecsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * The ARN of the ECS Cluster
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The number of pending tasks for the ECS Cluster
    */
  val pendingTasksCount: scala.Double
  /**
    * The number of registered container instances for the ECS Cluster
    */
  val registeredContainerInstancesCount: scala.Double
  /**
    * The number of running tasks for the ECS Cluster
    */
  val runningTasksCount: scala.Double
  /**
    * The status of the ECS Cluster
    */
  val status: java.lang.String
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    pendingTasksCount: scala.Double,
    registeredContainerInstancesCount: scala.Double,
    runningTasksCount: scala.Double,
    status: java.lang.String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, pendingTasksCount = pendingTasksCount, registeredContainerInstancesCount = registeredContainerInstancesCount, runningTasksCount = runningTasksCount, status = status)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

