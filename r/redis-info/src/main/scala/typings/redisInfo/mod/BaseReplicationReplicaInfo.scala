package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.slave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseReplicationReplicaInfo extends StObject {
  
  var connected_slaves: String
  
  var master_host: String
  
  var master_last_io_seconds_ago: String
  
  var master_port: String
  
  var min_slaves_good_slaves: String
  
  var role: slave
  
  var slave_priority: String
  
  var slave_read_only: Flag
  
  var slave_repl_offset: String
}
object BaseReplicationReplicaInfo {
  
  inline def apply(
    connected_slaves: String,
    master_host: String,
    master_last_io_seconds_ago: String,
    master_port: String,
    min_slaves_good_slaves: String,
    slave_priority: String,
    slave_read_only: Flag,
    slave_repl_offset: String
  ): BaseReplicationReplicaInfo = {
    val __obj = js.Dynamic.literal(connected_slaves = connected_slaves.asInstanceOf[js.Any], master_host = master_host.asInstanceOf[js.Any], master_last_io_seconds_ago = master_last_io_seconds_ago.asInstanceOf[js.Any], master_port = master_port.asInstanceOf[js.Any], min_slaves_good_slaves = min_slaves_good_slaves.asInstanceOf[js.Any], role = "slave", slave_priority = slave_priority.asInstanceOf[js.Any], slave_read_only = slave_read_only.asInstanceOf[js.Any], slave_repl_offset = slave_repl_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseReplicationReplicaInfo]
  }
  
  extension [Self <: BaseReplicationReplicaInfo](x: Self) {
    
    inline def setConnected_slaves(value: String): Self = StObject.set(x, "connected_slaves", value.asInstanceOf[js.Any])
    
    inline def setMaster_host(value: String): Self = StObject.set(x, "master_host", value.asInstanceOf[js.Any])
    
    inline def setMaster_last_io_seconds_ago(value: String): Self = StObject.set(x, "master_last_io_seconds_ago", value.asInstanceOf[js.Any])
    
    inline def setMaster_port(value: String): Self = StObject.set(x, "master_port", value.asInstanceOf[js.Any])
    
    inline def setMin_slaves_good_slaves(value: String): Self = StObject.set(x, "min_slaves_good_slaves", value.asInstanceOf[js.Any])
    
    inline def setRole(value: slave): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSlave_priority(value: String): Self = StObject.set(x, "slave_priority", value.asInstanceOf[js.Any])
    
    inline def setSlave_read_only(value: Flag): Self = StObject.set(x, "slave_read_only", value.asInstanceOf[js.Any])
    
    inline def setSlave_repl_offset(value: String): Self = StObject.set(x, "slave_repl_offset", value.asInstanceOf[js.Any])
  }
}
