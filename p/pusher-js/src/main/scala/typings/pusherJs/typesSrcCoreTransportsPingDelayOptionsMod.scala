package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsPingDelayOptionsMod {
  
  trait PingDelayOptions extends StObject {
    
    var maxPingDelay: js.UndefOr[Double] = js.undefined
    
    var minPingDelay: js.UndefOr[Double] = js.undefined
    
    var pingDelay: js.UndefOr[Double] = js.undefined
  }
  object PingDelayOptions {
    
    inline def apply(): PingDelayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PingDelayOptions]
    }
    
    extension [Self <: PingDelayOptions](x: Self) {
      
      inline def setMaxPingDelay(value: Double): Self = StObject.set(x, "maxPingDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxPingDelayUndefined: Self = StObject.set(x, "maxPingDelay", js.undefined)
      
      inline def setMinPingDelay(value: Double): Self = StObject.set(x, "minPingDelay", value.asInstanceOf[js.Any])
      
      inline def setMinPingDelayUndefined: Self = StObject.set(x, "minPingDelay", js.undefined)
      
      inline def setPingDelay(value: Double): Self = StObject.set(x, "pingDelay", value.asInstanceOf[js.Any])
      
      inline def setPingDelayUndefined: Self = StObject.set(x, "pingDelay", js.undefined)
    }
  }
}
