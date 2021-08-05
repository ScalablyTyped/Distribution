package typings.sketchapp

import typings.sketchapp.sketchappStrings.exportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSLayerExportOptions extends StObject {
  
  var _class: exportOptions
  
  var exportFormats: js.Array[js.Any]
  
  var includedLayerIds: js.Array[js.Any]
  
  var layerOptions: Double
  
  var shouldTrim: Boolean
}
object SketchMSLayerExportOptions {
  
  inline def apply(
    exportFormats: js.Array[js.Any],
    includedLayerIds: js.Array[js.Any],
    layerOptions: Double,
    shouldTrim: Boolean
  ): SketchMSLayerExportOptions = {
    val __obj = js.Dynamic.literal(_class = "exportOptions", exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayerExportOptions]
  }
  
  extension [Self <: SketchMSLayerExportOptions](x: Self) {
    
    inline def setExportFormats(value: js.Array[js.Any]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsVarargs(value: js.Any*): Self = StObject.set(x, "exportFormats", js.Array(value :_*))
    
    inline def setIncludedLayerIds(value: js.Array[js.Any]): Self = StObject.set(x, "includedLayerIds", value.asInstanceOf[js.Any])
    
    inline def setIncludedLayerIdsVarargs(value: js.Any*): Self = StObject.set(x, "includedLayerIds", js.Array(value :_*))
    
    inline def setLayerOptions(value: Double): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setShouldTrim(value: Boolean): Self = StObject.set(x, "shouldTrim", value.asInstanceOf[js.Any])
    
    inline def set_class(value: exportOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
