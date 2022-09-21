package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleGraph extends StObject {
  
  var filePath: String
  
  var importPaths: js.Array[String]
}
object ModuleGraph {
  
  inline def apply(filePath: String, importPaths: js.Array[String]): ModuleGraph = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], importPaths = importPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleGraph]
  }
  
  extension [Self <: ModuleGraph](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setImportPaths(value: js.Array[String]): Self = StObject.set(x, "importPaths", value.asInstanceOf[js.Any])
    
    inline def setImportPathsVarargs(value: String*): Self = StObject.set(x, "importPaths", js.Array(value*))
  }
}
