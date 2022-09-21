package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedImport extends StObject {
  
  var basename: String
  
  var data: ImportData
  
  var ext: String
  
  var importPath: String
}
object ParsedImport {
  
  inline def apply(basename: String, data: ImportData, ext: String, importPath: String): ParsedImport = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], importPath = importPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedImport]
  }
  
  extension [Self <: ParsedImport](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setData(value: ImportData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setImportPath(value: String): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
  }
}
