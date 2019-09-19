package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayer extends js.Object {
  var _class: String
  var booleanOperation: SketchMSLayerBooleanOperation
  var clippingMaskMode: SketchMSLayerClippingMaskMode
  var do_objectID: String
  var exportOptions: SketchMSLayerExportOptions
  var frame: SketchMSLayerFrame
  var hasClippingMask: Boolean
  var isFixedToViewport: Boolean
  var isFlippedHorizontal: Boolean
  var isFlippedVertical: Boolean
  var isLocked: Boolean
  var isVisible: Boolean
  var layerListExpandedType: Double
  var name: String
  var nameIsFixed: Boolean
  var resizingConstraint: Double
  var resizingType: SketchMSLayerResizingType
  var rotation: Double
  var shouldBreakMaskChain: Boolean
  var style: SketchMSStyle
}

object SketchMSLayer {
  @scala.inline
  def apply(
    _class: String,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle
  ): SketchMSLayer = {
    val __obj = js.Dynamic.literal(_class = _class, booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, frame = frame, hasClippingMask = hasClippingMask, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, name = name, nameIsFixed = nameIsFixed, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style)
  
    __obj.asInstanceOf[SketchMSLayer]
  }
}

