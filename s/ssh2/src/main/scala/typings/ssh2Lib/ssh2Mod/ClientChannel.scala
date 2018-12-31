package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientChannel extends Channel {
  /** Indicates whether this is a server or client channel. */
  @JSName("server")
  var server_ClientChannel: ssh2Lib.ssh2LibNumbers.`false` = js.native
  /** Standard error for the Channel. */
  @JSName("stderr")
  var stderr_ClientChannel: nodeLib.streamMod.Readable = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted once the channel is completely closed on both the client and the server.
    */
  @JSName("on")
  def on_close(event: ssh2Lib.ssh2LibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * An `exit` event *may* (the SSH2 spec says it is optional) be emitted when the process
    * finishes. If the process finished normally, the process's return value is passed to
    * the `exit` callback.
    */
  @JSName("on")
  def on_exit(
    event: ssh2Lib.ssh2LibStrings.exit,
    listener: js.Function4[
      /* exitCode */ scala.Double | scala.Null, 
      /* signalName */ js.UndefOr[java.lang.String], 
      /* didCoreDump */ js.UndefOr[scala.Boolean], 
      /* description */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Lets the server know that the local terminal window has been resized.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def setWindow(rows: scala.Double, cols: scala.Double, height: scala.Double, width: scala.Double): scala.Boolean = js.native
  /**
    * Sends a POSIX signal to the current process on the server. Valid signal names are:
    * 'ABRT', 'ALRM', 'FPE', 'HUP', 'ILL', 'INT', 'KILL', 'PIPE', 'QUIT', 'SEGV', 'TERM',
    * 'USR1', and 'USR2'.
    *
    * Some server implementations may ignore this request if they do not support signals.
    *
    * Note: If you are trying to send SIGINT and you find `signal()` doesn't work, try writing
    * `'\x03'` to the Channel stream instead.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def signal(signalName: java.lang.String): scala.Boolean = js.native
}

