package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInfo extends js.Object {
  var cluster_enabled: Flag
}

object ClusterInfo {
  @scala.inline
  def apply(cluster_enabled: Flag): ClusterInfo = {
    val __obj = js.Dynamic.literal(cluster_enabled = cluster_enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterInfo]
  }
}

