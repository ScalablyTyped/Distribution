package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSLayer extends StObject {
  
  var _class: String = js.native
  
  var booleanOperation: SketchMSLayerBooleanOperation = js.native
  
  var clippingMaskMode: SketchMSLayerClippingMaskMode = js.native
  
  // xLayers custom property
  var css: js.UndefOr[String] = js.native
  
  var do_objectID: String = js.native
  
  var exportOptions: SketchMSLayerExportOptions = js.native
  
  var frame: SketchMSLayerFrame = js.native
  
  var hasClippingMask: Boolean = js.native
  
  var isFixedToViewport: Boolean = js.native
  
  var isFlippedHorizontal: Boolean = js.native
  
  var isFlippedVertical: Boolean = js.native
  
  var isLocked: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var layerListExpandedType: Double = js.native
  
  var layers: js.UndefOr[js.Array[SketchMSLayer]] = js.native
  
  var name: String = js.native
  
  var nameIsFixed: Boolean = js.native
  
  var resizingConstraint: Double = js.native
  
  var resizingType: SketchMSLayerResizingType = js.native
  
  var rotation: Double = js.native
  
  var shouldBreakMaskChain: Boolean = js.native
  
  var style: SketchMSStyle = js.native
}
object SketchMSLayer {
  
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
  
  @scala.inline
  implicit class SketchMSLayerMutableBuilder[Self <: SketchMSLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanOperation(value: SketchMSLayerBooleanOperation): Self = StObject.set(x, "booleanOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingMaskMode(value: SketchMSLayerClippingMaskMode): Self = StObject.set(x, "clippingMaskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDo_objectID(value: String): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportOptions(value: SketchMSLayerExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: SketchMSLayerFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasClippingMask(value: Boolean): Self = StObject.set(x, "hasClippingMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedToViewport(value: Boolean): Self = StObject.set(x, "isFixedToViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlippedHorizontal(value: Boolean): Self = StObject.set(x, "isFlippedHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlippedVertical(value: Boolean): Self = StObject.set(x, "isFlippedVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerListExpandedType(value: Double): Self = StObject.set(x, "layerListExpandedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayers(value: js.Array[SketchMSLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: SketchMSLayer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameIsFixed(value: Boolean): Self = StObject.set(x, "nameIsFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizingConstraint(value: Double): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizingType(value: SketchMSLayerResizingType): Self = StObject.set(x, "resizingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldBreakMaskChain(value: Boolean): Self = StObject.set(x, "shouldBreakMaskChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: SketchMSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: String): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
