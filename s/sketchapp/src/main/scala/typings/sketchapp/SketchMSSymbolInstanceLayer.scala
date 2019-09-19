package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSymbolInstanceLayer extends SketchMSLayer {
  @JSName("_class")
  var _class_SketchMSSymbolInstanceLayer: symbolInstance
  var horizontalSpacing: Double
  var overrideValues: js.Array[_]
  var scale: Double
  var symbolID: String
  var verticalSpacing: Double
}

object SketchMSSymbolInstanceLayer {
  @scala.inline
  def apply(
    _class: symbolInstance,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    horizontalSpacing: Double,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    overrideValues: js.Array[_],
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    scale: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    symbolID: String,
    verticalSpacing: Double
  ): SketchMSSymbolInstanceLayer = {
    val __obj = js.Dynamic.literal(_class = _class, booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, exportOptions = exportOptions, frame = frame, hasClippingMask = hasClippingMask, horizontalSpacing = horizontalSpacing, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, name = name, nameIsFixed = nameIsFixed, overrideValues = overrideValues, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, scale = scale, shouldBreakMaskChain = shouldBreakMaskChain, style = style, symbolID = symbolID, verticalSpacing = verticalSpacing)
  
    __obj.asInstanceOf[SketchMSSymbolInstanceLayer]
  }
}

