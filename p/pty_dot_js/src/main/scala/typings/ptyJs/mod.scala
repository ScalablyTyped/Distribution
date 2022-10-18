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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pty.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pty.js", "Terminal")
  @js.native
  /**
    * Creates a new pseudo-terminal, spawns a child process, and associates it with the slave
    * end of the pseudo-terminal.
    */
  open class Terminal () extends StObject {
    def this(file: String) = this()
    def this(file: String, args: js.Array[String]) = this()
    def this(file: Unit, args: js.Array[String]) = this()
    def this(file: String, args: js.Array[String], opt: TerminalOptions) = this()
    def this(file: String, args: Unit, opt: TerminalOptions) = this()
    def this(file: Unit, args: js.Array[String], opt: TerminalOptions) = this()
    def this(file: Unit, args: Unit, opt: TerminalOptions) = this()
    
    // NodeJS EventEmitter interface
    def addListener(event: String, listener: js.Function): this.type = js.native
    
    /** Read-only number of columns in the terminal. */
    var cols: Double = js.native
    
    /**
      * Closes the master end of the pseudo-terminal, and attempts to kill the spawned process
      * associated with the slave end of the pseudo-terminal (but only if [[pid]] is not null).
      */
    def destroy(): Unit = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    
    def end(data: Any): Unit = js.native
    
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
    def resize(cols: Double): Unit = js.native
    def resize(cols: Double, rows: Double): Unit = js.native
    def resize(cols: Unit, rows: Double): Unit = js.native
    
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
    def write(data: Any): Boolean = js.native
  }
  
  inline def createTerminal(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")().asInstanceOf[Terminal]
  inline def createTerminal(file: String): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def createTerminal(file: String, args: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(file: String, args: Unit, opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(file: Unit, args: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(file: Unit, args: js.Array[String], opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(file: Unit, args: Unit, opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  
  inline def fork(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")().asInstanceOf[Terminal]
  inline def fork(file: String): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def fork(file: String, args: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def fork(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def fork(file: String, args: Unit, opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def fork(file: Unit, args: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def fork(file: Unit, args: js.Array[String], opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def fork(file: Unit, args: Unit, opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  
  object native {
    
    @JSImport("pty.js", "native")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fork(file: String, args: js.Array[String], env: Any, cwd: String, cols: Double, rows: Double): Fd = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], env.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[Fd]
    inline def fork(
      file: String,
      args: js.Array[String],
      env: Any,
      cwd: String,
      cols: Double,
      rows: Double,
      uid: Double
    ): Fd = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], env.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], uid.asInstanceOf[js.Any])).asInstanceOf[Fd]
    inline def fork(
      file: String,
      args: js.Array[String],
      env: Any,
      cwd: String,
      cols: Double,
      rows: Double,
      uid: Double,
      gid: Double
    ): Fd = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], env.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Fd]
    inline def fork(
      file: String,
      args: js.Array[String],
      env: Any,
      cwd: String,
      cols: Double,
      rows: Double,
      uid: Unit,
      gid: Double
    ): Fd = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], env.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Fd]
    
    inline def kill(pid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def open(cols: Double, rows: Double): Master = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[Master]
    inline def open(dataPipe: String, cols: Double, rows: Double, debug: Boolean): Pid = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(dataPipe.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Pid]
    
    inline def process(fd: Double, tty: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(fd.asInstanceOf[js.Any], tty.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resize(fd: Double, cols: Double, rows: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(fd.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def startProcess(pid: Double, file: String, cmdline: String, env: js.Array[String], cwd: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startProcess")(pid.asInstanceOf[js.Any], file.asInstanceOf[js.Any], cmdline.asInstanceOf[js.Any], env.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def open(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Terminal]
  inline def open(opt: Cols): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(opt.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  
  inline def spawn(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")().asInstanceOf[Terminal]
  inline def spawn(file: String): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def spawn(file: String, args: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def spawn(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def spawn(file: String, args: Unit, opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def spawn(file: Unit, args: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def spawn(file: Unit, args: js.Array[String], opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def spawn(file: Unit, args: Unit, opt: TerminalOptions): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  
  /** Options that can be used when creating a new pseudo-terminal. */
  trait TerminalOptions extends StObject {
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[Any] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
  }
  object TerminalOptions {
    
    inline def apply(): TerminalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminalOptions]
    }
    
    extension [Self <: TerminalOptions](x: Self) {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
