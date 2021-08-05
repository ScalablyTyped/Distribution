package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferCloseChannel extends StObject {
  
  var deferCloseChannel: Double
  
  var prefetch: Double
  
  var redeliveries: Limit
  
  var retry: Factor
  
  var vhost: String
}
object DeferCloseChannel {
  
  inline def apply(deferCloseChannel: Double, prefetch: Double, redeliveries: Limit, retry: Factor, vhost: String): DeferCloseChannel = {
    val __obj = js.Dynamic.literal(deferCloseChannel = deferCloseChannel.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferCloseChannel]
  }
  
  extension [Self <: DeferCloseChannel](x: Self) {
    
    inline def setDeferCloseChannel(value: Double): Self = StObject.set(x, "deferCloseChannel", value.asInstanceOf[js.Any])
    
    inline def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
    
    inline def setRedeliveries(value: Limit): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Factor): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
  }
}
