package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEConnect
  extends StObject
     with SSECommand {
  
  var heartbeatIntervalMs: Double
  
  var heartbeatUrl: String
  
  var id: String
  
  var idleTimeoutMs: Double
  
  var unRegisterUrl: String
  
  var updateSubscriberUrl: String
}
object SSEConnect {
  
  inline def apply(
    channels: String,
    displayName: String,
    heartbeatIntervalMs: Double,
    heartbeatUrl: String,
    id: String,
    idleTimeoutMs: Double,
    profileUrl: String,
    unRegisterUrl: String,
    updateSubscriberUrl: String,
    userId: String
  ): SSEConnect = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], heartbeatUrl = heartbeatUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeoutMs = idleTimeoutMs.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], unRegisterUrl = unRegisterUrl.asInstanceOf[js.Any], updateSubscriberUrl = updateSubscriberUrl.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEConnect]
  }
  
  extension [Self <: SSEConnect](x: Self) {
    
    inline def setHeartbeatIntervalMs(value: Double): Self = StObject.set(x, "heartbeatIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatUrl(value: String): Self = StObject.set(x, "heartbeatUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutMs(value: Double): Self = StObject.set(x, "idleTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setUnRegisterUrl(value: String): Self = StObject.set(x, "unRegisterUrl", value.asInstanceOf[js.Any])
    
    inline def setUpdateSubscriberUrl(value: String): Self = StObject.set(x, "updateSubscriberUrl", value.asInstanceOf[js.Any])
  }
}
