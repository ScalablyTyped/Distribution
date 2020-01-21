package typings.pulumiAws.ecsGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * The name of the ECS Cluster
    */
  val clusterName: String = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterName: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterArgs]
  }
}

