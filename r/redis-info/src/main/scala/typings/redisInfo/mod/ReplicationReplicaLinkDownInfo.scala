package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.DOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationReplicaLinkDownInfo extends StObject {
  
  var master_link_down_since_seconds: String = js.native
  
  var master_link_status: DOWN = js.native
}
object ReplicationReplicaLinkDownInfo {
  
  @scala.inline
  def apply(master_link_down_since_seconds: String, master_link_status: DOWN): ReplicationReplicaLinkDownInfo = {
    val __obj = js.Dynamic.literal(master_link_down_since_seconds = master_link_down_since_seconds.asInstanceOf[js.Any], master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkDownInfo]
  }
  
  @scala.inline
  implicit class ReplicationReplicaLinkDownInfoMutableBuilder[Self <: ReplicationReplicaLinkDownInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_link_down_since_seconds(value: String): Self = StObject.set(x, "master_link_down_since_seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_link_status(value: DOWN): Self = StObject.set(x, "master_link_status", value.asInstanceOf[js.Any])
  }
}
