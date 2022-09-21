package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeJsOutput extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var output: String
  
  var sourceMap: Any
}
object OptimizeJsOutput {
  
  inline def apply(diagnostics: js.Array[Diagnostic], output: String, sourceMap: Any): OptimizeJsOutput = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeJsOutput]
  }
  
  extension [Self <: OptimizeJsOutput](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setSourceMap(value: Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
  }
}
