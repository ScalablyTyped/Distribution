package typings.pythonShell

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("python-shell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("python-shell", "PythonShell")
  @js.native
  class PythonShell protected () extends EventEmitter {
    def this(scriptName: String) = this()
    def this(scriptName: String, options: InstanceOptions) = this()
    
    var defaultOptions: RunOptions = js.native
    
    def end(callback: js.Function1[/* message */ String, Unit]): Unit = js.native
    
    def send(message: String): Unit = js.native
    def send(message: js.Any): Unit = js.native
  }
  
  @scala.inline
  def run(
    scriptName: String,
    RunOptions: RunOptions,
    callback: js.Function2[/* err */ Error, /* results */ js.UndefOr[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(scriptName.asInstanceOf[js.Any], RunOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def run(
    scriptName: String,
    callback: js.Function2[/* err */ Error, /* results */ js.UndefOr[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(scriptName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait InstanceOptions extends StObject {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var childProcess: js.UndefOr[String] = js.undefined
    
    var command: js.UndefOr[String] = js.undefined
    
    var exitCode: js.UndefOr[js.Any] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
    
    var stderr: js.UndefOr[js.Any] = js.undefined
    
    var stdin: js.UndefOr[js.Any] = js.undefined
    
    var stdout: js.UndefOr[js.Any] = js.undefined
    
    var terminated: js.UndefOr[js.Any] = js.undefined
  }
  object InstanceOptions {
    
    @scala.inline
    def apply(): InstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceOptions]
    }
    
    @scala.inline
    implicit class InstanceOptionsMutableBuilder[Self <: InstanceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setChildProcess(value: String): Self = StObject.set(x, "childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildProcessUndefined: Self = StObject.set(x, "childProcess", js.undefined)
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setExitCode(value: js.Any): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setStderr(value: js.Any): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(value: js.Any): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: js.Any): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setTerminated(value: js.Any): Self = StObject.set(x, "terminated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminatedUndefined: Self = StObject.set(x, "terminated", js.undefined)
    }
  }
  
  trait RunOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var formatter: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var parser: js.UndefOr[String] = js.undefined
    
    var pythonOptions: js.UndefOr[js.Array[String]] = js.undefined
    
    var pythonPath: js.UndefOr[String] = js.undefined
    
    var scriptPath: js.UndefOr[String] = js.undefined
  }
  object RunOptions {
    
    @scala.inline
    def apply(): RunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunOptions]
    }
    
    @scala.inline
    implicit class RunOptionsMutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFormatter(value: String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setParser(value: String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPythonOptions(value: js.Array[String]): Self = StObject.set(x, "pythonOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPythonOptionsUndefined: Self = StObject.set(x, "pythonOptions", js.undefined)
      
      @scala.inline
      def setPythonOptionsVarargs(value: String*): Self = StObject.set(x, "pythonOptions", js.Array(value :_*))
      
      @scala.inline
      def setPythonPath(value: String): Self = StObject.set(x, "pythonPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPythonPathUndefined: Self = StObject.set(x, "pythonPath", js.undefined)
      
      @scala.inline
      def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
    }
  }
}
