package typings.sketchapp

import typings.sketchapp.sketchappStrings.symbolMaster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSSymbolMasterLayer extends SketchMSPageLayer {
  
  @JSName("_class")
  var _class_SketchMSSymbolMasterLayer: symbolMaster = js.native
  
  var backgroundColor: SketchMSColor = js.native
  
  var changeIdentifier: Double = js.native
  
  var hasBackgroundColor: Boolean = js.native
  
  var includeBackgroundColorInExport: Boolean = js.native
  
  var includeBackgroundColorInInstance: Boolean = js.native
  
  var isFlowHome: Boolean = js.native
  
  var resizesContent: Boolean = js.native
  
  var symbolID: String = js.native
}
object SketchMSSymbolMasterLayer {
  
  @scala.inline
  def apply(
    _class: symbolMaster,
    backgroundColor: SketchMSColor,
    booleanOperation: SketchMSLayerBooleanOperation,
    changeIdentifier: Double,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasBackgroundColor: Boolean,
    hasClickThrough: Boolean,
    hasClippingMask: Boolean,
    horizontalRulerData: SketchMSRulerData,
    includeBackgroundColorInExport: Boolean,
    includeBackgroundColorInInstance: Boolean,
    includeInCloudUpload: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isFlowHome: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    layers: js.Array[SketchMSContainerLayer],
    name: String,
    nameIsFixed: Boolean,
    resizesContent: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    symbolID: String,
    verticalRulerData: SketchMSRulerData
  ): SketchMSSymbolMasterLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], changeIdentifier = changeIdentifier.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeBackgroundColorInExport = includeBackgroundColorInExport.asInstanceOf[js.Any], includeBackgroundColorInInstance = includeBackgroundColorInInstance.asInstanceOf[js.Any], includeInCloudUpload = includeInCloudUpload.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isFlowHome = isFlowHome.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizesContent = resizesContent.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSymbolMasterLayer]
  }
  
  @scala.inline
  implicit class SketchMSSymbolMasterLayerMutableBuilder[Self <: SketchMSSymbolMasterLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: SketchMSColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeIdentifier(value: Double): Self = StObject.set(x, "changeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackgroundColor(value: Boolean): Self = StObject.set(x, "hasBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBackgroundColorInExport(value: Boolean): Self = StObject.set(x, "includeBackgroundColorInExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBackgroundColorInInstance(value: Boolean): Self = StObject.set(x, "includeBackgroundColorInInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlowHome(value: Boolean): Self = StObject.set(x, "isFlowHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizesContent(value: Boolean): Self = StObject.set(x, "resizesContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolID(value: String): Self = StObject.set(x, "symbolID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: symbolMaster): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
