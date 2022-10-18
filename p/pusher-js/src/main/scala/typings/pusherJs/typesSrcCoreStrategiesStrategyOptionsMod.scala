package typings.pusherJs

import typings.pusherJs.typesSrcCoreTimelineTimelineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesStrategyOptionsMod {
  
  trait StrategyOptions extends StObject {
    
    var failFast: js.UndefOr[Boolean] = js.undefined
    
    var hostNonTLS: js.UndefOr[String] = js.undefined
    
    var hostTLS: js.UndefOr[String] = js.undefined
    
    var httpPath: js.UndefOr[String] = js.undefined
    
    var ignoreNullOrigin: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var timeline: js.UndefOr[default] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timeoutLimit: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var useTLS: js.UndefOr[Boolean] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      inline def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
      
      inline def setHostNonTLS(value: String): Self = StObject.set(x, "hostNonTLS", value.asInstanceOf[js.Any])
      
      inline def setHostNonTLSUndefined: Self = StObject.set(x, "hostNonTLS", js.undefined)
      
      inline def setHostTLS(value: String): Self = StObject.set(x, "hostTLS", value.asInstanceOf[js.Any])
      
      inline def setHostTLSUndefined: Self = StObject.set(x, "hostTLS", js.undefined)
      
      inline def setHttpPath(value: String): Self = StObject.set(x, "httpPath", value.asInstanceOf[js.Any])
      
      inline def setHttpPathUndefined: Self = StObject.set(x, "httpPath", js.undefined)
      
      inline def setIgnoreNullOrigin(value: Boolean): Self = StObject.set(x, "ignoreNullOrigin", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNullOriginUndefined: Self = StObject.set(x, "ignoreNullOrigin", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setTimeline(value: default): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutLimit(value: Double): Self = StObject.set(x, "timeoutLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeoutLimitUndefined: Self = StObject.set(x, "timeoutLimit", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUseTLS(value: Boolean): Self = StObject.set(x, "useTLS", value.asInstanceOf[js.Any])
      
      inline def setUseTLSUndefined: Self = StObject.set(x, "useTLS", js.undefined)
    }
  }
}
