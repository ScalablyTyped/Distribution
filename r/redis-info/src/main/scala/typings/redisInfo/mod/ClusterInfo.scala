package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterInfo extends js.Object {
  
  var cluster_enabled: Flag = js.native
}
object ClusterInfo {
  
  @scala.inline
  def apply(cluster_enabled: Flag): ClusterInfo = {
    val __obj = js.Dynamic.literal(cluster_enabled = cluster_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInfo]
  }
  
  @scala.inline
  implicit class ClusterInfoOps[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    
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
    def setCluster_enabled(value: Flag): Self = this.set("cluster_enabled", value.asInstanceOf[js.Any])
  }
}
