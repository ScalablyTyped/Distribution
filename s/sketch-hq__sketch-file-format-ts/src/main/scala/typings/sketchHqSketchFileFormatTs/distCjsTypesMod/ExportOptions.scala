package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.exportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportOptions
  extends StObject
     with AnyObject {
  
  var _class: exportOptions
  
  var exportFormats: js.Array[ExportFormat]
  
  var includedLayerIds: js.Array[Uuid]
  
  var layerOptions: Double
  
  var shouldTrim: Boolean
}
object ExportOptions {
  
  inline def apply(
    exportFormats: js.Array[ExportFormat],
    includedLayerIds: js.Array[Uuid],
    layerOptions: Double,
    shouldTrim: Boolean
  ): ExportOptions = {
    val __obj = js.Dynamic.literal(_class = "exportOptions", exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
    
    inline def setExportFormats(value: js.Array[ExportFormat]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsVarargs(value: ExportFormat*): Self = StObject.set(x, "exportFormats", js.Array(value*))
    
    inline def setIncludedLayerIds(value: js.Array[Uuid]): Self = StObject.set(x, "includedLayerIds", value.asInstanceOf[js.Any])
    
    inline def setIncludedLayerIdsVarargs(value: Uuid*): Self = StObject.set(x, "includedLayerIds", js.Array(value*))
    
    inline def setLayerOptions(value: Double): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setShouldTrim(value: Boolean): Self = StObject.set(x, "shouldTrim", value.asInstanceOf[js.Any])
    
    inline def set_class(value: exportOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
