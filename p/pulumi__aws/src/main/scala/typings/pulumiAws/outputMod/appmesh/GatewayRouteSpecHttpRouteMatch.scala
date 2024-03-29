package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteSpecHttpRouteMatch extends StObject {
  
  /**
    * Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
    */
  var prefix: String
}
object GatewayRouteSpecHttpRouteMatch {
  
  inline def apply(prefix: String): GatewayRouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteMatch]
  }
  
  extension [Self <: GatewayRouteSpecHttpRouteMatch](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
