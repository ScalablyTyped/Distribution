package typings.sketchapp

import typings.sketchapp.sketchappStrings.documentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSDocumentData extends js.Object {
  var _class: documentData
  var assets: SketchMSAssetCollection
  var currentPageIndex: Double
  var do_objectID: js.UndefOr[String] = js.undefined
  var enableLayerInteraction: Double
  var enableSliceInteraction: Double
  var foreignSymbols: js.Array[_]
  var layerStyles: SketchMSSharedStyleContainer
  var layerSymbols: SketchMSSymbolContainers
  var layerTextStyles: SketchMSSharedTextStyleContainer
  var objectID: String
  var pages: js.Array[SketchMSPage]
}

object SketchMSDocumentData {
  @scala.inline
  def apply(
    _class: documentData,
    assets: SketchMSAssetCollection,
    currentPageIndex: Double,
    enableLayerInteraction: Double,
    enableSliceInteraction: Double,
    foreignSymbols: js.Array[_],
    layerStyles: SketchMSSharedStyleContainer,
    layerSymbols: SketchMSSymbolContainers,
    layerTextStyles: SketchMSSharedTextStyleContainer,
    objectID: String,
    pages: js.Array[SketchMSPage],
    do_objectID: String = null
  ): SketchMSDocumentData = {
    val __obj = js.Dynamic.literal(_class = _class, assets = assets, currentPageIndex = currentPageIndex, enableLayerInteraction = enableLayerInteraction, enableSliceInteraction = enableSliceInteraction, foreignSymbols = foreignSymbols, layerStyles = layerStyles, layerSymbols = layerSymbols, layerTextStyles = layerTextStyles, objectID = objectID, pages = pages)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSDocumentData]
  }
}

