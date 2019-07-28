package typings.socketclusterDashServer.socketclusterDashServerMod

import typings.node.httpMod.Server
import typings.socketclusterDashServer.scserverMod.SCServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attach(server: Server): SCServer = js.native
  def attach(server: Server, options: SCServerOptions): SCServer = js.native
  def listen(): SCServer = js.native
  def listen(port: Double): SCServer = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): SCServer = js.native
  def listen(port: Double, options: SCServerOptions): SCServer = js.native
  def listen(port: Double, options: SCServerOptions, listeningListener: js.Function0[Unit]): SCServer = js.native
}

