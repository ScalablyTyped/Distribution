package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteTimeout extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[RouteSpecGrpcRouteTimeoutIdle]] = js.undefined
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[RouteSpecGrpcRouteTimeoutPerRequest]] = js.undefined
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
    def setIdle(value: Input[RouteSpecGrpcRouteTimeoutIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[RouteSpecGrpcRouteTimeoutPerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
