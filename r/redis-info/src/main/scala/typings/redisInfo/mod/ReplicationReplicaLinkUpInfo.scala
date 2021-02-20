package typings.redisInfo.mod

import typings.redisInfo.mod.LinkStatus.UP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationReplicaLinkUpInfo extends StObject {
  
  var master_link_status: UP = js.native
}
object ReplicationReplicaLinkUpInfo {
  
  @scala.inline
  def apply(master_link_status: UP): ReplicationReplicaLinkUpInfo = {
    val __obj = js.Dynamic.literal(master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkUpInfo]
  }
  
  @scala.inline
  implicit class ReplicationReplicaLinkUpInfoMutableBuilder[Self <: ReplicationReplicaLinkUpInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_link_status(value: UP): Self = StObject.set(x, "master_link_status", value.asInstanceOf[js.Any])
  }
}
