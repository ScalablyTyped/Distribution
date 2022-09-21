package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import typings.stencilCore.anon.OriginalLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleOutputChunk extends StObject {
  
  var code: String
  
  var dynamicImports: js.Array[String]
  
  var exports: js.Array[String]
  
  var fileName: String
  
  var imports: js.Array[String]
  
  var isDynamicEntry: Boolean
  
  var isEntry: Boolean
  
  var map: Any
  
  var modules: StringDictionary[OriginalLength]
  
  var name: String
}
object BundleOutputChunk {
  
  inline def apply(
    code: String,
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    map: Any,
    modules: StringDictionary[OriginalLength],
    name: String
  ): BundleOutputChunk = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleOutputChunk]
  }
  
  extension [Self <: BundleOutputChunk](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDynamicImports(value: js.Array[String]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportsVarargs(value: String*): Self = StObject.set(x, "dynamicImports", js.Array(value*))
    
    inline def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setIsDynamicEntry(value: Boolean): Self = StObject.set(x, "isDynamicEntry", value.asInstanceOf[js.Any])
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setModules(value: StringDictionary[OriginalLength]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
