package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSLayer extends js.Object {
  
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
  implicit class SketchMSLayerOps[Self <: SketchMSLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: String): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanOperation(value: SketchMSLayerBooleanOperation): Self = this.set("booleanOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingMaskMode(value: SketchMSLayerClippingMaskMode): Self = this.set("clippingMaskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDo_objectID(value: String): Self = this.set("do_objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportOptions(value: SketchMSLayerExportOptions): Self = this.set("exportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: SketchMSLayerFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasClippingMask(value: Boolean): Self = this.set("hasClippingMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedToViewport(value: Boolean): Self = this.set("isFixedToViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlippedHorizontal(value: Boolean): Self = this.set("isFlippedHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlippedVertical(value: Boolean): Self = this.set("isFlippedVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerListExpandedType(value: Double): Self = this.set("layerListExpandedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameIsFixed(value: Boolean): Self = this.set("nameIsFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizingConstraint(value: Double): Self = this.set("resizingConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizingType(value: SketchMSLayerResizingType): Self = this.set("resizingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldBreakMaskChain(value: Boolean): Self = this.set("shouldBreakMaskChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: SketchMSStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: SketchMSLayer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[SketchMSLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
}
