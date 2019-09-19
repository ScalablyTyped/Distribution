package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolMaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolMasterLayer extends SketchMSPageLayer {
  @JSName("_class")
  var _class_SketchMSSymbolMasterLayer: symbolMaster
  var backgroundColor: SketchMSColor
  var changeIdentifier: Double
  var hasBackgroundColor: Boolean
  var includeBackgroundColorInExport: Boolean
  var includeBackgroundColorInInstance: Boolean
  var isFlowHome: Boolean
  var resizesContent: Boolean
  var symbolID: String
}

object SketchMSSymbolMasterLayer {
  @scala.inline
  def apply(
    _class: symbolMaster,
    backgroundColor: SketchMSColor,
    booleanOperation: SketchMSLayerBooleanOperation,
    changeIdentifier: Double,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasBackgroundColor: Boolean,
    hasClickThrough: Boolean,
    hasClippingMask: Boolean,
    horizontalRulerData: SketchMSRulerData,
    includeBackgroundColorInExport: Boolean,
    includeBackgroundColorInInstance: Boolean,
    includeInCloudUpload: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isFlowHome: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    layers: js.Array[SketchMSContainerLayer],
    name: String,
    nameIsFixed: Boolean,
    resizesContent: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    symbolID: String,
    verticalRulerData: SketchMSRulerData
  ): SketchMSSymbolMasterLayer = {
    val __obj = js.Dynamic.literal(_class = _class, backgroundColor = backgroundColor, booleanOperation = booleanOperation, changeIdentifier = changeIdentifier, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, frame = frame, hasBackgroundColor = hasBackgroundColor, hasClickThrough = hasClickThrough, hasClippingMask = hasClippingMask, horizontalRulerData = horizontalRulerData, includeBackgroundColorInExport = includeBackgroundColorInExport, includeBackgroundColorInInstance = includeBackgroundColorInInstance, includeInCloudUpload = includeInCloudUpload, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isFlowHome = isFlowHome, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, name = name, nameIsFixed = nameIsFixed, resizesContent = resizesContent, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style, symbolID = symbolID, verticalRulerData = verticalRulerData)
  
    __obj.asInstanceOf[SketchMSSymbolMasterLayer]
  }
}

