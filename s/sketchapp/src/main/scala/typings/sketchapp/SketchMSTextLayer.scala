package typings.sketchapp

import typings.sketchapp.sketchappStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSTextLayer
  extends StObject
     with SketchMSContainerLayer {
  
  @JSName("_class")
  var _class_SketchMSTextLayer: text
  
  var attributedString: SketchMSAttributedString
}
object SketchMSTextLayer {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(_class = "text", attributedString = attributedString.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSTextLayer]
  }
  
  @scala.inline
  implicit class SketchMSTextLayerMutableBuilder[Self <: SketchMSTextLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributedString(value: SketchMSAttributedString): Self = StObject.set(x, "attributedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: text): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
