package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sketchHqSketchFileFormatTs.typesMod.SymbolMaster
  - typings.sketchHqSketchFileFormatTs.typesMod.Group
  - typings.sketchHqSketchFileFormatTs.typesMod.ShapeGroup
  - typings.sketchHqSketchFileFormatTs.typesMod.Page
  - typings.sketchHqSketchFileFormatTs.typesMod.Artboard
*/
trait AnyGroup extends StObject
object AnyGroup {
  
  inline def Artboard(
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
  ): typings.sketchHqSketchFileFormatTs.typesMod.Artboard = {
    val __obj = js.Dynamic.literal(_class = "artboard", backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeBackgroundColorInExport = includeBackgroundColorInExport.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isFlowHome = isFlowHome.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizesContent = resizesContent.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Artboard]
  }
  
  inline def Group(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasClickThrough: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      typings.sketchHqSketchFileFormatTs.typesMod.Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Group = {
    val __obj = js.Dynamic.literal(_class = "group", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Group]
  }
  
  inline def Page(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasClickThrough: Boolean,
    horizontalRulerData: RulerData,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Artboard | Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | ShapeGroup | Text | SymbolMaster | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    verticalRulerData: RulerData
  ): typings.sketchHqSketchFileFormatTs.typesMod.Page = {
    val __obj = js.Dynamic.literal(_class = "page", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Page]
  }
  
  inline def ShapeGroup(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasClickThrough: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    layers: js.Array[
      Group | Oval | Polygon | Rectangle | ShapePath | Star | Triangle | typings.sketchHqSketchFileFormatTs.typesMod.ShapeGroup | Text | SymbolInstance | Slice | Hotspot | Bitmap
    ],
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    windingRule: WindingRule
  ): typings.sketchHqSketchFileFormatTs.typesMod.ShapeGroup = {
    val __obj = js.Dynamic.literal(_class = "shapeGroup", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ShapeGroup]
  }
  
  inline def SymbolMaster(
    allowsOverrides: Boolean,
    backgroundColor: Color,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasBackgroundColor: Boolean,
    hasClickThrough: Boolean,
    horizontalRulerData: RulerData,
    includeBackgroundColorInExport: Boolean,
    includeBackgroundColorInInstance: Boolean,
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
    overrideProperties: js.Array[OverrideProperty],
    resizesContent: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    symbolID: Uuid,
    verticalRulerData: RulerData
  ): typings.sketchHqSketchFileFormatTs.typesMod.SymbolMaster = {
    val __obj = js.Dynamic.literal(_class = "symbolMaster", allowsOverrides = allowsOverrides.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], hasClickThrough = hasClickThrough.asInstanceOf[js.Any], horizontalRulerData = horizontalRulerData.asInstanceOf[js.Any], includeBackgroundColorInExport = includeBackgroundColorInExport.asInstanceOf[js.Any], includeBackgroundColorInInstance = includeBackgroundColorInInstance.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isFlowHome = isFlowHome.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], overrideProperties = overrideProperties.asInstanceOf[js.Any], resizesContent = resizesContent.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalRulerData = verticalRulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SymbolMaster]
  }
}
