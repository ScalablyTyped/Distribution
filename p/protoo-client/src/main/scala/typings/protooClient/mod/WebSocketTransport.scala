package typings.protooClient.mod

import typings.protooClient.anon.ClientConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoo-client", "WebSocketTransport")
@js.native
class WebSocketTransport protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, options: ClientConfig) = this()
  val closed: Boolean = js.native
  def close(): Unit = js.native
  def send(message: js.Any): js.Promise[Unit] = js.native
}

