package typings.ssh2.mod

import typings.node.netMod.Socket
import typings.ssh2.ssh2Strings.connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssh2", "Server")
@js.native
open class Server protected ()
  extends typings.node.netMod.Server {
  def this(cfg: ServerConfig) = this()
  def this(cfg: ServerConfig, listener: ServerConnectionListener) = this()
  
  def injectSocket(socket: Socket): Unit = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: ServerConnectionListener): this.type = js.native
}
/* static members */
object Server {
  
  @JSImport("ssh2", "Server")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ssh2", "Server.KEEPALIVE_CLIENT_COUNT_MAX")
  @js.native
  def KEEPALIVE_CLIENT_COUNT_MAX: Double = js.native
  inline def KEEPALIVE_CLIENT_COUNT_MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE_CLIENT_COUNT_MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("ssh2", "Server.KEEPALIVE_CLIENT_INTERVAL")
  @js.native
  def KEEPALIVE_CLIENT_INTERVAL: Double = js.native
  inline def KEEPALIVE_CLIENT_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEEPALIVE_CLIENT_INTERVAL")(x.asInstanceOf[js.Any])
}
