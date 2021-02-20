package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[GatewayRouteSpecHttpRouteAction] = js.native
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: Input[GatewayRouteSpecHttpRouteMatch] = js.native
}
object GatewayRouteSpecHttpRoute {
  
  @scala.inline
  def apply(action: Input[GatewayRouteSpecHttpRouteAction], `match`: Input[GatewayRouteSpecHttpRouteMatch]): GatewayRouteSpecHttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRoute]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttpRouteMutableBuilder[Self <: GatewayRouteSpecHttpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Input[GatewayRouteSpecHttpRouteAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[GatewayRouteSpecHttpRouteMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
