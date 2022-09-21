package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemRenamedPath extends StObject {
  
  var isDirectory: Boolean
  
  var isFile: Boolean
  
  var newPath: String
  
  var oldPath: String
}
object CompilerSystemRenamedPath {
  
  inline def apply(isDirectory: Boolean, isFile: Boolean, newPath: String, oldPath: String): CompilerSystemRenamedPath = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerSystemRenamedPath]
  }
  
  extension [Self <: CompilerSystemRenamedPath](x: Self) {
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
  }
}
