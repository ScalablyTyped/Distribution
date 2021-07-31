package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedChunk
  extends StObject
     with PreRenderedChunk {
  
  var code: js.UndefOr[String] = js.undefined
  
  var dynamicImports: js.Array[String]
  
  var fileName: String
  
  var implicitlyLoadedBefore: js.Array[String]
  
  var importedBindings: StringDictionary[js.Array[String]]
  
  var imports: js.Array[String]
  
  var map: js.UndefOr[SourceMap] = js.undefined
  
  var referencedFiles: js.Array[String]
}
object RenderedChunk {
  
  @scala.inline
  def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    implicitlyLoadedBefore: js.Array[String],
    importedBindings: StringDictionary[js.Array[String]],
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    referencedFiles: js.Array[String]
  ): RenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], implicitlyLoadedBefore = implicitlyLoadedBefore.asInstanceOf[js.Any], importedBindings = importedBindings.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], facadeModuleId = null)
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[RenderedChunk]
  }
  
  @scala.inline
  implicit class RenderedChunkMutableBuilder[Self <: RenderedChunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDynamicImports(value: js.Array[String]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicImportsVarargs(value: String*): Self = StObject.set(x, "dynamicImports", js.Array(value :_*))
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedBefore(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitlyLoadedBeforeVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedBefore", js.Array(value :_*))
    
    @scala.inline
    def setImportedBindings(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "importedBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setReferencedFiles(value: js.Array[String]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedFilesVarargs(value: String*): Self = StObject.set(x, "referencedFiles", js.Array(value :_*))
  }
}
