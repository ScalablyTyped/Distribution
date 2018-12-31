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

