package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecOutputReturnValue extends StObject {
  
  /** The process exit code. */
  var code: Double
  
  /** The process standard error output. */
  var stderr: String
  
  /** The process standard output. */
  var stdout: String
}
object ExecOutputReturnValue {
  
  inline def apply(code: Double, stderr: String, stdout: String): ExecOutputReturnValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOutputReturnValue]
  }
  
  extension [Self <: ExecOutputReturnValue](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
