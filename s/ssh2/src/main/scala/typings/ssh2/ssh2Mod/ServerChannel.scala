package typings.ssh2.ssh2Mod

import typings.node.streamMod.Writable
import typings.ssh2.ssh2Booleans.`true`
import typings.ssh2.ssh2Strings.close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerChannel extends Channel {
  /** Indicates whether this is a server or client channel. */
  @JSName("server")
  var server_ServerChannel: `true` = js.native
  /** Standard error for the Channel. */
  @JSName("stderr")
  var stderr_ServerChannel: Writable = js.native
  /**
    * Sends an exit status code to the client.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exit(exitCode: Double): Boolean = js.native
  /**
    * Sends an exit signal to the client.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def exit(name: String, coreDumped: Boolean, msg: String): Boolean = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted once the channel is completely closed on both the client and the server.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
}

