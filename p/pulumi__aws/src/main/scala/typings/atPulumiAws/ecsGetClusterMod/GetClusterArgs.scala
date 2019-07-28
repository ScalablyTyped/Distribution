package typings.atPulumiAws.ecsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The name of the ECS Cluster
    */
  val clusterName: String
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterName: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName)
  
    __obj.asInstanceOf[GetClusterArgs]
  }
}

