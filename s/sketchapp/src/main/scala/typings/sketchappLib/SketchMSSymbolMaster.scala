package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolMaster extends SketchMSLayer {
  var _class: sketchappLib.sketchappLibStrings.symbolMaster
  var attributedString: SketchMSAttributedString
  var backgroundColor: SketchMSColor
  var constrainProportions: scala.Boolean
  // add this property to hold all CSS properties
  // of the current layer
  var css: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var exportOptions: SketchMSExportOptions
  var flow: js.UndefOr[SketchMSImmutableFlowConnection] = js.undefined
  var frame: SketchMSRect
  var grid: SketchMSSimpleGrid
  var hasBackgroundColor: scala.Double
  var hasClickThrough: scala.Double
  var horizontalRulerData: SketchMSRulerData
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
  var name: java.lang.String
  var nameIsFixed: scala.Boolean
  var objectID: java.lang.String
  var resizesContent: scala.Double
  var resizingConstraint: sketchappLib.sketchappLibNumbers.`63` | scala.Double
  var resizingType: scala.Double
  var rotation: scala.Double
  var shouldBreakMaskChain: scala.Double
  var style: SketchMSStyle
  var userInfo: js.Any
  var verticalRulerData: SketchMSRulerData
}

object SketchMSSymbolMaster {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.symbolMaster,
    attributedString: SketchMSAttributedString,
    backgroundColor: SketchMSColor,
    constrainProportions: scala.Boolean,
    exportOptions: SketchMSExportOptions,
    frame: SketchMSRect,
    grid: SketchMSSimpleGrid,
    hasBackgroundColor: scala.Double,
    hasClickThrough: scala.Double,
    horizontalRulerData: SketchMSRulerData,
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
    userInfo: js.Any,
    verticalRulerData: SketchMSRulerData,
    css: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    do_objectID: java.lang.String = null,
    flow: SketchMSImmutableFlowConnection = null
  ): SketchMSSymbolMaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("attributedString")(attributedString)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("constrainProportions")(constrainProportions)
    __obj.updateDynamic("exportOptions")(exportOptions)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("hasBackgroundColor")(hasBackgroundColor)
    __obj.updateDynamic("hasClickThrough")(hasClickThrough)
    __obj.updateDynamic("horizontalRulerData")(horizontalRulerData)
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
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.updateDynamic("verticalRulerData")(verticalRulerData)
    if (css != null) __obj.updateDynamic("css")(css)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    if (flow != null) __obj.updateDynamic("flow")(flow)
    __obj.asInstanceOf[SketchMSSymbolMaster]
  }
}

