package typings.sketchapp

import typings.sketchapp.sketchappStrings.documentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSDocument extends js.Object {
  var _class: documentData
  var assets: SketchMSDocumentAssets
  var colorSpace: Double
  var currentPageIndex: Double
  var do_objectID: String
  var foreignSymbols: js.Array[SketchMSImmutableForeignSymbol]
  var foreignTextStyles: js.Array[_]
  var layerStyles: SketchMSSharedStyleContainer
  var layerSymbols: SketchMSSymbolContainers
  var layerTextStyles: SketchMSSharedTextStyleContainer
  var pages: js.Array[SketchMSPageReference]
}

object SketchMSDocument {
  @scala.inline
  def apply(
    _class: documentData,
    assets: SketchMSDocumentAssets,
    colorSpace: Double,
    currentPageIndex: Double,
    do_objectID: String,
    foreignSymbols: js.Array[SketchMSImmutableForeignSymbol],
    foreignTextStyles: js.Array[_],
    layerStyles: SketchMSSharedStyleContainer,
    layerSymbols: SketchMSSymbolContainers,
    layerTextStyles: SketchMSSharedTextStyleContainer,
    pages: js.Array[SketchMSPageReference]
  ): SketchMSDocument = {
    val __obj = js.Dynamic.literal(_class = _class, assets = assets, colorSpace = colorSpace, currentPageIndex = currentPageIndex, do_objectID = do_objectID, foreignSymbols = foreignSymbols, foreignTextStyles = foreignTextStyles, layerStyles = layerStyles, layerSymbols = layerSymbols, layerTextStyles = layerTextStyles, pages = pages)
  
    __obj.asInstanceOf[SketchMSDocument]
  }
}

