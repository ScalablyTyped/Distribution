package typings.sketchapp

import typings.sketchapp.sketchappStrings.exportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSExportOptions extends js.Object {
  var _class: exportOptions
  var do_objectID: js.UndefOr[String] = js.undefined
  var exportFormats: js.Array[_]
  var includedLayerIds: js.Array[_]
  var layerOptions: Double
  var shouldTrim: Boolean
}

object SketchMSExportOptions {
  @scala.inline
  def apply(
    _class: exportOptions,
    exportFormats: js.Array[_],
    includedLayerIds: js.Array[_],
    layerOptions: Double,
    shouldTrim: Boolean,
    do_objectID: String = null
  ): SketchMSExportOptions = {
    val __obj = js.Dynamic.literal(_class = _class, exportFormats = exportFormats, includedLayerIds = includedLayerIds, layerOptions = layerOptions, shouldTrim = shouldTrim)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSExportOptions]
  }
}

