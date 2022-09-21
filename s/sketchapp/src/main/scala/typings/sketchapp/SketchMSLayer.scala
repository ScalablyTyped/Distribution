package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSLayer extends StObject {
  
  var _class: String
  
  var booleanOperation: SketchMSLayerBooleanOperation
  
  var clippingMaskMode: SketchMSLayerClippingMaskMode
  
  // xLayers custom property
  var css: js.UndefOr[String] = js.undefined
  
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
  
  var layers: js.UndefOr[js.Array[SketchMSLayer]] = js.undefined
  
  var name: String
  
  var nameIsFixed: Boolean
  
  var resizingConstraint: Double
  
  var resizingType: SketchMSLayerResizingType
  
  var rotation: Double
  
  var shouldBreakMaskChain: Boolean
  
  var style: SketchMSStyle
}
object SketchMSLayer {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayer]
  }
  
  extension [Self <: SketchMSLayer](x: Self) {
    
    inline def setBooleanOperation(value: SketchMSLayerBooleanOperation): Self = StObject.set(x, "booleanOperation", value.asInstanceOf[js.Any])
    
    inline def setClippingMaskMode(value: SketchMSLayerClippingMaskMode): Self = StObject.set(x, "clippingMaskMode", value.asInstanceOf[js.Any])
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDo_objectID(value: String): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setExportOptions(value: SketchMSLayerExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: SketchMSLayerFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setHasClippingMask(value: Boolean): Self = StObject.set(x, "hasClippingMask", value.asInstanceOf[js.Any])
    
    inline def setIsFixedToViewport(value: Boolean): Self = StObject.set(x, "isFixedToViewport", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedHorizontal(value: Boolean): Self = StObject.set(x, "isFlippedHorizontal", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedVertical(value: Boolean): Self = StObject.set(x, "isFlippedVertical", value.asInstanceOf[js.Any])
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setLayerListExpandedType(value: Double): Self = StObject.set(x, "layerListExpandedType", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[SketchMSLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: SketchMSLayer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameIsFixed(value: Boolean): Self = StObject.set(x, "nameIsFixed", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Double): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setResizingType(value: SketchMSLayerResizingType): Self = StObject.set(x, "resizingType", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setShouldBreakMaskChain(value: Boolean): Self = StObject.set(x, "shouldBreakMaskChain", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: SketchMSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def set_class(value: String): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
