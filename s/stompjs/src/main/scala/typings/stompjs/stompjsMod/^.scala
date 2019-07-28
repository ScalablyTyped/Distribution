package typings.stompjs.stompjsMod

import typings.node.NodeJSNs.Timer
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearInterval(id: Timer): Unit = js.native
  def client(url: String): Client = js.native
  def client(url: String, protocols: String): Client = js.native
  def client(url: String, protocols: js.Array[String]): Client = js.native
  def over(ws: WebSocket): Client = js.native
  def overTCP(host: String, port: Double): Client = js.native
  def overWS(url: String): Client = js.native
  def setInterval(interval: Double, f: js.Function1[/* repeated */ js.Any, Unit]): Timer = js.native
}

