package typings
package socketclusterDashServerLib.socketclusterDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attach(server: nodeLib.httpMod.Server): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
  def attach(
    server: nodeLib.httpMod.Server,
    options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions
  ): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
  def listen(): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
  def listen(port: scala.Double): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
  def listen(port: scala.Double, listeningListener: js.Function0[scala.Unit]): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
  def listen(port: scala.Double, options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
  def listen(
    port: scala.Double,
    options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions,
    listeningListener: js.Function0[scala.Unit]
  ): socketclusterDashServerLib.socketclusterDashServerMod.SCServer = js.native
}

