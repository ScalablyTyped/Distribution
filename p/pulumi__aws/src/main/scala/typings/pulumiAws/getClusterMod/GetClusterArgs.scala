package typings.pulumiAws.getClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(clusterId: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
  
  @scala.inline
  implicit class GetClusterArgsOps[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterState(value: String): Self = this.set("clusterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterState: Self = this.set("clusterState", js.undefined)
  }
}
