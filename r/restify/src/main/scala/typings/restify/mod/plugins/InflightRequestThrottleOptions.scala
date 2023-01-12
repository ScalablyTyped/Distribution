package typings.restify.mod.plugins

import typings.restify.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InflightRequestThrottleOptions extends StObject {
  
  var err: Any
  
  var limit: Double
  
  var server: Server
}
object InflightRequestThrottleOptions {
  
  inline def apply(err: Any, limit: Double, server: Server): InflightRequestThrottleOptions = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflightRequestThrottleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InflightRequestThrottleOptions] (val x: Self) extends AnyVal {
    
    inline def setErr(value: Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
