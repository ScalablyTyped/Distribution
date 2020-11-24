package typings.protooClient.mod

import typings.protooClient.anon.ClientConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protoo-client", "WebSocketTransport")
@js.native
class WebSocketTransport protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, options: ClientConfig) = this()
  
  def close(): Unit = js.native
  
  val closed: Boolean = js.native
  
  def send(message: js.Any): js.Promise[Unit] = js.native
}
