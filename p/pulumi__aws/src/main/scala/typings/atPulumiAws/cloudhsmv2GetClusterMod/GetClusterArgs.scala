package typings.atPulumiAws.cloudhsmv2GetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * The id of Cloud HSM v2 cluster.
    */
  val clusterId: String = js.native
  /**
    * The state of the cluster to be found.
    */
  val clusterState: js.UndefOr[String] = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterId: String, clusterState: String = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
    if (clusterState != null) __obj.updateDynamic("clusterState")(clusterState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
}

