package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecGrpcRouteMatch extends StObject {
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: Input[String]
}
object GatewayRouteSpecGrpcRouteMatch {
  
  inline def apply(serviceName: Input[String]): GatewayRouteSpecGrpcRouteMatch = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteMatch]
  }
  
  extension [Self <: GatewayRouteSpecGrpcRouteMatch](x: Self) {
    
    inline def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
