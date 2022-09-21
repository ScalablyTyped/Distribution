package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyResults extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var dirPaths: js.Array[String]
  
  var filePaths: js.Array[String]
}
object CopyResults {
  
  inline def apply(diagnostics: js.Array[Diagnostic], dirPaths: js.Array[String], filePaths: js.Array[String]): CopyResults = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], dirPaths = dirPaths.asInstanceOf[js.Any], filePaths = filePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyResults]
  }
  
  extension [Self <: CopyResults](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setDirPaths(value: js.Array[String]): Self = StObject.set(x, "dirPaths", value.asInstanceOf[js.Any])
    
    inline def setDirPathsVarargs(value: String*): Self = StObject.set(x, "dirPaths", js.Array(value*))
    
    inline def setFilePaths(value: js.Array[String]): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
    
    inline def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value*))
  }
}
