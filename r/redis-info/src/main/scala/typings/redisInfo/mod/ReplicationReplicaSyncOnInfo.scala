package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.ON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationReplicaSyncOnInfo extends StObject {
  
  var master_sync_in_progress: ON
  
  var master_sync_last_io_seconds_ago: String
  
  var master_sync_left_bytes: String
}
object ReplicationReplicaSyncOnInfo {
  
  @scala.inline
  def apply(
    master_sync_in_progress: ON,
    master_sync_last_io_seconds_ago: String,
    master_sync_left_bytes: String
  ): ReplicationReplicaSyncOnInfo = {
    val __obj = js.Dynamic.literal(master_sync_in_progress = master_sync_in_progress.asInstanceOf[js.Any], master_sync_last_io_seconds_ago = master_sync_last_io_seconds_ago.asInstanceOf[js.Any], master_sync_left_bytes = master_sync_left_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaSyncOnInfo]
  }
  
  @scala.inline
  implicit class ReplicationReplicaSyncOnInfoMutableBuilder[Self <: ReplicationReplicaSyncOnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster_sync_in_progress(value: ON): Self = StObject.set(x, "master_sync_in_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_sync_last_io_seconds_ago(value: String): Self = StObject.set(x, "master_sync_last_io_seconds_ago", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_sync_left_bytes(value: String): Self = StObject.set(x, "master_sync_left_bytes", value.asInstanceOf[js.Any])
  }
}
