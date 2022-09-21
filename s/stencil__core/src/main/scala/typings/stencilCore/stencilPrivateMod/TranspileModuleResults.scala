package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranspileModuleResults extends StObject {
  
  var code: String
  
  var diagnostics: js.Array[Diagnostic]
  
  var map: Any
  
  var moduleFile: Module
  
  var sourceFilePath: String
}
object TranspileModuleResults {
  
  inline def apply(
    code: String,
    diagnostics: js.Array[Diagnostic],
    map: Any,
    moduleFile: Module,
    sourceFilePath: String
  ): TranspileModuleResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], moduleFile = moduleFile.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranspileModuleResults]
  }
  
  extension [Self <: TranspileModuleResults](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setModuleFile(value: Module): Self = StObject.set(x, "moduleFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
  }
}
