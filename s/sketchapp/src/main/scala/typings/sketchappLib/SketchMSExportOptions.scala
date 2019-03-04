package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSExportOptions extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.exportOptions
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var exportFormats: js.Array[_]
  var includedLayerIds: js.Array[_]
  var layerOptions: scala.Double
  var shouldTrim: scala.Boolean
}

object SketchMSExportOptions {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.exportOptions,
    exportFormats: js.Array[_],
    includedLayerIds: js.Array[_],
    layerOptions: scala.Double,
    shouldTrim: scala.Boolean,
    do_objectID: java.lang.String = null
  ): SketchMSExportOptions = {
    val __obj = js.Dynamic.literal(_class = _class, exportFormats = exportFormats, includedLayerIds = includedLayerIds, layerOptions = layerOptions, shouldTrim = shouldTrim)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSExportOptions]
  }
}

