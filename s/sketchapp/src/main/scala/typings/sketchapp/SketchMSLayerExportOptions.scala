package typings.sketchapp

import typings.sketchapp.sketchappStrings.exportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayerExportOptions extends js.Object {
  var _class: exportOptions
  var exportFormats: js.Array[_]
  var includedLayerIds: js.Array[_]
  var layerOptions: Double
  var shouldTrim: Boolean
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
    val __obj = js.Dynamic.literal(_class = _class, exportFormats = exportFormats, includedLayerIds = includedLayerIds, layerOptions = layerOptions, shouldTrim = shouldTrim)
  
    __obj.asInstanceOf[SketchMSLayerExportOptions]
  }
}

