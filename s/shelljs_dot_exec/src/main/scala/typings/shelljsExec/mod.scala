package typings.shelljsExec

import typings.node.childProcessMod.ExecSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cmd: String): ShellJsExecResponse = ^.asInstanceOf[js.Dynamic].apply(cmd.asInstanceOf[js.Any]).asInstanceOf[ShellJsExecResponse]
  inline def apply(cmd: String, options: ExecSyncOptions & ShellJsOptions): ShellJsExecResponse = (^.asInstanceOf[js.Dynamic].apply(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShellJsExecResponse]
  
  @JSImport("shelljs.exec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ShellJsExecEnrich extends StObject {
    
    var code: Double
    
    var error: Any
    
    var ok: Boolean
    
    var stderr: String
    
    var stdout: String
  }
  object ShellJsExecEnrich {
    
    inline def apply(code: Double, error: Any, ok: Boolean, stderr: String, stdout: String): ShellJsExecEnrich = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellJsExecEnrich]
    }
    
    extension [Self <: ShellJsExecEnrich](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShellJsExecResponse
    extends StObject
       with ExecSyncOptions
       with ShellJsExecEnrich
  object ShellJsExecResponse {
    
    inline def apply(code: Double, error: Any, ok: Boolean, stderr: String, stdout: String): ShellJsExecResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellJsExecResponse]
    }
  }
  
  trait ShellJsOptions extends StObject {
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object ShellJsOptions {
    
    inline def apply(): ShellJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellJsOptions]
    }
    
    extension [Self <: ShellJsOptions](x: Self) {
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
