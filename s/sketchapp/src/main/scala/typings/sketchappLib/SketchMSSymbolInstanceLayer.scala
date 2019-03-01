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

object SketchMSSymbolInstanceLayer {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.symbolInstance,
    backgroundColor: SketchMSColor,
    exportOptions: SketchMSExportOptions,
    frame: SketchMSRect,
    grid: SketchMSSimpleGrid,
    hasBackgroundColor: scala.Double,
    hasClickThrough: scala.Double,
    horizontalRulerData: SketchMSRulerData,
    horizontalSpacing: scala.Double,
    includeBackgroundColorInExport: scala.Double,
    includeBackgroundColorInInstance: scala.Double,
    includeInCloudUpload: scala.Double,
    isFlippedHorizontal: scala.Double,
    isFlippedVertical: scala.Double,
    isLocked: scala.Boolean,
    isVisible: scala.Boolean,
    layerListExpandedType: scala.Double,
    layers: js.Array[SketchMSLayer],
    layout: SketchMSLayoutGrid,
    name: java.lang.String,
    nameIsFixed: scala.Boolean,
    objectID: java.lang.String,
    resizesContent: scala.Double,
    resizingConstraint: sketchappLib.sketchappLibNumbers.`63` | scala.Double,
    resizingType: scala.Double,
    rotation: scala.Double,
    shouldBreakMaskChain: scala.Double,
    style: SketchMSStyle,
    symbolID: java.lang.String,
    userInfo: js.Any,
    verticalRulerData: SketchMSRulerData,
    verticalSpacing: scala.Double,
    do_objectID: java.lang.String = null,
    flow: SketchMSImmutableFlowConnection = null,
    masterInfluenceEdgeMaxXPadding: scala.Int | scala.Double = null,
    masterInfluenceEdgeMaxYPadding: scala.Int | scala.Double = null,
    masterInfluenceEdgeMinXPadding: scala.Int | scala.Double = null,
    masterInfluenceEdgeMinYPadding: scala.Int | scala.Double = null,
    overrides: org.scalablytyped.runtime.StringDictionary[java.lang.String | SketchMSNestedSymbolOverride | SketchMSImageDataReference] = null
  ): SketchMSSymbolInstanceLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("exportOptions")(exportOptions)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("hasBackgroundColor")(hasBackgroundColor)
    __obj.updateDynamic("hasClickThrough")(hasClickThrough)
    __obj.updateDynamic("horizontalRulerData")(horizontalRulerData)
    __obj.updateDynamic("horizontalSpacing")(horizontalSpacing)
    __obj.updateDynamic("includeBackgroundColorInExport")(includeBackgroundColorInExport)
    __obj.updateDynamic("includeBackgroundColorInInstance")(includeBackgroundColorInInstance)
    __obj.updateDynamic("includeInCloudUpload")(includeInCloudUpload)
    __obj.updateDynamic("isFlippedHorizontal")(isFlippedHorizontal)
    __obj.updateDynamic("isFlippedVertical")(isFlippedVertical)
    __obj.updateDynamic("isLocked")(isLocked)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("layerListExpandedType")(layerListExpandedType)
    __obj.updateDynamic("layers")(layers)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nameIsFixed")(nameIsFixed)
    __obj.updateDynamic("objectID")(objectID)
    __obj.updateDynamic("resizesContent")(resizesContent)
    __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    __obj.updateDynamic("resizingType")(resizingType)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("shouldBreakMaskChain")(shouldBreakMaskChain)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("symbolID")(symbolID)
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.updateDynamic("verticalRulerData")(verticalRulerData)
    __obj.updateDynamic("verticalSpacing")(verticalSpacing)
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

