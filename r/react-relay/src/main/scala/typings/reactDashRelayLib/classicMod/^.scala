package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/classic", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Store: reactDashRelayLib.classicMod.Store = js.native
  def QL(args: js.Any*): java.lang.String = js.native
  def createContainer[T](component: reactLib.reactMod.ReactNs.ComponentType[T]): reactDashRelayLib.classicMod.RelayContainerClass[T] = js.native
  def createContainer[T](
    component: reactLib.reactMod.ReactNs.ComponentType[T],
    params: reactDashRelayLib.classicMod.CreateContainerOpts
  ): reactDashRelayLib.classicMod.RelayContainerClass[T] = js.native
  def injectNetworkLayer(networkLayer: reactDashRelayLib.classicMod.RelayNetworkLayer): js.Any = js.native
  def isContainer(component: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]): scala.Boolean = js.native
}

