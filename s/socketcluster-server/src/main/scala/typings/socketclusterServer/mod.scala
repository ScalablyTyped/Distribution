package typings.socketclusterServer

import typings.node.httpMod.Server
import typings.socketclusterServer.scserverMod.SCServerOptions
import typings.socketclusterServer.scserverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SCServer () extends ^ {
    def this(options: SCServerOptions) = this()
  }
  
  @js.native
  class SCServerSocket protected ()
    extends typings.socketclusterServer.scserversocketMod.^ {
    def this(id: String, server: ^, socket: typings.ws.mod.^) = this()
  }
  
  def attach(server: Server): SCServer = js.native
  def attach(server: Server, options: SCServerOptions): SCServer = js.native
  def listen(): SCServer = js.native
  def listen(port: Double): SCServer = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): SCServer = js.native
  def listen(port: Double, options: SCServerOptions): SCServer = js.native
  def listen(port: Double, options: SCServerOptions, listeningListener: js.Function0[Unit]): SCServer = js.native
}

