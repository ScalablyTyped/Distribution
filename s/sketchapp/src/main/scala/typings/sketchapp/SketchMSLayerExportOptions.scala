package typings.sketchapp

import typings.sketchapp.sketchappStrings.exportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSLayerExportOptions extends StObject {
  
  var _class: exportOptions = js.native
  
  var exportFormats: js.Array[_] = js.native
  
  var includedLayerIds: js.Array[_] = js.native
  
  var layerOptions: Double = js.native
  
  var shouldTrim: Boolean = js.native
}
object SketchMSLayerExportOptions {
  
  @scala.inline
  def apply(
    _class: exportOptions,
    exportFormats: js.Array[_],
    includedLayerIds: js.Array[_],
    layerOptions: Double,
    shouldTrim: Boolean
  ): SketchMSLayerExportOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayerExportOptions]
  }
  
  @scala.inline
  implicit class SketchMSLayerExportOptionsMutableBuilder[Self <: SketchMSLayerExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFormats(value: js.Array[_]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatsVarargs(value: js.Any*): Self = StObject.set(x, "exportFormats", js.Array(value :_*))
    
    @scala.inline
    def setIncludedLayerIds(value: js.Array[_]): Self = StObject.set(x, "includedLayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedLayerIdsVarargs(value: js.Any*): Self = StObject.set(x, "includedLayerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerOptions(value: Double): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldTrim(value: Boolean): Self = StObject.set(x, "shouldTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: exportOptions): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
