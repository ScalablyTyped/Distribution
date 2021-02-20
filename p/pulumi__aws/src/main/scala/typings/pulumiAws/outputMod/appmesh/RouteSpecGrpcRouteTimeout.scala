package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[RouteSpecGrpcRouteTimeoutIdle] = js.native
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[RouteSpecGrpcRouteTimeoutPerRequest] = js.native
}
object RouteSpecGrpcRouteTimeout {
  
  @scala.inline
  def apply(): RouteSpecGrpcRouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecGrpcRouteTimeout]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteTimeoutMutableBuilder[Self <: RouteSpecGrpcRouteTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: RouteSpecGrpcRouteTimeoutIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: RouteSpecGrpcRouteTimeoutPerRequest): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
