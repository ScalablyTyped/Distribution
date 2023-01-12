package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.UP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationReplicaLinkUpInfo extends StObject {
  
  var master_link_status: UP
}
object ReplicationReplicaLinkUpInfo {
  
  inline def apply(master_link_status: UP): ReplicationReplicaLinkUpInfo = {
    val __obj = js.Dynamic.literal(master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkUpInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationReplicaLinkUpInfo] (val x: Self) extends AnyVal {
    
    inline def setMaster_link_status(value: UP): Self = StObject.set(x, "master_link_status", value.asInstanceOf[js.Any])
  }
}
