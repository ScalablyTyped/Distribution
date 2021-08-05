package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[RouteSpecGrpcRouteTimeoutIdle] = js.undefined
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[RouteSpecGrpcRouteTimeoutPerRequest] = js.undefined
}
object RouteSpecGrpcRouteTimeout {
  
  inline def apply(): RouteSpecGrpcRouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecGrpcRouteTimeout]
  }
  
  extension [Self <: RouteSpecGrpcRouteTimeout](x: Self) {
    
    inline def setIdle(value: RouteSpecGrpcRouteTimeoutIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    inline def setPerRequest(value: RouteSpecGrpcRouteTimeoutPerRequest): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    inline def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
