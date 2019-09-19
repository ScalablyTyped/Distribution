package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutableHotspotLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSImmutableHotspotLayer extends SketchMSLayer {
  @JSName("_class")
  var _class_SketchMSImmutableHotspotLayer: MSImmutableHotspotLayer
  var flow: SketchMSFlow
}

object SketchMSImmutableHotspotLayer {
  @scala.inline
  def apply(
    _class: MSImmutableHotspotLayer,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    flow: SketchMSFlow,
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
  ): SketchMSImmutableHotspotLayer = {
    val __obj = js.Dynamic.literal(_class = _class, booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, flow = flow, frame = frame, hasClippingMask = hasClippingMask, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, name = name, nameIsFixed = nameIsFixed, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style)
  
    __obj.asInstanceOf[SketchMSImmutableHotspotLayer]
  }
}

