package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distNetworkNetworkMod.NetworkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Network", JSImport.Namespace)
@js.native
object distNetworkMod extends js.Object {
  @js.native
  class Network ()
    extends typings.reactDashFns.distNetworkNetworkMod.Network
  
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
}

