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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], assets = assets.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], currentPageIndex = currentPageIndex.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], foreignSymbols = foreignSymbols.asInstanceOf[js.Any], foreignTextStyles = foreignTextStyles.asInstanceOf[js.Any], layerStyles = layerStyles.asInstanceOf[js.Any], layerSymbols = layerSymbols.asInstanceOf[js.Any], layerTextStyles = layerTextStyles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSDocument]
  }
}

