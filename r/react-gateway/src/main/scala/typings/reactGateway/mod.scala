package typings.reactGateway

import typings.react.mod.Component
import typings.reactGateway.gatewayDestMod.GatewayDestProps
import typings.reactGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Gateway ()
    extends Component[GatewayProps, js.Object, js.Any]
  
  @js.native
  class GatewayDest ()
    extends Component[GatewayDestProps, js.Object, js.Any]
  
  @js.native
  class GatewayProvider ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class GatewayRegistry ()
    extends typings.reactGateway.gatewayRegistryMod.GatewayRegistry
  
}

