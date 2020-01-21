package typings.pulumiAws.ecsGetClusterMod

import typings.pulumiAws.outputMod.ecs.GetClusterSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  /**
    * The ARN of the ECS Cluster
    */
  val arn: String = js.native
  val clusterName: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The number of pending tasks for the ECS Cluster
    */
  val pendingTasksCount: Double = js.native
  /**
    * The number of registered container instances for the ECS Cluster
    */
  val registeredContainerInstancesCount: Double = js.native
  /**
    * The number of running tasks for the ECS Cluster
    */
  val runningTasksCount: Double = js.native
  /**
    * The settings associated with the ECS Cluster.
    */
  val settings: js.Array[GetClusterSetting] = js.native
  /**
    * The status of the ECS Cluster
    */
  val status: String = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pendingTasksCount = pendingTasksCount.asInstanceOf[js.Any], registeredContainerInstancesCount = registeredContainerInstancesCount.asInstanceOf[js.Any], runningTasksCount = runningTasksCount.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

