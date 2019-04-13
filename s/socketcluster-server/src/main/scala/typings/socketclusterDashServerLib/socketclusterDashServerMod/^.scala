package typings
package socketclusterDashServerLib.socketclusterDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attach(server: nodeLib.httpMod.Server): SCServer = js.native
  def attach(server: nodeLib.httpMod.Server, options: socketclusterDashServerLib.scserverMod.SCServerOptions): SCServer = js.native
  def listen(): SCServer = js.native
  def listen(port: scala.Double): SCServer = js.native
  def listen(port: scala.Double, listeningListener: js.Function0[scala.Unit]): SCServer = js.native
  def listen(port: scala.Double, options: socketclusterDashServerLib.scserverMod.SCServerOptions): SCServer = js.native
  def listen(
    port: scala.Double,
    options: socketclusterDashServerLib.scserverMod.SCServerOptions,
    listeningListener: js.Function0[scala.Unit]
  ): SCServer = js.native
}

