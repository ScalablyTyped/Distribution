package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip extends StObject {
  
  var ip: String
  
  var port: Double
  
  var replicationOffest: Double
}
object Ip {
  
  inline def apply(ip: String, port: Double, replicationOffest: Double): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replicationOffest = replicationOffest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  extension [Self <: Ip](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setReplicationOffest(value: Double): Self = StObject.set(x, "replicationOffest", value.asInstanceOf[js.Any])
  }
}
