package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CliInitOptions extends StObject {
  
  var args: js.Array[String]
  
  var logger: Logger
  
  var sys: CompilerSystem
}
object CliInitOptions {
  
  inline def apply(args: js.Array[String], logger: Logger, sys: CompilerSystem): CliInitOptions = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliInitOptions]
  }
  
  extension [Self <: CliInitOptions](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setSys(value: CompilerSystem): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
  }
}
