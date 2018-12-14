package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SketchMSSymbolInstanceLayer extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.symbolInstance
  var backgroundColor: SketchMSColor
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var exportOptions: SketchMSExportOptions
  var flow: js.UndefOr[SketchMSImmutableFlowConnection] = js.undefined
  var frame: SketchMSRect
  var grid: SketchMSSimpleGrid
  var hasBackgroundColor: scala.Double
  var hasClickThrough: scala.Double
  var horizontalRulerData: SketchMSRulerData
  var horizontalSpacing: scala.Double
  var includeBackgroundColorInExport: scala.Double
  var includeBackgroundColorInInstance: scala.Double
  var includeInCloudUpload: scala.Double
  var isFlippedHorizontal: scala.Double
  var isFlippedVertical: scala.Double
  var isLocked: scala.Boolean
  var isVisible: scala.Boolean
  var layerListExpandedType: scala.Double
  var layers: js.Array[SketchMSLayer]
  var layout: SketchMSLayoutGrid
  var masterInfluenceEdgeMaxXPadding: js.UndefOr[scala.Double] = js.undefined
  var masterInfluenceEdgeMaxYPadding: js.UndefOr[scala.Double] = js.undefined
  var masterInfluenceEdgeMinXPadding: js.UndefOr[scala.Double] = js.undefined
  var masterInfluenceEdgeMinYPadding: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var nameIsFixed: scala.Boolean
  var objectID: java.lang.String
  var overrides: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | SketchMSNestedSymbolOverride | SketchMSImageDataReference]
  ] = js.undefined
  var resizesContent: scala.Double
  var resizingConstraint: sketchappLib.sketchappLibNumbers.`63` | scala.Double
  var resizingType: scala.Double
  var rotation: scala.Double
  var shouldBreakMaskChain: scala.Double
  var style: SketchMSStyle
  var symbolID: java.lang.String
  var userInfo: js.Any
  var verticalRulerData: SketchMSRulerData
  var verticalSpacing: scala.Double
}

