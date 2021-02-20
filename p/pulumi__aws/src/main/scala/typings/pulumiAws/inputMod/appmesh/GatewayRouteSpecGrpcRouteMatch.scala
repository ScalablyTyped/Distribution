package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecGrpcRouteMatch extends StObject {
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: Input[String] = js.native
}
object GatewayRouteSpecGrpcRouteMatch {
  
  @scala.inline
  def apply(serviceName: Input[String]): GatewayRouteSpecGrpcRouteMatch = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRouteMatch]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecGrpcRouteMatchMutableBuilder[Self <: GatewayRouteSpecGrpcRouteMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
