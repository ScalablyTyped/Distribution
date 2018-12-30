package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster", JSImport.Namespace)
@js.native
class namespaced () extends SocketCluster {
  def this(options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions) = this()
}

@JSImport("socketcluster", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def create(): socketclusterLib.socketclusterMod.SocketCluster = js.native
  def create(options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions): socketclusterLib.socketclusterMod.SocketCluster = js.native
}

