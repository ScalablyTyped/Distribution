package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpec extends StObject {
  
  /**
    * The specification of a gRPC gateway route.
    */
  var grpcRoute: js.UndefOr[GatewayRouteSpecGrpcRoute] = js.undefined
  
  /**
    * The specification of an HTTP/2 gateway route.
    */
  var http2Route: js.UndefOr[GatewayRouteSpecHttp2Route] = js.undefined
  
  /**
    * The specification of an HTTP gateway route.
    */
  var httpRoute: js.UndefOr[GatewayRouteSpecHttpRoute] = js.undefined
}
object GatewayRouteSpec {
  
  inline def apply(): GatewayRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteSpec]
  }
  
  extension [Self <: GatewayRouteSpec](x: Self) {
    
    inline def setGrpcRoute(value: GatewayRouteSpecGrpcRoute): Self = StObject.set(x, "grpcRoute", value.asInstanceOf[js.Any])
    
    inline def setGrpcRouteUndefined: Self = StObject.set(x, "grpcRoute", js.undefined)
    
    inline def setHttp2Route(value: GatewayRouteSpecHttp2Route): Self = StObject.set(x, "http2Route", value.asInstanceOf[js.Any])
    
    inline def setHttp2RouteUndefined: Self = StObject.set(x, "http2Route", js.undefined)
    
    inline def setHttpRoute(value: GatewayRouteSpecHttpRoute): Self = StObject.set(x, "httpRoute", value.asInstanceOf[js.Any])
    
    inline def setHttpRouteUndefined: Self = StObject.set(x, "httpRoute", js.undefined)
  }
}
