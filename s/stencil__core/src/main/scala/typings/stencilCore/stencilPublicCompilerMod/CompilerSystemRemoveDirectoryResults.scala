package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemRemoveDirectoryResults extends StObject {
  
  var basename: String
  
  var dirname: String
  
  var error: Any
  
  var path: String
  
  var removedDirs: js.Array[String]
  
  var removedFiles: js.Array[String]
}
object CompilerSystemRemoveDirectoryResults {
  
  inline def apply(
    basename: String,
    dirname: String,
    error: Any,
    path: String,
    removedDirs: js.Array[String],
    removedFiles: js.Array[String]
  ): CompilerSystemRemoveDirectoryResults = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], removedDirs = removedDirs.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerSystemRemoveDirectoryResults]
  }
  
  extension [Self <: CompilerSystemRemoveDirectoryResults](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRemovedDirs(value: js.Array[String]): Self = StObject.set(x, "removedDirs", value.asInstanceOf[js.Any])
    
    inline def setRemovedDirsVarargs(value: String*): Self = StObject.set(x, "removedDirs", js.Array(value*))
    
    inline def setRemovedFiles(value: js.Array[String]): Self = StObject.set(x, "removedFiles", value.asInstanceOf[js.Any])
    
    inline def setRemovedFilesVarargs(value: String*): Self = StObject.set(x, "removedFiles", js.Array(value*))
  }
}
