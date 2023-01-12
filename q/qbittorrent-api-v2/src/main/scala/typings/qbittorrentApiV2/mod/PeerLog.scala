package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerLog extends StObject {
  
  var blocked: Boolean
  
  var id: Double
  
  var ip: String
  
  var reason: String
  
  var timestamp: Double
}
object PeerLog {
  
  inline def apply(blocked: Boolean, id: Double, ip: String, reason: String, timestamp: Double): PeerLog = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerLog] (val x: Self) extends AnyVal {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
