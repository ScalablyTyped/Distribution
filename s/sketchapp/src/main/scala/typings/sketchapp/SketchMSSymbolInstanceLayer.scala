package typings.sketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.sketchapp.sketchappNumbers.`63`
import typings.sketchapp.sketchappStrings.symbolInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolInstanceLayer extends js.Object {
  var _class: symbolInstance
  var backgroundColor: SketchMSColor
  var do_objectID: js.UndefOr[String] = js.undefined
  var exportOptions: SketchMSExportOptions
  var flow: js.UndefOr[SketchMSImmutableFlowConnection] = js.undefined
  var frame: SketchMSRect
  var grid: SketchMSSimpleGrid
  var hasBackgroundColor: Double
  var hasClickThrough: Double
  var horizontalRulerData: SketchMSRulerData
  var horizontalSpacing: Double
  var includeBackgroundColorInExport: Double
  var includeBackgroundColorInInstance: Double
  var includeInCloudUpload: Double
  var isFlippedHorizontal: Double
  var isFlippedVertical: Double
  var isLocked: Boolean
  var isVisible: Boolean
  var layerListExpandedType: Double
  var layers: js.Array[SketchMSLayer]
  var layout: SketchMSLayoutGrid
  var masterInfluenceEdgeMaxXPadding: js.UndefOr[Double] = js.undefined
  var masterInfluenceEdgeMaxYPadding: js.UndefOr[Double] = js.undefined
  var masterInfluenceEdgeMinXPadding: js.UndefOr[Double] = js.undefined
  var masterInfluenceEdgeMinYPadding: js.UndefOr[Double] = js.undefined
  var name: String
  var nameIsFixed: Boolean
  var objectID: String
  var overrides: js.UndefOr[
    StringDictionary[String | SketchMSNestedSymbolOverride | SketchMSImageDataReference]
  ] = js.undefined
  var resizesContent: Double
  var resizingConstraint: `63` | Double
  var resizingType: Double
  var rotation: Double
  var shouldBreakMaskChain: Double
  var style: SketchMSStyle
  var symbolID: String
  var userInfo: js.Any
  var verticalRulerData: SketchMSRulerData
  var verticalSpacing: Double
}

object SketchMSSymbolInstanceLayer {
  @scala.inline
  def apply(
    _class: symbolInstance,
    backgroundColor: SketchMSColor,
    exportOptions: SketchMSExportOptions,
    frame: SketchMSRect,
    grid: SketchMSSimpleGrid,
    hasBackgroundColor: Double,
    hasClickThrough: Double,
    horizontalRulerData: SketchMSRulerData,
    horizontalSpacing: Double,
    includeBackgroundColorInExport: Double,
    includeBackgroundColorInInstance: Double,
    includeInCloudUpload: Double,
    isFlippedHorizontal: Double,
    isFlippedVertical: Double,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    layers: js.Array[SketchMSLayer],
    layout: SketchMSLayoutGrid,
    name: String,
    nameIsFixed: Boolean,
    objectID: String,
    resizesContent: Double,
    resizingConstraint: `63` | Double,
    resizingType: Double,
    rotation: Double,
    shouldBreakMaskChain: Double,
    style: SketchMSStyle,
    symbolID: String,
    userInfo: js.Any,
    verticalRulerData: SketchMSRulerData,
    verticalSpacing: Double,
    do_objectID: String = null,
    flow: SketchMSImmutableFlowConnection = null,
    masterInfluenceEdgeMaxXPadding: Int | Double = null,
    masterInfluenceEdgeMaxYPadding: Int | Double = null,
    masterInfluenceEdgeMinXPadding: Int | Double = null,
    masterInfluenceEdgeMinYPadding: Int | Double = null,
    overrides: StringDictionary[String | SketchMSNestedSymbolOverride | SketchMSImageDataReference] = null
  ): SketchMSSymbolInstanceLayer = {
    val __obj = js.Dynamic.literal(_class = _class, backgroundColor = backgroundColor, exportOptions = exportOptions, frame = frame, grid = grid, hasBackgroundColor = hasBackgroundColor, hasClickThrough = hasClickThrough, horizontalRulerData = horizontalRulerData, horizontalSpacing = horizontalSpacing, includeBackgroundColorInExport = includeBackgroundColorInExport, includeBackgroundColorInInstance = includeBackgroundColorInInstance, includeInCloudUpload = includeInCloudUpload, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, layout = layout, name = name, nameIsFixed = nameIsFixed, objectID = objectID, resizesContent = resizesContent, resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style, symbolID = symbolID, userInfo = userInfo, verticalRulerData = verticalRulerData, verticalSpacing = verticalSpacing)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    if (flow != null) __obj.updateDynamic("flow")(flow)
    if (masterInfluenceEdgeMaxXPadding != null) __obj.updateDynamic("masterInfluenceEdgeMaxXPadding")(masterInfluenceEdgeMaxXPadding.asInstanceOf[js.Any])
    if (masterInfluenceEdgeMaxYPadding != null) __obj.updateDynamic("masterInfluenceEdgeMaxYPadding")(masterInfluenceEdgeMaxYPadding.asInstanceOf[js.Any])
    if (masterInfluenceEdgeMinXPadding != null) __obj.updateDynamic("masterInfluenceEdgeMinXPadding")(masterInfluenceEdgeMinXPadding.asInstanceOf[js.Any])
    if (masterInfluenceEdgeMinYPadding != null) __obj.updateDynamic("masterInfluenceEdgeMinYPadding")(masterInfluenceEdgeMinYPadding.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[SketchMSSymbolInstanceLayer]
  }
}

