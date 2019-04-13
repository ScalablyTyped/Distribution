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
  def createContainer[T](component: reactLib.reactMod.ComponentType[T]): RelayContainerClass[T] = js.native
  def createContainer[T](component: reactLib.reactMod.ComponentType[T], params: CreateContainerOpts): RelayContainerClass[T] = js.native
  def injectNetworkLayer(networkLayer: RelayNetworkLayer): js.Any = js.native
  def isContainer(component: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]): scala.Boolean = js.native
}

