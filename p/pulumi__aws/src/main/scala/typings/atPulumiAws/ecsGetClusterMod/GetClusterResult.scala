package typings.atPulumiAws.ecsGetClusterMod

import typings.atPulumiAws.typesOutputMod.ecs.GetClusterSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * The ARN of the ECS Cluster
    */
  val arn: String
  val clusterName: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The number of pending tasks for the ECS Cluster
    */
  val pendingTasksCount: Double
  /**
    * The number of registered container instances for the ECS Cluster
    */
  val registeredContainerInstancesCount: Double
  /**
    * The number of running tasks for the ECS Cluster
    */
  val runningTasksCount: Double
  /**
    * The settings associated with the ECS Cluster.
    */
  val settings: js.Array[GetClusterSetting]
  /**
    * The status of the ECS Cluster
    */
  val status: String
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    clusterName: String,
    id: String,
    pendingTasksCount: Double,
    registeredContainerInstancesCount: Double,
    runningTasksCount: Double,
    settings: js.Array[GetClusterSetting],
    status: String
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, clusterName = clusterName, id = id, pendingTasksCount = pendingTasksCount, registeredContainerInstancesCount = registeredContainerInstancesCount, runningTasksCount = runningTasksCount, settings = settings, status = status)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

