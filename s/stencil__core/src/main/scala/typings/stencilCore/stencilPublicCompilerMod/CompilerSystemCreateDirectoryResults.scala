package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemCreateDirectoryResults extends StObject {
  
  var basename: String
  
  var dirname: String
  
  var error: Any
  
  var newDirs: js.Array[String]
  
  var path: String
}
object CompilerSystemCreateDirectoryResults {
  
  inline def apply(basename: String, dirname: String, error: Any, newDirs: js.Array[String], path: String): CompilerSystemCreateDirectoryResults = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], newDirs = newDirs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerSystemCreateDirectoryResults]
  }
  
  extension [Self <: CompilerSystemCreateDirectoryResults](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setNewDirs(value: js.Array[String]): Self = StObject.set(x, "newDirs", value.asInstanceOf[js.Any])
    
    inline def setNewDirsVarargs(value: String*): Self = StObject.set(x, "newDirs", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
