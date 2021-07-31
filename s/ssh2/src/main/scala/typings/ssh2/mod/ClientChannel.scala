package typings.ssh2.mod

import typings.node.streamMod.Readable
import typings.ssh2.ssh2Booleans.`false`
import typings.ssh2.ssh2Strings.close
import typings.ssh2.ssh2Strings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientChannel extends Channel {
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted once the channel is completely closed on both the client and the server.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * An `exit` event *may* (the SSH2 spec says it is optional) be emitted when the process
    * finishes. If the process finished normally, the process's return value is passed to
    * the `exit` callback.
    */
  @JSName("on")
  def on_exit(
    event: exit,
    listener: js.Function4[
      /* exitCode */ Double | Null, 
      /* signalName */ js.UndefOr[String], 
      /* didCoreDump */ js.UndefOr[Boolean], 
      /* description */ js.UndefOr[String], 
      Unit
    ]
  ): this.type = js.native
  
  /** Indicates whether this is a server or client channel. */
  @JSName("server")
  var server_ClientChannel: `false` = js.native
  
  /**
    * Lets the server know that the local terminal window has been resized.
    *
    * Returns `false` if you should wait for the `continue` event before sending any more traffic.
    */
  def setWindow(rows: Double, cols: Double, height: Double, width: Double): Boolean = js.native
  
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
  def signal(signalName: String): Boolean = js.native
  
  /** Standard error for the Channel. */
  @JSName("stderr")
  var stderr_ClientChannel: Readable = js.native
}
