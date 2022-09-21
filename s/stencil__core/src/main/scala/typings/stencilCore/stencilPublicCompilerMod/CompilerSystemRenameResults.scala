package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemRenameResults
  extends StObject
     with CompilerSystemRenamedPath {
  
  var error: Any
  
  var newDirs: js.Array[String]
  
  var newFiles: js.Array[String]
  
  var oldDirs: js.Array[String]
  
  var oldFiles: js.Array[String]
  
  var renamed: js.Array[CompilerSystemRenamedPath]
}
object CompilerSystemRenameResults {
  
  inline def apply(
    error: Any,
    isDirectory: Boolean,
    isFile: Boolean,
    newDirs: js.Array[String],
    newFiles: js.Array[String],
    newPath: String,
    oldDirs: js.Array[String],
    oldFiles: js.Array[String],
    oldPath: String,
    renamed: js.Array[CompilerSystemRenamedPath]
  ): CompilerSystemRenameResults = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], newDirs = newDirs.asInstanceOf[js.Any], newFiles = newFiles.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldDirs = oldDirs.asInstanceOf[js.Any], oldFiles = oldFiles.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], renamed = renamed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerSystemRenameResults]
  }
  
  extension [Self <: CompilerSystemRenameResults](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setNewDirs(value: js.Array[String]): Self = StObject.set(x, "newDirs", value.asInstanceOf[js.Any])
    
    inline def setNewDirsVarargs(value: String*): Self = StObject.set(x, "newDirs", js.Array(value*))
    
    inline def setNewFiles(value: js.Array[String]): Self = StObject.set(x, "newFiles", value.asInstanceOf[js.Any])
    
    inline def setNewFilesVarargs(value: String*): Self = StObject.set(x, "newFiles", js.Array(value*))
    
    inline def setOldDirs(value: js.Array[String]): Self = StObject.set(x, "oldDirs", value.asInstanceOf[js.Any])
    
    inline def setOldDirsVarargs(value: String*): Self = StObject.set(x, "oldDirs", js.Array(value*))
    
    inline def setOldFiles(value: js.Array[String]): Self = StObject.set(x, "oldFiles", value.asInstanceOf[js.Any])
    
    inline def setOldFilesVarargs(value: String*): Self = StObject.set(x, "oldFiles", js.Array(value*))
    
    inline def setRenamed(value: js.Array[CompilerSystemRenamedPath]): Self = StObject.set(x, "renamed", value.asInstanceOf[js.Any])
    
    inline def setRenamedVarargs(value: CompilerSystemRenamedPath*): Self = StObject.set(x, "renamed", js.Array(value*))
  }
}
