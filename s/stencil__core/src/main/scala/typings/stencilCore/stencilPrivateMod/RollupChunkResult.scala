package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupChunkResult
  extends StObject
     with RollupResult {
  
  var code: String
  
  var entryKey: String
  
  var fileName: String
  
  var imports: js.Array[String]
  
  var isBrowserLoader: Boolean
  
  var isComponent: Boolean
  
  var isCore: Boolean
  
  var isEntry: Boolean
  
  var isIndex: Boolean
  
  var map: js.UndefOr[RollupSourceMap] = js.undefined
  
  var moduleFormat: ModuleFormat
  
  var `type`: chunk
}
object RollupChunkResult {
  
  inline def apply(
    code: String,
    entryKey: String,
    fileName: String,
    imports: js.Array[String],
    isBrowserLoader: Boolean,
    isComponent: Boolean,
    isCore: Boolean,
    isEntry: Boolean,
    isIndex: Boolean,
    moduleFormat: ModuleFormat
  ): RollupChunkResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], entryKey = entryKey.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isBrowserLoader = isBrowserLoader.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isCore = isCore.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isIndex = isIndex.asInstanceOf[js.Any], moduleFormat = moduleFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[RollupChunkResult]
  }
  
  extension [Self <: RollupChunkResult](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEntryKey(value: String): Self = StObject.set(x, "entryKey", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setIsBrowserLoader(value: Boolean): Self = StObject.set(x, "isBrowserLoader", value.asInstanceOf[js.Any])
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setIsCore(value: Boolean): Self = StObject.set(x, "isCore", value.asInstanceOf[js.Any])
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsIndex(value: Boolean): Self = StObject.set(x, "isIndex", value.asInstanceOf[js.Any])
    
    inline def setMap(value: RollupSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setModuleFormat(value: ModuleFormat): Self = StObject.set(x, "moduleFormat", value.asInstanceOf[js.Any])
    
    inline def setType(value: chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
