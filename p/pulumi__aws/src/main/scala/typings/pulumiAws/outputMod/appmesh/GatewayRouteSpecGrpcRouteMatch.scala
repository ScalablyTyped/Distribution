package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRouteMatch extends StObject {
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: String
}
object GatewayRouteSpecGrpcRouteMatch {
  
  inline def apply(serviceName: String): GatewayRouteSpecGrpcRouteMatch = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteMatch]
  }
  
  extension [Self <: GatewayRouteSpecGrpcRouteMatch](x: Self) {
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
