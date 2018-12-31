package typings
package ptyDotJsLib.ptyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", "Terminal")
@js.native
/**
  * Creates a new pseudo-terminal, spawns a child process, and associates it with the slave
  * end of the pseudo-terminal.
  */
class Terminal () extends js.Object {
  def this(file: java.lang.String) = this()
  def this(file: java.lang.String, args: js.Array[java.lang.String]) = this()
  def this(file: java.lang.String, args: js.Array[java.lang.String], opt: TerminalOptions) = this()
  /** Read-only number of columns in the terminal. */
  var cols: scala.Double = js.native
  /** Read-only file descriptor of the master end of the pseudo-terminal. */
  var fd: scala.Double = js.native
  /** Read-only filename of the executable associated with the slave end of the pseudo-terminal. */
  var file: java.lang.String = js.native
  /** Read-only name of the terminal. */
  var name: java.lang.String = js.native
  /**
    * Read-only identifier of the spawned process associated with the slave end of the
    * pseudo-terminal. This will be null if the terminal was created via [[Terminal.open]].
    */
  var pid: scala.Double = js.native
  /** Read-only name of the process associated with the slave end of the pseudo-terminal. */
  var process: java.lang.String = js.native
  /** Read-only name of the slave end of the pseudo-terminal. */
  var pty: java.lang.String = js.native
  /** Read-only number of rows in the terminal. */
  var rows: scala.Double = js.native
  var socket: nodeLib.netMod.Socket = js.native
  /** Note that an exception will be thrown if an attempt is made to access this property. */
  var stderr: Terminal = js.native
  var stdin: Terminal = js.native
  var stdout: Terminal = js.native
  // NodeJS EventEmitter interface
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /**
    * Closes the master end of the pseudo-terminal, and attempts to kill the spawned process
    * associated with the slave end of the pseudo-terminal (but only if [[pid]] is not null).
    */
  def destroy(): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def end(data: js.Any): scala.Unit = js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  /**
    * Sends a signal to the spawned process associated with the slave end of the
    * pseudo-terminal (this only works if [[pid]] is not null).
    */
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def pause(): scala.Unit = js.native
  // NodeJS Stream interface
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: ptyDotJsLib.Anon_End): T = js.native
  def redraw(): scala.Unit = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: java.lang.String): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def resize(): scala.Unit = js.native
  def resize(cols: scala.Double): scala.Unit = js.native
  def resize(cols: scala.Double, rows: scala.Double): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  // NodeJS Socket-like interface (wrappers for this.socket)
  def write(data: js.Any): scala.Boolean = js.native
}

