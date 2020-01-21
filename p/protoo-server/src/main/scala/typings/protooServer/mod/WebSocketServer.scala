package typings.protooServer.mod

import typings.node.httpMod.Server
import typings.protooServer.protooServerStrings.connectionrequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoo-server", "WebSocketServer")
@js.native
class WebSocketServer protected () extends js.Object {
  def this(server: Server) = this()
  def this(server: typings.node.httpsMod.Server) = this()
  def this(server: Server, options: WebSocketServerOptions) = this()
  def this(server: typings.node.httpsMod.Server, options: WebSocketServerOptions) = this()
  @JSName("on")
  def on_connectionrequest(eventType: connectionrequest, callback: ConnectionRequestCb): Unit = js.native
  def stop(): Unit = js.native
}

