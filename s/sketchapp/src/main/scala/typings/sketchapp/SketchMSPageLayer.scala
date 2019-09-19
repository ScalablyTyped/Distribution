package typings.sketchapp

import typings.sketchapp.sketchappStrings.page
import typings.sketchapp.sketchappStrings.symbolMaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPageLayer extends SketchMSContainerLayer {
  @JSName("_class")
  var _class_SketchMSPageLayer: page | symbolMaster
  var hasClickThrough: Boolean
  var horizontalRulerData: SketchMSRulerData
  var includeInCloudUpload: Boolean
  var verticalRulerData: SketchMSRulerData
}

object SketchMSPageLayer {
  @scala.inline
  def apply(
    _class: page | symbolMaster,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClickThrough: Boolean,
    hasClippingMask: Boolean,
    horizontalRulerData: SketchMSRulerData,
    includeInCloudUpload: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    layers: js.Array[SketchMSContainerLayer],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    verticalRulerData: SketchMSRulerData
  ): SketchMSPageLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, frame = frame, hasClickThrough = hasClickThrough, hasClippingMask = hasClippingMask, horizontalRulerData = horizontalRulerData, includeInCloudUpload = includeInCloudUpload, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, name = name, nameIsFixed = nameIsFixed, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style, verticalRulerData = verticalRulerData)
  
    __obj.asInstanceOf[SketchMSPageLayer]
  }
}

