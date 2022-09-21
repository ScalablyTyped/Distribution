package typings.sketchapp

import typings.sketchapp.sketchappStrings.exportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSLayerExportOptions extends StObject {
  
  var _class: exportOptions
  
  var exportFormats: js.Array[Any]
  
  var includedLayerIds: js.Array[Any]
  
  var layerOptions: Double
  
  var shouldTrim: Boolean
}
object SketchMSLayerExportOptions {
  
  inline def apply(
    exportFormats: js.Array[Any],
    includedLayerIds: js.Array[Any],
    layerOptions: Double,
    shouldTrim: Boolean
  ): SketchMSLayerExportOptions = {
    val __obj = js.Dynamic.literal(_class = "exportOptions", exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayerExportOptions]
  }
  
  extension [Self <: SketchMSLayerExportOptions](x: Self) {
    
    inline def setExportFormats(value: js.Array[Any]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsVarargs(value: Any*): Self = StObject.set(x, "exportFormats", js.Array(value*))
    
    inline def setIncludedLayerIds(value: js.Array[Any]): Self = StObject.set(x, "includedLayerIds", value.asInstanceOf[js.Any])
    
    inline def setIncludedLayerIdsVarargs(value: Any*): Self = StObject.set(x, "includedLayerIds", js.Array(value*))
    
    inline def setLayerOptions(value: Double): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setShouldTrim(value: Boolean): Self = StObject.set(x, "shouldTrim", value.asInstanceOf[js.Any])
    
    inline def set_class(value: exportOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
