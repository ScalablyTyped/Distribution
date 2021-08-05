package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecTcpRouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[RouteSpecTcpRouteTimeoutIdle] = js.undefined
}
object RouteSpecTcpRouteTimeout {
  
  inline def apply(): RouteSpecTcpRouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecTcpRouteTimeout]
  }
  
  extension [Self <: RouteSpecTcpRouteTimeout](x: Self) {
    
    inline def setIdle(value: RouteSpecTcpRouteTimeoutIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}
