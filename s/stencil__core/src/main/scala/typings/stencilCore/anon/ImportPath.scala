package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportPath extends StObject {
  
  var importPath: String
  
  var varName: String
}
object ImportPath {
  
  inline def apply(importPath: String, varName: String): ImportPath = {
    val __obj = js.Dynamic.literal(importPath = importPath.asInstanceOf[js.Any], varName = varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportPath]
  }
  
  extension [Self <: ImportPath](x: Self) {
    
    inline def setImportPath(value: String): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
    
    inline def setVarName(value: String): Self = StObject.set(x, "varName", value.asInstanceOf[js.Any])
  }
}
