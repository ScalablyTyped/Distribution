package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/classic", JSImport.Namespace)
@js.native
object classicModMembers extends js.Object {
  val Store: Store = js.native
  def QL(args: js.Any*): java.lang.String = js.native
  def createContainer[T](component: reactLib.reactMod.ReactNs.ComponentType[T]): RelayContainerClass[T] = js.native
  def createContainer[T](component: reactLib.reactMod.ReactNs.ComponentType[T], params: CreateContainerOpts): RelayContainerClass[T] = js.native
  def injectNetworkLayer(networkLayer: RelayNetworkLayer): js.Any = js.native
  def isContainer(component: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]): scala.Boolean = js.native
}

