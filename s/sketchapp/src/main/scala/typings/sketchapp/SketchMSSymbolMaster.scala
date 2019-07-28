package typings.sketchapp

import org.scalablytyped.runtime.StringDictionary
import typings.sketchapp.sketchappNumbers.`63`
import typings.sketchapp.sketchappStrings.symbolMaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolMaster extends SketchMSLayer {
  var _class: symbolMaster
  var attributedString: SketchMSAttributedString
  var backgroundColor: SketchMSColor
  var constrainProportions: Boolean
  // add this property to hold all CSS properties
  // of the current layer
  var css: js.UndefOr[StringDictionary[String]] = js.undefined
  var do_objectID: js.UndefOr[String] = js.undefined
  var exportOptions: SketchMSExportOptions
  var flow: js.UndefOr[SketchMSImmutableFlowConnection] = js.undefined
  var frame: SketchMSRect
  var grid: SketchMSSimpleGrid
  var hasBackgroundColor: Double
  var hasClickThrough: Double
  var horizontalRulerData: SketchMSRulerData
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
  var name: String
  var nameIsFixed: Boolean
  var objectID: String
  var resizesContent: Double
  var resizingConstraint: `63` | Double
  var resizingType: Double
  var rotation: Double
  var shouldBreakMaskChain: Double
  var style: SketchMSStyle
  var userInfo: js.Any
  var verticalRulerData: SketchMSRulerData
}

object SketchMSSymbolMaster {
  @scala.inline
  def apply(
    _class: symbolMaster,
    attributedString: SketchMSAttributedString,
    backgroundColor: SketchMSColor,
    constrainProportions: Boolean,
    exportOptions: SketchMSExportOptions,
    frame: SketchMSRect,
    grid: SketchMSSimpleGrid,
    hasBackgroundColor: Double,
    hasClickThrough: Double,
    horizontalRulerData: SketchMSRulerData,
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
    userInfo: js.Any,
    verticalRulerData: SketchMSRulerData,
    css: StringDictionary[String] = null,
    do_objectID: String = null,
    flow: SketchMSImmutableFlowConnection = null
  ): SketchMSSymbolMaster = {
    val __obj = js.Dynamic.literal(_class = _class, attributedString = attributedString, backgroundColor = backgroundColor, constrainProportions = constrainProportions, exportOptions = exportOptions, frame = frame, grid = grid, hasBackgroundColor = hasBackgroundColor, hasClickThrough = hasClickThrough, horizontalRulerData = horizontalRulerData, includeBackgroundColorInExport = includeBackgroundColorInExport, includeBackgroundColorInInstance = includeBackgroundColorInInstance, includeInCloudUpload = includeInCloudUpload, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, layout = layout, name = name, nameIsFixed = nameIsFixed, objectID = objectID, resizesContent = resizesContent, resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style, userInfo = userInfo, verticalRulerData = verticalRulerData)
    if (css != null) __obj.updateDynamic("css")(css)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    if (flow != null) __obj.updateDynamic("flow")(flow)
    __obj.asInstanceOf[SketchMSSymbolMaster]
  }
}

