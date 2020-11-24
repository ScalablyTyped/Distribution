package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.networkNetworkMod.NetworkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/Network", JSImport.Namespace)
@js.native
object networkMod extends js.Object {
  
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
  
  @js.native
  class Network ()
    extends typings.reactFns.networkNetworkMod.Network
}
