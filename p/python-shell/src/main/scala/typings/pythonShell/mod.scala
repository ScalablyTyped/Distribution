package typings.pythonShell

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.PromiseWithChild
import typings.node.childProcessMod.SpawnOptions
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Signals
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.Writable
import typings.pythonShell.anon.Json
import typings.pythonShell.anon.Stderr
import typings.pythonShell.anon.Text
import typings.pythonShell.pythonShellStrings.binary
import typings.pythonShell.pythonShellStrings.close
import typings.pythonShell.pythonShellStrings.error
import typings.pythonShell.pythonShellStrings.json
import typings.pythonShell.pythonShellStrings.message
import typings.pythonShell.pythonShellStrings.pythonError
import typings.pythonShell.pythonShellStrings.stderr
import typings.pythonShell.pythonShellStrings.text
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("python-shell", "NewlineTransformer")
  @js.native
  open class NewlineTransformer () extends Transform {
    def this(opts: TransformOptions) = this()
    
    /* private */ var _lastLineData: Any = js.native
    
    def _transform(chunk: Any, encoding: String, callback: TransformCallback): Unit = js.native
  }
  
  @JSImport("python-shell", "PythonShell")
  @js.native
  open class PythonShell protected () extends EventEmitter {
    /**
      * spawns a python process
      * @param scriptPath path to script. Relative to current directory or options.scriptFolder if specified
      * @param options
      * @param stdoutSplitter Optional. Splits stdout into chunks, defaulting to splitting into newline-seperated lines
      * @param stderrSplitter Optional. splits stderr into chunks, defaulting to splitting into newline-seperated lines
      */
    def this(scriptPath: String) = this()
    def this(scriptPath: String, options: Options) = this()
    def this(scriptPath: String, options: Unit, stdoutSplitter: Transform) = this()
    def this(scriptPath: String, options: Options, stdoutSplitter: Transform) = this()
    def this(scriptPath: String, options: Unit, stdoutSplitter: Unit, stderrSplitter: Transform) = this()
    def this(scriptPath: String, options: Unit, stdoutSplitter: Transform, stderrSplitter: Transform) = this()
    def this(scriptPath: String, options: Options, stdoutSplitter: Unit, stderrSplitter: Transform) = this()
    def this(scriptPath: String, options: Options, stdoutSplitter: Transform, stderrSplitter: Transform) = this()
    
    /* private */ var _endCallback: Any = js.native
    
    /* private */ var _remaining: Any = js.native
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ ErrnoException, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pythonError(event: pythonError, listener: js.Function1[/* error */ PythonShellError, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_stderr(event: stderr, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    
    var childProcess: ChildProcess = js.native
    
    var command: js.Array[String] = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: ErrnoException): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, parsedChunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_pythonError(event: pythonError, error: PythonShellError): Boolean = js.native
    @JSName("emit")
    def emit_stderr(event: stderr, parsedChunk: Any): Boolean = js.native
    
    /**
      * Closes the stdin stream. Unless python is listening for stdin in a loop
      * this should cause the process to finish its work and close.
      * @returns {PythonShell} The same instance for chaining calls
      */
    def end(
      callback: js.Function3[/* err */ PythonShellError, /* exitCode */ Double, /* exitSignal */ String, Any]
    ): this.type = js.native
    
    var exitCode: Double = js.native
    
    var exitSignal: String = js.native
    
    def formatter(param: String): Any = js.native
    def formatter(param: js.Object): Any = js.native
    
    /**
      * Sends a kill signal to the process
      * @returns {PythonShell} The same instance for chaining calls
      */
    def kill(): this.type = js.native
    def kill(signal: Signals): this.type = js.native
    
    var mode: String = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ ErrnoException, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_pythonError(event: pythonError, listener: js.Function1[/* error */ PythonShellError, Unit]): this.type = js.native
    @JSName("on")
    def on_stderr(event: stderr, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ ErrnoException, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_pythonError(event: pythonError, listener: js.Function1[/* error */ PythonShellError, Unit]): this.type = js.native
    @JSName("once")
    def once_stderr(event: stderr, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    
    /**
      * Parses an error thrown from the Python process through stderr
      * @param  {string|Buffer} data The stderr contents to parse
      * @return {Error} The parsed error with extended stack trace when traceback is available
      */
    /* private */ var parseError: Any = js.native
    
    def parser(param: String): Any = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ ErrnoException, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pythonError(event: pythonError, listener: js.Function1[/* error */ PythonShellError, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_stderr(event: stderr, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ ErrnoException, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pythonError(event: pythonError, listener: js.Function1[/* error */ PythonShellError, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_stderr(event: stderr, listener: js.Function1[/* parsedChunk */ Any, Unit]): this.type = js.native
    
    var scriptPath: String = js.native
    
    /**
      * Sends a message to the Python shell through stdin
      * Override this method to format data to be sent to the Python process
      * @returns {PythonShell} The same instance for chaining calls
      */
    def send(message: String): this.type = js.native
    def send(message: js.Object): this.type = js.native
    
    var stderr: Readable = js.native
    
    /* private */ var stderrHasEnded: Any = js.native
    
    def stderrParser(param: String): Any = js.native
    
    var stdin: Writable = js.native
    
    var stdout: Readable = js.native
    
    /* private */ var stdoutHasEnded: Any = js.native
    
    /**
      * Alias for kill.
      * @deprecated
      */
    def terminate(): this.type = js.native
    def terminate(signal: Signals): this.type = js.native
    
    var terminated: Boolean = js.native
  }
  /* static members */
  object PythonShell {
    
    @JSImport("python-shell", "PythonShell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * checks syntax without executing code
      * @returns rejects promise w/ string error output if syntax failure
      */
    inline def checkSyntax(code: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSyntax")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
    
    /**
      * checks syntax without executing code
      * @returns {Promise} rejects w/ stderr if syntax failure
      */
    inline def checkSyntaxFile(filePath: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSyntaxFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
    
    @JSImport("python-shell", "PythonShell.defaultOptions")
    @js.native
    def defaultOptions: Options = js.native
    inline def defaultOptions_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("python-shell", "PythonShell.defaultPythonPath")
    @js.native
    def defaultPythonPath: String = js.native
    inline def defaultPythonPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPythonPath")(x.asInstanceOf[js.Any])
    
    @JSImport("python-shell", "PythonShell.format")
    @js.native
    def format: Json = js.native
    inline def format_=(x: Json): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    inline def getPythonPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPythonPath")().asInstanceOf[String]
    
    inline def getVersion(): PromiseWithChild[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[PromiseWithChild[Stderr]]
    inline def getVersion(pythonPath: String): PromiseWithChild[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(pythonPath.asInstanceOf[js.Any]).asInstanceOf[PromiseWithChild[Stderr]]
    
    inline def getVersionSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionSync")().asInstanceOf[String]
    inline def getVersionSync(pythonPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionSync")(pythonPath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("python-shell", "PythonShell.parse")
    @js.native
    def parse: Text = js.native
    inline def parse_=(x: Text): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    /**
      * Runs a Python script and returns collected messages as a promise.
      * If the promise is rejected, the err will probably be of type PythonShellErrorWithLogs
      * @param scriptPath   The path to the script to execute
      * @param options  The execution options
      */
    inline def run(scriptPath: String): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(scriptPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def run(scriptPath: String, options: Options): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(scriptPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    
    /**
      * Runs the inputted string of python code and returns collected messages as a promise. DO NOT ALLOW UNTRUSTED USER INPUT HERE!
      * @param code   The python code to execute
      * @param options  The execution options
      * @return a promise with the output from the python script
      */
    inline def runString(code: String): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("runString")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def runString(code: String, options: Options): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runString")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  }
  
  @JSImport("python-shell", "PythonShellError")
  @js.native
  open class PythonShellError ()
    extends StObject
       with Error {
    
    var exitCode: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var traceback: String | Buffer = js.native
  }
  
  @JSImport("python-shell", "PythonShellErrorWithLogs")
  @js.native
  open class PythonShellErrorWithLogs () extends PythonShellError {
    
    var logs: js.Array[Any] = js.native
  }
  
  trait Options
    extends StObject
       with SpawnOptions {
    
    /**
      * arguments to your program
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var formatter: js.UndefOr[String | (js.Function1[/* param */ String, Any])] = js.undefined
    
    /**
      * if binary is enabled message and stderr events will not be emitted
      */
    var mode: js.UndefOr[text | json | binary] = js.undefined
    
    var parser: js.UndefOr[String | (js.Function1[/* param */ String, Any])] = js.undefined
    
    /**
      * see https://docs.python.org/3.7/using/cmdline.html
      */
    var pythonOptions: js.UndefOr[js.Array[String]] = js.undefined
    
    var pythonPath: js.UndefOr[String] = js.undefined
    
    /**
      * overrides scriptPath passed into PythonShell constructor
      */
    var scriptPath: js.UndefOr[String] = js.undefined
    
    var stderrParser: js.UndefOr[String | (js.Function1[/* param */ String, Any])] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFormatter(value: String | (js.Function1[/* param */ String, Any])): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction1(value: /* param */ String => Any): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setMode(value: text | json | binary): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setParser(value: String | (js.Function1[/* param */ String, Any])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction1(value: /* param */ String => Any): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPythonOptions(value: js.Array[String]): Self = StObject.set(x, "pythonOptions", value.asInstanceOf[js.Any])
      
      inline def setPythonOptionsUndefined: Self = StObject.set(x, "pythonOptions", js.undefined)
      
      inline def setPythonOptionsVarargs(value: String*): Self = StObject.set(x, "pythonOptions", js.Array(value*))
      
      inline def setPythonPath(value: String): Self = StObject.set(x, "pythonPath", value.asInstanceOf[js.Any])
      
      inline def setPythonPathUndefined: Self = StObject.set(x, "pythonPath", js.undefined)
      
      inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
      
      inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
      
      inline def setStderrParser(value: String | (js.Function1[/* param */ String, Any])): Self = StObject.set(x, "stderrParser", value.asInstanceOf[js.Any])
      
      inline def setStderrParserFunction1(value: /* param */ String => Any): Self = StObject.set(x, "stderrParser", js.Any.fromFunction1(value))
      
      inline def setStderrParserUndefined: Self = StObject.set(x, "stderrParser", js.undefined)
    }
  }
}
