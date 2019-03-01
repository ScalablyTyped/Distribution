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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("assets")(assets)
    __obj.updateDynamic("currentPageIndex")(currentPageIndex)
    __obj.updateDynamic("enableLayerInteraction")(enableLayerInteraction)
    __obj.updateDynamic("enableSliceInteraction")(enableSliceInteraction)
    __obj.updateDynamic("foreignSymbols")(foreignSymbols)
    __obj.updateDynamic("layerStyles")(layerStyles)
    __obj.updateDynamic("layerSymbols")(layerSymbols)
    __obj.updateDynamic("layerTextStyles")(layerTextStyles)
    __obj.updateDynamic("objectID")(objectID)
    __obj.updateDynamic("pages")(pages)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSDocumentData]
  }
}

