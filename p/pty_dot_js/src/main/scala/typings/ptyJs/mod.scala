package typings.ptyJs

import typings.node.NodeJS.WritableStream
import typings.node.netMod.Socket
import typings.ptyJs.anon.Cols
import typings.ptyJs.anon.End
import typings.ptyJs.anon.Fd
import typings.ptyJs.anon.Master
import typings.ptyJs.anon.Pid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pty.js", "Terminal")
  @js.native
  /**
    * Creates a new pseudo-terminal, spawns a child process, and associates it with the slave
    * end of the pseudo-terminal.
    */
  class Terminal () extends StObject {
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
  
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: js.UndefOr[scala.Nothing], args: js.Array[String]): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: js.UndefOr[scala.Nothing], args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: String): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: String, args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: String, args: js.Array[String]): Terminal = js.native
  @JSImport("pty.js", "createTerminal")
  @js.native
  def createTerminal(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  
  @JSImport("pty.js", "fork")
  @js.native
  def fork(): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: js.UndefOr[scala.Nothing], args: js.Array[String]): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: js.UndefOr[scala.Nothing], args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: String): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: String, args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: String, args: js.Array[String]): Terminal = js.native
  @JSImport("pty.js", "fork")
  @js.native
  def fork(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  
  object native {
    
    @JSImport("pty.js", "native.fork")
    @js.native
    def fork(file: String, args: js.Array[String], env: js.Any, cwd: String, cols: Double, rows: Double): Fd = js.native
    @JSImport("pty.js", "native.fork")
    @js.native
    def fork(
      file: String,
      args: js.Array[String],
      env: js.Any,
      cwd: String,
      cols: Double,
      rows: Double,
      uid: js.UndefOr[scala.Nothing],
      gid: Double
    ): Fd = js.native
    @JSImport("pty.js", "native.fork")
    @js.native
    def fork(
      file: String,
      args: js.Array[String],
      env: js.Any,
      cwd: String,
      cols: Double,
      rows: Double,
      uid: Double
    ): Fd = js.native
    @JSImport("pty.js", "native.fork")
    @js.native
    def fork(
      file: String,
      args: js.Array[String],
      env: js.Any,
      cwd: String,
      cols: Double,
      rows: Double,
      uid: Double,
      gid: Double
    ): Fd = js.native
    
    @JSImport("pty.js", "native.kill")
    @js.native
    def kill(pid: Double): Unit = js.native
    
    @JSImport("pty.js", "native.open")
    @js.native
    def open(cols: Double, rows: Double): Master = js.native
    @JSImport("pty.js", "native.open")
    @js.native
    def open(dataPipe: String, cols: Double, rows: Double, debug: Boolean): Pid = js.native
    
    @JSImport("pty.js", "native.process")
    @js.native
    def process(fd: Double, tty: String): String = js.native
    
    @JSImport("pty.js", "native.resize")
    @js.native
    def resize(fd: Double, cols: Double, rows: Double): Unit = js.native
    
    @JSImport("pty.js", "native.startProcess")
    @js.native
    def startProcess(pid: Double, file: String, cmdline: String, env: js.Array[String], cwd: String): Unit = js.native
  }
  
  @JSImport("pty.js", "open")
  @js.native
  def open(): Terminal = js.native
  @JSImport("pty.js", "open")
  @js.native
  def open(opt: Cols): Terminal = js.native
  
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: js.UndefOr[scala.Nothing], args: js.Array[String]): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: js.UndefOr[scala.Nothing], args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: String): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: String, args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: String, args: js.Array[String]): Terminal = js.native
  @JSImport("pty.js", "spawn")
  @js.native
  def spawn(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  
  /** Options that can be used when creating a new pseudo-terminal. */
  @js.native
  trait TerminalOptions extends StObject {
    
    var cols: js.UndefOr[Double] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[js.Any] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var uid: js.UndefOr[Double] = js.native
  }
  object TerminalOptions {
    
    @scala.inline
    def apply(): TerminalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminalOptions]
    }
    
    @scala.inline
    implicit class TerminalOptionsMutableBuilder[Self <: TerminalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
