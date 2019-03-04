package typings
package atPulumiAwsLib.cloudhsmv2GetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterArgs extends js.Object {
  /**
    * The id of Cloud HSM v2 cluster.
    */
  val clusterId: java.lang.String
  /**
    * The state of the cluster to be found.
    */
  val clusterState: js.UndefOr[java.lang.String] = js.undefined
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterId: java.lang.String, clusterState: java.lang.String = null): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId)
    if (clusterState != null) __obj.updateDynamic("clusterState")(clusterState)
    __obj.asInstanceOf[GetClusterArgs]
  }
}

