package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.PathString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranspileResults extends StObject {
  
  var code: String
  
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var diagnostics: js.Array[Diagnostic]
  
  var imports: js.UndefOr[js.Array[PathString]] = js.undefined
  
  var inputFileExtension: String
  
  var inputFilePath: String
  
  var map: Any
  
  var outputFilePath: String
}
object TranspileResults {
  
  inline def apply(
    code: String,
    diagnostics: js.Array[Diagnostic],
    inputFileExtension: String,
    inputFilePath: String,
    map: Any,
    outputFilePath: String
  ): TranspileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], inputFileExtension = inputFileExtension.asInstanceOf[js.Any], inputFilePath = inputFilePath.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], outputFilePath = outputFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileResults]
  }
  
  extension [Self <: TranspileResults](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setImports(value: js.Array[PathString]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: PathString*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInputFileExtension(value: String): Self = StObject.set(x, "inputFileExtension", value.asInstanceOf[js.Any])
    
    inline def setInputFilePath(value: String): Self = StObject.set(x, "inputFilePath", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOutputFilePath(value: String): Self = StObject.set(x, "outputFilePath", value.asInstanceOf[js.Any])
  }
}
