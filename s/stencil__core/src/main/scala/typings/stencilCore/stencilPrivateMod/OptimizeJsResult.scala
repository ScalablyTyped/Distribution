package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeJsResult extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var output: String
  
  var sourceMap: js.UndefOr[SourceMap] = js.undefined
}
object OptimizeJsResult {
  
  inline def apply(diagnostics: js.Array[Diagnostic], output: String): OptimizeJsResult = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeJsResult]
  }
  
  extension [Self <: OptimizeJsResult](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setSourceMap(value: SourceMap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
