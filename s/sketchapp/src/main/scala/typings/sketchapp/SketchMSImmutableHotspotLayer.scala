package typings.sketchapp

import typings.sketchapp.sketchappStrings.MSImmutableHotspotLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSImmutableHotspotLayer
  extends StObject
     with SketchMSLayer {
  
  @JSName("_class")
  var _class_SketchMSImmutableHotspotLayer: MSImmutableHotspotLayer
  
  var flow: SketchMSFlow
}
object SketchMSImmutableHotspotLayer {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(_class = "MSImmutableHotspotLayer", booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImmutableHotspotLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSImmutableHotspotLayer] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: SketchMSFlow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableHotspotLayer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
