package typings
package atPulumiAwsLib.ecsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The name of the ECS Cluster
    */
  val clusterName: java.lang.String
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterName: java.lang.String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName)
  
    __obj.asInstanceOf[GetClusterArgs]
  }
}

