package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.DOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationReplicaLinkDownInfo extends StObject {
  
  var master_link_down_since_seconds: String
  
  var master_link_status: DOWN
}
object ReplicationReplicaLinkDownInfo {
  
  inline def apply(master_link_down_since_seconds: String, master_link_status: DOWN): ReplicationReplicaLinkDownInfo = {
    val __obj = js.Dynamic.literal(master_link_down_since_seconds = master_link_down_since_seconds.asInstanceOf[js.Any], master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkDownInfo]
  }
  
  extension [Self <: ReplicationReplicaLinkDownInfo](x: Self) {
    
    inline def setMaster_link_down_since_seconds(value: String): Self = StObject.set(x, "master_link_down_since_seconds", value.asInstanceOf[js.Any])
    
    inline def setMaster_link_status(value: DOWN): Self = StObject.set(x, "master_link_status", value.asInstanceOf[js.Any])
  }
}
