package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerChannel extends Channel {
  /** Indicates whether this is a server or client channel. */
  @JSName("server")
  var server_ServerChannel: ssh2Lib.ssh2LibNumbers.`true` = js.native
  /** Standard error for the Channel. */
  @JSName("stderr")
  var stderr_ServerChannel: nodeLib.streamMod.Writable = js.native
  /**
       * Sends an exit status code to the client.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def exit(exitCode: scala.Double): scala.Boolean = js.native
  /**
       * Sends an exit signal to the client.
       *
       * Returns `false` if you should wait for the `continue` event before sending any more traffic.
       */
  def exit(name: java.lang.String, coreDumped: scala.Boolean, msg: java.lang.String): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
       * Emitted once the channel is completely closed on both the client and the server.
       */
  @JSName("on")
  def on_close(event: ssh2Lib.ssh2LibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
}

