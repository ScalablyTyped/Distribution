package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSymbolInstanceLayer extends SketchMSLayer {
  
  @JSName("_class")
  var _class_SketchMSSymbolInstanceLayer: symbolInstance = js.native
  
  var horizontalSpacing: Double = js.native
  
  var overrideValues: js.Array[_] = js.native
  
  var scale: Double = js.native
  
  var symbolID: String = js.native
  
  var verticalSpacing: Double = js.native
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
  
  @scala.inline
  implicit class SketchMSSymbolInstanceLayerMutableBuilder[Self <: SketchMSSymbolInstanceLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalSpacing(value: Double): Self = StObject.set(x, "horizontalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideValues(value: js.Array[_]): Self = StObject.set(x, "overrideValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideValuesVarargs(value: js.Any*): Self = StObject.set(x, "overrideValues", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolID(value: String): Self = StObject.set(x, "symbolID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: symbolInstance): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
