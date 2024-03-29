package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetGroupHealthCheck extends StObject {
  
  var enabled: Boolean
  
  var healthyThreshold: Double
  
  var interval: Double
  
  var matcher: String
  
  var path: String
  
  var port: String
  
  var protocol: String
  
  var timeout: Double
  
  var unhealthyThreshold: Double
}
object GetTargetGroupHealthCheck {
  
  inline def apply(
    enabled: Boolean,
    healthyThreshold: Double,
    interval: Double,
    matcher: String,
    path: String,
    port: String,
    protocol: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): GetTargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupHealthCheck]
  }
  
  extension [Self <: GetTargetGroupHealthCheck](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setMatcher(value: String): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
