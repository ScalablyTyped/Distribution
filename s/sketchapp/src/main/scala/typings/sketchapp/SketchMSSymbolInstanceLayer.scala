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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], horizontalSpacing = horizontalSpacing.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], overrideValues = overrideValues.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalSpacing = verticalSpacing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSSymbolInstanceLayer]
  }
}

