package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupStickiness extends StObject {
  
  /**
    * Only used when the type is `lbCookie`. The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
    */
  var cookieDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether  health checks are enabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of sticky sessions. The only current possible values are `lbCookie` for ALBs and `sourceIp` for NLBs.
    */
  var `type`: String
}
object TargetGroupStickiness {
  
  inline def apply(`type`: String): TargetGroupStickiness = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupStickiness]
  }
  
  extension [Self <: TargetGroupStickiness](x: Self) {
    
    inline def setCookieDuration(value: Double): Self = StObject.set(x, "cookieDuration", value.asInstanceOf[js.Any])
    
    inline def setCookieDurationUndefined: Self = StObject.set(x, "cookieDuration", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
