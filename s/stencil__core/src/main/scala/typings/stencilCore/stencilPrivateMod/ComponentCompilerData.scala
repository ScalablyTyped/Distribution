package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerData extends StObject {
  
  var cmp: ComponentCompilerMeta
  
  var exportLine: String
  
  var filePath: String
  
  var importLine: js.UndefOr[String] = js.undefined
  
  var uniqueComponentClassName: js.UndefOr[String] = js.undefined
}
object ComponentCompilerData {
  
  inline def apply(cmp: ComponentCompilerMeta, exportLine: String, filePath: String): ComponentCompilerData = {
    val __obj = js.Dynamic.literal(cmp = cmp.asInstanceOf[js.Any], exportLine = exportLine.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerData]
  }
  
  extension [Self <: ComponentCompilerData](x: Self) {
    
    inline def setCmp(value: ComponentCompilerMeta): Self = StObject.set(x, "cmp", value.asInstanceOf[js.Any])
    
    inline def setExportLine(value: String): Self = StObject.set(x, "exportLine", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setImportLine(value: String): Self = StObject.set(x, "importLine", value.asInstanceOf[js.Any])
    
    inline def setImportLineUndefined: Self = StObject.set(x, "importLine", js.undefined)
    
    inline def setUniqueComponentClassName(value: String): Self = StObject.set(x, "uniqueComponentClassName", value.asInstanceOf[js.Any])
    
    inline def setUniqueComponentClassNameUndefined: Self = StObject.set(x, "uniqueComponentClassName", js.undefined)
  }
}
