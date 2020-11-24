package typings.sketchapp

import typings.sketchapp.sketchappStrings.exportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSLayerExportOptions extends js.Object {
  
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
  implicit class SketchMSLayerExportOptionsOps[Self <: SketchMSLayerExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: exportOptions): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFormatsVarargs(value: js.Any*): Self = this.set("exportFormats", js.Array(value :_*))
    
    @scala.inline
    def setExportFormats(value: js.Array[_]): Self = this.set("exportFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedLayerIdsVarargs(value: js.Any*): Self = this.set("includedLayerIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludedLayerIds(value: js.Array[_]): Self = this.set("includedLayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerOptions(value: Double): Self = this.set("layerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldTrim(value: Boolean): Self = this.set("shouldTrim", value.asInstanceOf[js.Any])
  }
}
