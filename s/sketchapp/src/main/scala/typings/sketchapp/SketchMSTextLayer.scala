package typings.sketchapp

import typings.sketchapp.sketchappStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSTextLayer extends SketchMSContainerLayer {
  @JSName("_class")
  var _class_SketchMSTextLayer: text
  var attributedString: SketchMSAttributedString
}

object SketchMSTextLayer {
  @scala.inline
  def apply(
    _class: text,
    attributedString: SketchMSAttributedString,
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
  ): SketchMSTextLayer = {
    val __obj = js.Dynamic.literal(_class = _class, attributedString = attributedString, booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, frame = frame, hasClippingMask = hasClippingMask, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, layers = layers, name = name, nameIsFixed = nameIsFixed, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style)
  
    __obj.asInstanceOf[SketchMSTextLayer]
  }
}

