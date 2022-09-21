package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSSymbolInstanceLayer
  extends StObject
     with SketchMSLayer {
  
  @JSName("_class")
  var _class_SketchMSSymbolInstanceLayer: symbolInstance
  
  var horizontalSpacing: Double
  
  var overrideValues: js.Array[Any]
  
  var scale: Double
  
  var symbolID: String
  
  var verticalSpacing: Double
}
object SketchMSSymbolInstanceLayer {
  
  inline def apply(
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
    overrideValues: js.Array[Any],
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    scale: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    symbolID: String,
    verticalSpacing: Double
  ): SketchMSSymbolInstanceLayer = {
    val __obj = js.Dynamic.literal(_class = "symbolInstance", booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], horizontalSpacing = horizontalSpacing.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], overrideValues = overrideValues.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalSpacing = verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSymbolInstanceLayer]
  }
  
  extension [Self <: SketchMSSymbolInstanceLayer](x: Self) {
    
    inline def setHorizontalSpacing(value: Double): Self = StObject.set(x, "horizontalSpacing", value.asInstanceOf[js.Any])
    
    inline def setOverrideValues(value: js.Array[Any]): Self = StObject.set(x, "overrideValues", value.asInstanceOf[js.Any])
    
    inline def setOverrideValuesVarargs(value: Any*): Self = StObject.set(x, "overrideValues", js.Array(value*))
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSymbolID(value: String): Self = StObject.set(x, "symbolID", value.asInstanceOf[js.Any])
    
    inline def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
    
    inline def set_class(value: symbolInstance): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
