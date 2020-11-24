package typings.ptyJs.mod

import typings.node.NodeJS.WritableStream
import typings.node.netMod.Socket
import typings.ptyJs.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pty.js", "Terminal")
@js.native
/**
  * Creates a new pseudo-terminal, spawns a child process, and associates it with the slave
  * end of the pseudo-terminal.
  */
class Terminal () extends js.Object {
  def this(file: String) = this()
  def this(file: js.UndefOr[scala.Nothing], args: js.Array[String]) = this()
  def this(file: String, args: js.Array[String]) = this()
  def this(file: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], opt: TerminalOptions) = this()
  def this(file: js.UndefOr[scala.Nothing], args: js.Array[String], opt: TerminalOptions) = this()
  def this(file: String, args: js.UndefOr[scala.Nothing], opt: TerminalOptions) = this()
  def this(file: String, args: js.Array[String], opt: TerminalOptions) = this()
  
  // NodeJS EventEmitter interface
  def addListener(event: String, listener: js.Function): this.type = js.native
  
  /** Read-only number of columns in the terminal. */
  var cols: Double = js.native
  
  /**
    * Closes the master end of the pseudo-terminal, and attempts to kill the spawned process
    * associated with the slave end of the pseudo-terminal (but only if [[pid]] is not null).
    */
  def destroy(): Unit = js.native
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  
  def end(data: js.Any): Unit = js.native
  
  def eventNames(): js.Array[String] = js.native
  
  /** Read-only file descriptor of the master end of the pseudo-terminal. */
  var fd: Double = js.native
  
  /** Read-only filename of the executable associated with the slave end of the pseudo-terminal. */
  var file: String = js.native
  
  /**
    * Sends a signal to the spawned process associated with the slave end of the
    * pseudo-terminal (this only works if [[pid]] is not null).
    */
  def kill(): Unit = js.native
  def kill(signal: String): Unit = js.native
  
  def listeners(event: String): js.Array[js.Function] = js.native
  
  /** Read-only name of the terminal. */
  var name: String = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  
  def pause(): Unit = js.native
  
  /**
    * Read-only identifier of the spawned process associated with the slave end of the
    * pseudo-terminal. This will be null if the terminal was created via [[Terminal.open]].
    */
  var pid: Double = js.native
  
  // NodeJS Stream interface
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  /** Read-only name of the process associated with the slave end of the pseudo-terminal. */
  var process: String = js.native
  
  /** Read-only name of the slave end of the pseudo-terminal. */
  var pty: String = js.native
  
  def redraw(): Unit = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  
  def removeListener(event: String, listener: js.Function): this.type = js.native
  
  def resize(): Unit = js.native
  def resize(cols: js.UndefOr[scala.Nothing], rows: Double): Unit = js.native
  def resize(cols: Double): Unit = js.native
  def resize(cols: Double, rows: Double): Unit = js.native
  
  def resume(): Unit = js.native
  
  /** Read-only number of rows in the terminal. */
  var rows: Double = js.native
  
  def setEncoding(encoding: String): Unit = js.native
  
  var socket: Socket = js.native
  
  /** Note that an exception will be thrown if an attempt is made to access this property. */
  var stderr: Terminal = js.native
  
  var stdin: Terminal = js.native
  
  var stdout: Terminal = js.native
  
  // NodeJS Socket-like interface (wrappers for this.socket)
  def write(data: js.Any): Boolean = js.native
}
