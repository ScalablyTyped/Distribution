package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedChunk
  extends StObject
     with PreRenderedChunk {
  
  var dynamicImports: js.Array[String]
  
  var fileName: String
  
  var implicitlyLoadedBefore: js.Array[String]
  
  var importedBindings: StringDictionary[js.Array[String]]
  
  var imports: js.Array[String]
  
  var modules: StringDictionary[RenderedModule]
  
  var referencedFiles: js.Array[String]
}
object RenderedChunk {
  
  inline def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    implicitlyLoadedBefore: js.Array[String],
    importedBindings: StringDictionary[js.Array[String]],
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    moduleIds: js.Array[String],
    modules: StringDictionary[RenderedModule],
    name: String,
    referencedFiles: js.Array[String]
  ): RenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], importedBindings = importedBindings.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], moduleIds = moduleIds.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], facadeModuleId = null)
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[RenderedChunk]
  }
  
  extension [Self <: RenderedChunk](x: Self) {
    
    inline def setDynamicImports(value: js.Array[String]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportsVarargs(value: String*): Self = StObject.set(x, "dynamicImports", js.Array(value*))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedBefore(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedBefore", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedBeforeVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedBefore", js.Array(value*))
    
    inline def setImportedBindings(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "importedBindings", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setModules(value: StringDictionary[RenderedModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setReferencedFiles(value: js.Array[String]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    inline def setReferencedFilesVarargs(value: String*): Self = StObject.set(x, "referencedFiles", js.Array(value*))
  }
}
