package typings.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionForwardStickiness extends StObject {
  
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var duration: Double
  
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ListenerDefaultActionForwardStickiness {
  
  inline def apply(duration: Double): ListenerDefaultActionForwardStickiness = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForwardStickiness]
  }
  
  extension [Self <: ListenerDefaultActionForwardStickiness](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
