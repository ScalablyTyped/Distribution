package typings.ssh2.mod

import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.ssh2.ssh2Strings.close_
import typings.ssh2.ssh2Strings.end
import typings.ssh2.ssh2Strings.eof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends Duplex {
  
  /**
    * Closes the channel on both sides.
    */
  def close(args: Any*): Unit = js.native
  
  /**
    * Shuts down the channel on this side.
    */
  def destroy(): this.type = js.native
  
  /**
    * Sends EOF to the remote side.
    */
  def eof(): Unit = js.native
  
  def exit(signalName: String): Unit = js.native
  def exit(signalName: String, coreDumped: Boolean): Unit = js.native
  def exit(signalName: String, coreDumped: Boolean, msg: String): Unit = js.native
  def exit(signalName: String, coreDumped: Unit, msg: String): Unit = js.native
  def exit(status: Double): Unit = js.native
  
  var incoming: Any = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted once the channel is completely closed on both the client and the server.
    */
  @JSName("on")
  def on_close(event: close_, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_eof(event: eof, listener: js.Function0[Unit]): this.type = js.native
  
  var outgoing: Any = js.native
  
  /** Indicates whether this is a server or client channel. */
  var server: Boolean = js.native
  
  /**
    * Session type-specific methods
    */
  def setWindow(rows: String, cols: String, height: String, width: String): Unit = js.native
  
  def signal(signalName: String): Unit = js.native
  
  /** Standard error for the Channel. */
  var stderr: Writable | Readable = js.native
  
  /** Standard input for the Channel. */
  var stdin: this.type = js.native
  
  /** Standard output for the Channel. */
  var stdout: this.type = js.native
  
  /** The channel subtype, usually "exec", "shell", or undefined. */
  var subtype: js.UndefOr[ChannelSubType] = js.native
  
  /** The channel type, usually "session". */
  var `type`: ChannelType = js.native
}
