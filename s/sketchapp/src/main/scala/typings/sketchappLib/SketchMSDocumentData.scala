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

