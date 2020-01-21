package typings.reactFns.networkNetworkMod

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Network/Network", "Network")
@js.native
class Network ()
  extends Component[SharedRenderProps[NetworkProps], NetworkProps, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MNetwork(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNetwork(): Unit = js.native
  def handleOffline(): Unit = js.native
  def handleOnline(): Unit = js.native
}

