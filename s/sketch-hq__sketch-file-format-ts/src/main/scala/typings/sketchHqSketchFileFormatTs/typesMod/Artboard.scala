package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.artboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artboard
  extends StObject
     with AnyGroup
     with AnyLayer
     with AnyObject {
  
  var _class: artboard
  
  var backgroundColor: Color
  
  var booleanOperation: BooleanOperation
  
  var clippingMaskMode: js.UndefOr[Double] = js.undefined
  
  var do_objectID: Uuid
  
  var exportOptions: ExportOptions
  
  var flow: js.UndefOr[FlowConnection] = js.undefined
  
  var frame: Rect
  
  var grid: js.UndefOr[SimpleGrid] = js.undefined
  
  var groupLayout: js.UndefOr[FreeformGroupLayout | InferredGroupLayout] = js.undefined
  
  var hasBackgroundColor: Boolean
  
  var hasClickThrough: Boolean
  
  var hasClippingMask: js.UndefOr[Boolean] = js.undefined
  
  var horizontalRulerData: RulerData
  
  var includeBackgroundColorInExport: Boolean
  
  var isFixedToViewport: Boolean
  
  var isFlippedHorizontal: Boolean
  
  var isFlippedVertical: Boolean
  
  var isFlowHome: Boolean
  
  var isLocked: Boolean
  
  var isTemplate: Boolean
  
  var isVisible: Boolean
  
  var layerListExpandedType: LayerListExpanded
  
  var layers: js.Array[
    Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
  ]
  
  var layout: js.UndefOr[LayoutGrid] = js.undefined
  
  var maintainScrollPosition: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var nameIsFixed: Boolean
  
  var prototypeViewport: js.UndefOr[PrototypeViewport] = js.undefined
  
  var resizesContent: Boolean
  
  var resizingConstraint: Double
  
  var resizingType: ResizeType
  
  var rotation: Double
  
  var sharedStyleID: js.UndefOr[Uuid] = js.undefined
  
  var shouldBreakMaskChain: Boolean
  
  var style: js.UndefOr[Style] = js.undefined
  
  var userInfo: js.UndefOr[Any] = js.undefined
  
  var verticalRulerData: RulerData
}
object Artboard {
  
  inline def apply(
    backgroundColor: Color,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasBackgroundColor: Boolean,
    hasClickThrough: Boolean,
    horizontalRulerData: RulerData,
    includeBackgroundColorInExport: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isFlowHome: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizesContent: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    verticalRulerData: RulerData
  ): Artboard = {
    val __obj = js.Dynamic.literal(_class = "artboard", backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeBackgroundColorInExport = includeBackgroundColorInExport.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isFlowHome = isFlowHome.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizesContent = resizesContent.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artboard]
  }
  
  extension [Self <: Artboard](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBooleanOperation(value: BooleanOperation): Self = StObject.set(x, "booleanOperation", value.asInstanceOf[js.Any])
    
    inline def setClippingMaskMode(value: Double): Self = StObject.set(x, "clippingMaskMode", value.asInstanceOf[js.Any])
    
    inline def setClippingMaskModeUndefined: Self = StObject.set(x, "clippingMaskMode", js.undefined)
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setExportOptions(value: ExportOptions): Self = StObject.set(x, "exportOptions", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: FlowConnection): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setFrame(value: Rect): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: SimpleGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGroupLayout(value: FreeformGroupLayout | InferredGroupLayout): Self = StObject.set(x, "groupLayout", value.asInstanceOf[js.Any])
    
    inline def setGroupLayoutUndefined: Self = StObject.set(x, "groupLayout", js.undefined)
    
    inline def setHasBackgroundColor(value: Boolean): Self = StObject.set(x, "hasBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHasClickThrough(value: Boolean): Self = StObject.set(x, "hasClickThrough", value.asInstanceOf[js.Any])
    
    inline def setHasClippingMask(value: Boolean): Self = StObject.set(x, "hasClippingMask", value.asInstanceOf[js.Any])
    
    inline def setHasClippingMaskUndefined: Self = StObject.set(x, "hasClippingMask", js.undefined)
    
    inline def setHorizontalRulerData(value: RulerData): Self = StObject.set(x, "horizontalRulerData", value.asInstanceOf[js.Any])
    
    inline def setIncludeBackgroundColorInExport(value: Boolean): Self = StObject.set(x, "includeBackgroundColorInExport", value.asInstanceOf[js.Any])
    
    inline def setIsFixedToViewport(value: Boolean): Self = StObject.set(x, "isFixedToViewport", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedHorizontal(value: Boolean): Self = StObject.set(x, "isFlippedHorizontal", value.asInstanceOf[js.Any])
    
    inline def setIsFlippedVertical(value: Boolean): Self = StObject.set(x, "isFlippedVertical", value.asInstanceOf[js.Any])
    
    inline def setIsFlowHome(value: Boolean): Self = StObject.set(x, "isFlowHome", value.asInstanceOf[js.Any])
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsTemplate(value: Boolean): Self = StObject.set(x, "isTemplate", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setLayerListExpandedType(value: LayerListExpanded): Self = StObject.set(x, "layerListExpandedType", value.asInstanceOf[js.Any])
    
    inline def setLayers(
      value: js.Array[
          Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
        ]
    ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(
      value: (Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap)*
    ): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLayout(value: LayoutGrid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaintainScrollPosition(value: Boolean): Self = StObject.set(x, "maintainScrollPosition", value.asInstanceOf[js.Any])
    
    inline def setMaintainScrollPositionUndefined: Self = StObject.set(x, "maintainScrollPosition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameIsFixed(value: Boolean): Self = StObject.set(x, "nameIsFixed", value.asInstanceOf[js.Any])
    
    inline def setPrototypeViewport(value: PrototypeViewport): Self = StObject.set(x, "prototypeViewport", value.asInstanceOf[js.Any])
    
    inline def setPrototypeViewportUndefined: Self = StObject.set(x, "prototypeViewport", js.undefined)
    
    inline def setResizesContent(value: Boolean): Self = StObject.set(x, "resizesContent", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Double): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setResizingType(value: ResizeType): Self = StObject.set(x, "resizingType", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSharedStyleID(value: Uuid): Self = StObject.set(x, "sharedStyleID", value.asInstanceOf[js.Any])
    
    inline def setSharedStyleIDUndefined: Self = StObject.set(x, "sharedStyleID", js.undefined)
    
    inline def setShouldBreakMaskChain(value: Boolean): Self = StObject.set(x, "shouldBreakMaskChain", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUserInfo(value: Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    
    inline def setVerticalRulerData(value: RulerData): Self = StObject.set(x, "verticalRulerData", value.asInstanceOf[js.Any])
    
    inline def set_class(value: artboard): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
