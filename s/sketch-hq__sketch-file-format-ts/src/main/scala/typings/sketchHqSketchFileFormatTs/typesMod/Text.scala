package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with AnyLayer
     with AnyObject {
  
  var _class: text
  
  var attributedString: AttributedString
  
  var automaticallyDrawOnUnderlyingPath: Boolean
  
  var booleanOperation: BooleanOperation
  
  var clippingMaskMode: js.UndefOr[Double] = js.undefined
  
  var do_objectID: Uuid
  
  var dontSynchroniseWithSymbol: Boolean
  
  var exportOptions: ExportOptions
  
  var flow: js.UndefOr[FlowConnection] = js.undefined
  
  var frame: Rect
  
  var glyphBounds: PointListString
  
  var hasClippingMask: js.UndefOr[Boolean] = js.undefined
  
  var isFixedToViewport: Boolean
  
  var isFlippedHorizontal: Boolean
  
  var isFlippedVertical: Boolean
  
  var isLocked: Boolean
  
  var isTemplate: Boolean
  
  var isVisible: Boolean
  
  var layerListExpandedType: LayerListExpanded
  
  var lineSpacingBehaviour: LineSpacingBehaviour
  
  var maintainScrollPosition: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var nameIsFixed: Boolean
  
  var resizingConstraint: Double
  
  var resizingType: ResizeType
  
  var rotation: Double
  
  var sharedStyleID: js.UndefOr[Uuid] = js.undefined
  
  var shouldBreakMaskChain: Boolean
  
  var style: js.UndefOr[Style] = js.undefined
  
  var textBehaviour: TextBehaviour
  
  var userInfo: js.UndefOr[Any] = js.undefined
}
object Text {
  
  inline def apply(
    attributedString: AttributedString,
    automaticallyDrawOnUnderlyingPath: Boolean,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    dontSynchroniseWithSymbol: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    glyphBounds: PointListString,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    lineSpacingBehaviour: LineSpacingBehaviour,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    textBehaviour: TextBehaviour
  ): Text = {
    val __obj = js.Dynamic.literal(_class = "text", attributedString = attributedString.asInstanceOf[js.Any], automaticallyDrawOnUnderlyingPath = automaticallyDrawOnUnderlyingPath.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], dontSynchroniseWithSymbol = dontSynchroniseWithSymbol.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], glyphBounds = glyphBounds.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], lineSpacingBehaviour = lineSpacingBehaviour.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], textBehaviour = textBehaviour.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setAttributedString(value: AttributedString): Self = StObject.set(x, "attributedString", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyDrawOnUnderlyingPath(value: Boolean): Self = StObject.set(x, "automaticallyDrawOnUnderlyingPath", value.asInstanceOf[js.Any])
    
    inline def setBooleanOperation(value: BooleanOperation): Self = StObject.set(x, "booleanOperation", value.asInstanceOf[js.Any])
    
    inline def setClippingMaskMode(value: Double): Self = StObject.set(x, "clippingMaskMode", value.asInstanceOf[js.Any])
    
    inline def setClippingMaskModeUndefined: Self = StObject.set(x, "clippingMaskMode", js.undefined)
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setDontSynchroniseWithSymbol(value: Boolean): Self = StObject.set(x, "dontSynchroniseWithSymbol", value.asInstanceOf[js.Any])
    
    inline def setExportOptions(value: ExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: FlowConnection): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setFrame(value: Rect): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setGlyphBounds(value: PointListString): Self = StObject.set(x, "glyphBounds", value.asInstanceOf[js.Any])
    
    inline def setHasClippingMask(value: Boolean): Self = StObject.set(x, "hasClippingMask", value.asInstanceOf[js.Any])
    
    inline def setHasClippingMaskUndefined: Self = StObject.set(x, "hasClippingMask", js.undefined)
    
    inline def setIsFixedToViewport(value: Boolean): Self = StObject.set(x, "isFixedToViewport", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedHorizontal(value: Boolean): Self = StObject.set(x, "isFlippedHorizontal", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedVertical(value: Boolean): Self = StObject.set(x, "isFlippedVertical", value.asInstanceOf[js.Any])
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsTemplate(value: Boolean): Self = StObject.set(x, "isTemplate", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setLayerListExpandedType(value: LayerListExpanded): Self = StObject.set(x, "layerListExpandedType", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingBehaviour(value: LineSpacingBehaviour): Self = StObject.set(x, "lineSpacingBehaviour", value.asInstanceOf[js.Any])
    
    inline def setMaintainScrollPosition(value: Boolean): Self = StObject.set(x, "maintainScrollPosition", value.asInstanceOf[js.Any])
    
    inline def setMaintainScrollPositionUndefined: Self = StObject.set(x, "maintainScrollPosition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameIsFixed(value: Boolean): Self = StObject.set(x, "nameIsFixed", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Double): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setResizingType(value: ResizeType): Self = StObject.set(x, "resizingType", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSharedStyleID(value: Uuid): Self = StObject.set(x, "sharedStyleID", value.asInstanceOf[js.Any])
    
    inline def setSharedStyleIDUndefined: Self = StObject.set(x, "sharedStyleID", js.undefined)
    
    inline def setShouldBreakMaskChain(value: Boolean): Self = StObject.set(x, "shouldBreakMaskChain", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextBehaviour(value: TextBehaviour): Self = StObject.set(x, "textBehaviour", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    
    inline def set_class(value: text): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
