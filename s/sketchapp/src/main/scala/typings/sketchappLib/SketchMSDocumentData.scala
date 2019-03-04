package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSDocumentData extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.documentData
  var assets: SketchMSAssetCollection
  var currentPageIndex: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var enableLayerInteraction: scala.Double
  var enableSliceInteraction: scala.Double
  var foreignSymbols: js.Array[_]
  var layerStyles: SketchMSSharedStyleContainer
  var layerSymbols: SketchMSSymbolContainers
  var layerTextStyles: SketchMSSharedTextStyleContainer
  var objectID: java.lang.String
  var pages: js.Array[SketchMSPage]
}

object SketchMSDocumentData {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.documentData,
    assets: SketchMSAssetCollection,
    currentPageIndex: scala.Double,
    enableLayerInteraction: scala.Double,
    enableSliceInteraction: scala.Double,
    foreignSymbols: js.Array[_],
    layerStyles: SketchMSSharedStyleContainer,
    layerSymbols: SketchMSSymbolContainers,
    layerTextStyles: SketchMSSharedTextStyleContainer,
    objectID: java.lang.String,
    pages: js.Array[SketchMSPage],
    do_objectID: java.lang.String = null
  ): SketchMSDocumentData = {
    val __obj = js.Dynamic.literal(_class = _class, assets = assets, currentPageIndex = currentPageIndex, enableLayerInteraction = enableLayerInteraction, enableSliceInteraction = enableSliceInteraction, foreignSymbols = foreignSymbols, layerStyles = layerStyles, layerSymbols = layerSymbols, layerTextStyles = layerTextStyles, objectID = objectID, pages = pages)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSDocumentData]
  }
}

