package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSContainerLayer extends SketchMSLayer {
  var layers: js.Array[SketchMSContainerLayer]
}

object SketchMSContainerLayer {
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
    layers: js.Array[SketchMSContainerLayer],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle
  ): SketchMSContainerLayer = {
    val __obj = js.Dynamic.literal(_class = _class, booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, frame = frame, hasClippingMask = hasClippingMask, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, name = name, nameIsFixed = nameIsFixed, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style)
  
    __obj.asInstanceOf[SketchMSContainerLayer]
  }
}

