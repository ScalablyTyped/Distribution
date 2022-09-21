package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sketchHqSketchFileFormatTs.typesMod.SymbolMaster
  - typings.sketchHqSketchFileFormatTs.typesMod.Group
  - typings.sketchHqSketchFileFormatTs.typesMod.Oval
  - typings.sketchHqSketchFileFormatTs.typesMod.Polygon
  - typings.sketchHqSketchFileFormatTs.typesMod.Rectangle
  - typings.sketchHqSketchFileFormatTs.typesMod.ShapePath
  - typings.sketchHqSketchFileFormatTs.typesMod.Star
  - typings.sketchHqSketchFileFormatTs.typesMod.Triangle
  - typings.sketchHqSketchFileFormatTs.typesMod.ShapeGroup
  - typings.sketchHqSketchFileFormatTs.typesMod.Text
  - typings.sketchHqSketchFileFormatTs.typesMod.SymbolInstance
  - typings.sketchHqSketchFileFormatTs.typesMod.Slice
  - typings.sketchHqSketchFileFormatTs.typesMod.Hotspot
  - typings.sketchHqSketchFileFormatTs.typesMod.Bitmap
  - typings.sketchHqSketchFileFormatTs.typesMod.Page
  - typings.sketchHqSketchFileFormatTs.typesMod.Artboard
*/
trait AnyLayer extends StObject
object AnyLayer {
  
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
  
  inline def Bitmap(
    booleanOperation: BooleanOperation,
    clippingMask: PointListString,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    fillReplacesImage: Boolean,
    frame: Rect,
    image: FileRef | DataRef,
    intendedDPI: Double,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Bitmap = {
    val __obj = js.Dynamic.literal(_class = "bitmap", booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMask = clippingMask.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], fillReplacesImage = fillReplacesImage.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], intendedDPI = intendedDPI.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Bitmap]
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
  
  inline def Hotspot(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Hotspot = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableHotspotLayer", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Hotspot]
  }
  
  inline def Oval(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Oval = {
    val __obj = js.Dynamic.literal(_class = "oval", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Oval]
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
  
  inline def Polygon(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    numberOfPoints: Double,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Polygon = {
    val __obj = js.Dynamic.literal(_class = "polygon", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], numberOfPoints = numberOfPoints.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Polygon]
  }
  
  inline def Rectangle(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    fixedRadius: Double,
    frame: Rect,
    hasConvertedToNewRoundCorners: Boolean,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    needsConvertionToNewRoundCorners: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Rectangle = {
    val __obj = js.Dynamic.literal(_class = "rectangle", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], fixedRadius = fixedRadius.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasConvertedToNewRoundCorners = hasConvertedToNewRoundCorners.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], needsConvertionToNewRoundCorners = needsConvertionToNewRoundCorners.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Rectangle]
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
  
  inline def ShapePath(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.ShapePath = {
    val __obj = js.Dynamic.literal(_class = "shapePath", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ShapePath]
  }
  
  inline def Slice(
    backgroundColor: Color,
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    hasBackgroundColor: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Slice = {
    val __obj = js.Dynamic.literal(_class = "slice", backgroundColor = backgroundColor.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Slice]
  }
  
  inline def Star(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    numberOfPoints: Double,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    radius: Double,
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Star = {
    val __obj = js.Dynamic.literal(_class = "star", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], numberOfPoints = numberOfPoints.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Star]
  }
  
  inline def SymbolInstance(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    exportOptions: ExportOptions,
    frame: Rect,
    horizontalSpacing: Double,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    overrideValues: js.Array[OverrideValue],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    scale: Double,
    shouldBreakMaskChain: Boolean,
    symbolID: Uuid,
    verticalSpacing: Double
  ): typings.sketchHqSketchFileFormatTs.typesMod.SymbolInstance = {
    val __obj = js.Dynamic.literal(_class = "symbolInstance", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], horizontalSpacing = horizontalSpacing.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], overrideValues = overrideValues.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any], verticalSpacing = verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SymbolInstance]
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
  
  inline def Text(
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
  ): typings.sketchHqSketchFileFormatTs.typesMod.Text = {
    val __obj = js.Dynamic.literal(_class = "text", attributedString = attributedString.asInstanceOf[js.Any], automaticallyDrawOnUnderlyingPath = automaticallyDrawOnUnderlyingPath.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], dontSynchroniseWithSymbol = dontSynchroniseWithSymbol.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], glyphBounds = glyphBounds.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], lineSpacingBehaviour = lineSpacingBehaviour.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], textBehaviour = textBehaviour.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Text]
  }
  
  inline def Triangle(
    booleanOperation: BooleanOperation,
    do_objectID: Uuid,
    edited: Boolean,
    exportOptions: ExportOptions,
    frame: Rect,
    isClosed: Boolean,
    isEquilateral: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isTemplate: Boolean,
    isVisible: Boolean,
    layerListExpandedType: LayerListExpanded,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: PointsRadiusBehaviour,
    points: js.Array[CurvePoint],
    resizingConstraint: Double,
    resizingType: ResizeType,
    rotation: Double,
    shouldBreakMaskChain: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.Triangle = {
    val __obj = js.Dynamic.literal(_class = "triangle", booleanOperation = booleanOperation.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isEquilateral = isEquilateral.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isTemplate = isTemplate.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Triangle]
  }
}
