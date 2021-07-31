package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationReplicaSyncOffInfo extends StObject {
  
  var master_sync_in_progress: OFF
}
object ReplicationReplicaSyncOffInfo {
  
  @scala.inline
  def apply(master_sync_in_progress: OFF): ReplicationReplicaSyncOffInfo = {
    val __obj = js.Dynamic.literal(master_sync_in_progress = master_sync_in_progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaSyncOffInfo]
  }
  
  @scala.inline
  implicit class ReplicationReplicaSyncOffInfoMutableBuilder[Self <: ReplicationReplicaSyncOffInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_sync_in_progress(value: OFF): Self = StObject.set(x, "master_sync_in_progress", value.asInstanceOf[js.Any])
  }
}
