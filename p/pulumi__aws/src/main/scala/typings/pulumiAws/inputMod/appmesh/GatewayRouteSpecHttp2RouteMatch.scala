package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttp2RouteMatch extends StObject {
  
  /**
    * Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
    */
  var prefix: Input[String]
}
object GatewayRouteSpecHttp2RouteMatch {
  
  inline def apply(prefix: Input[String]): GatewayRouteSpecHttp2RouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2RouteMatch]
  }
  
  extension [Self <: GatewayRouteSpecHttp2RouteMatch](x: Self) {
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
