package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.anon.Data
import typings.sketchHqSketchFileFormatTs.anon.Kerning
import typings.sketchHqSketchFileFormatTs.anon.MSAttributedStringColorAttribute
import typings.sketchHqSketchFileFormatTs.anon.Name
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSFontData
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImageData
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutablePage
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSPatch
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.automatic
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.back
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sketchHqSketchFileFormatTs.typesMod.AssetCollection
  - typings.sketchHqSketchFileFormatTs.typesMod.ImageCollection
  - typings.sketchHqSketchFileFormatTs.typesMod.ColorAsset
  - typings.sketchHqSketchFileFormatTs.typesMod.Color
  - typings.sketchHqSketchFileFormatTs.typesMod.GradientAsset
  - typings.sketchHqSketchFileFormatTs.typesMod.Gradient
  - typings.sketchHqSketchFileFormatTs.typesMod.GradientStop
  - typings.sketchHqSketchFileFormatTs.typesMod.FileRef
  - typings.sketchHqSketchFileFormatTs.typesMod.DataRef
  - typings.sketchHqSketchFileFormatTs.typesMod.ForeignLayerStyle
  - typings.sketchHqSketchFileFormatTs.typesMod.SharedStyle
  - typings.sketchHqSketchFileFormatTs.typesMod.Style
  - typings.sketchHqSketchFileFormatTs.typesMod.Border
  - typings.sketchHqSketchFileFormatTs.typesMod.GraphicsContextSettings
  - typings.sketchHqSketchFileFormatTs.typesMod.BorderOptions
  - typings.sketchHqSketchFileFormatTs.typesMod.Blur
  - typings.sketchHqSketchFileFormatTs.typesMod.Fill
  - typings.sketchHqSketchFileFormatTs.typesMod.TextStyle
  - typings.sketchHqSketchFileFormatTs.typesMod.ParagraphStyle
  - typings.sketchHqSketchFileFormatTs.typesMod.FontDescriptor
  - typings.sketchHqSketchFileFormatTs.typesMod.Shadow
  - typings.sketchHqSketchFileFormatTs.typesMod.InnerShadow
  - typings.sketchHqSketchFileFormatTs.typesMod.ColorControls
  - typings.sketchHqSketchFileFormatTs.typesMod.ForeignSymbol
  - typings.sketchHqSketchFileFormatTs.typesMod.SymbolMaster
  - typings.sketchHqSketchFileFormatTs.typesMod.ExportOptions
  - typings.sketchHqSketchFileFormatTs.typesMod.ExportFormat
  - typings.sketchHqSketchFileFormatTs.typesMod.Rect
  - typings.sketchHqSketchFileFormatTs.typesMod.FlowConnection
  - typings.sketchHqSketchFileFormatTs.typesMod.RulerData
  - typings.sketchHqSketchFileFormatTs.typesMod.LayoutGrid
  - typings.sketchHqSketchFileFormatTs.typesMod.SimpleGrid
  - typings.sketchHqSketchFileFormatTs.typesMod.FreeformGroupLayout
  - typings.sketchHqSketchFileFormatTs.typesMod.InferredGroupLayout
  - typings.sketchHqSketchFileFormatTs.typesMod.OverrideProperty
  - typings.sketchHqSketchFileFormatTs.typesMod.Group
  - typings.sketchHqSketchFileFormatTs.typesMod.Oval
  - typings.sketchHqSketchFileFormatTs.typesMod.CurvePoint
  - typings.sketchHqSketchFileFormatTs.typesMod.Polygon
  - typings.sketchHqSketchFileFormatTs.typesMod.Rectangle
  - typings.sketchHqSketchFileFormatTs.typesMod.ShapePath
  - typings.sketchHqSketchFileFormatTs.typesMod.Star
  - typings.sketchHqSketchFileFormatTs.typesMod.Triangle
  - typings.sketchHqSketchFileFormatTs.typesMod.ShapeGroup
  - typings.sketchHqSketchFileFormatTs.typesMod.Text
  - typings.sketchHqSketchFileFormatTs.typesMod.AttributedString
  - typings.sketchHqSketchFileFormatTs.typesMod.StringAttribute
  - typings.sketchHqSketchFileFormatTs.typesMod.SymbolInstance
  - typings.sketchHqSketchFileFormatTs.typesMod.OverrideValue
  - typings.sketchHqSketchFileFormatTs.typesMod.Slice
  - typings.sketchHqSketchFileFormatTs.typesMod.Hotspot
  - typings.sketchHqSketchFileFormatTs.typesMod.Bitmap
  - typings.sketchHqSketchFileFormatTs.typesMod.ForeignTextStyle
  - typings.sketchHqSketchFileFormatTs.typesMod.ForeignSwatch
  - typings.sketchHqSketchFileFormatTs.typesMod.Swatch
  - typings.sketchHqSketchFileFormatTs.typesMod.SharedStyleContainer
  - typings.sketchHqSketchFileFormatTs.typesMod.SharedTextStyleContainer
  - typings.sketchHqSketchFileFormatTs.typesMod.SymbolContainer
  - typings.sketchHqSketchFileFormatTs.typesMod.SwatchContainer
  - typings.sketchHqSketchFileFormatTs.typesMod.FontRef
  - typings.sketchHqSketchFileFormatTs.typesMod.PatchInfo
  - typings.sketchHqSketchFileFormatTs.typesMod.Page
  - typings.sketchHqSketchFileFormatTs.typesMod.Artboard
  - typings.sketchHqSketchFileFormatTs.typesMod.PrototypeViewport
*/
trait AnyObject extends StObject
object AnyObject {
  
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
  
  inline def AssetCollection(
    colorAssets: js.Array[ColorAsset],
    colors: js.Array[Color],
    do_objectID: Uuid,
    exportPresets: js.Array[Any],
    gradientAssets: js.Array[GradientAsset],
    gradients: js.Array[Gradient],
    images: js.Array[FileRef | DataRef]
  ): typings.sketchHqSketchFileFormatTs.typesMod.AssetCollection = {
    val __obj = js.Dynamic.literal(_class = "assetCollection", colorAssets = colorAssets.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportPresets = exportPresets.asInstanceOf[js.Any], gradientAssets = gradientAssets.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.AssetCollection]
  }
  
  inline def AttributedString(attributes: js.Array[StringAttribute], string: String): typings.sketchHqSketchFileFormatTs.typesMod.AttributedString = {
    val __obj = js.Dynamic.literal(_class = "attributedString", attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.AttributedString]
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
  
  inline def Blur(center: PointString, isEnabled: Boolean, saturation: Double, `type`: BlurType): typings.sketchHqSketchFileFormatTs.typesMod.Blur = {
    val __obj = js.Dynamic.literal(_class = "blur", center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Blur]
  }
  
  inline def Border(
    color: Color,
    contextSettings: GraphicsContextSettings,
    fillType: FillType,
    gradient: Gradient,
    isEnabled: Boolean,
    position: BorderPosition,
    thickness: Double
  ): typings.sketchHqSketchFileFormatTs.typesMod.Border = {
    val __obj = js.Dynamic.literal(_class = "border", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Border]
  }
  
  inline def BorderOptions(
    dashPattern: js.Array[Double],
    isEnabled: Boolean,
    lineCapStyle: LineCapStyle,
    lineJoinStyle: LineJoinStyle
  ): typings.sketchHqSketchFileFormatTs.typesMod.BorderOptions = {
    val __obj = js.Dynamic.literal(_class = "borderOptions", dashPattern = dashPattern.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lineCapStyle = lineCapStyle.asInstanceOf[js.Any], lineJoinStyle = lineJoinStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.BorderOptions]
  }
  
  inline def Color(alpha: UnitInterval, blue: UnitInterval, green: UnitInterval, red: UnitInterval): typings.sketchHqSketchFileFormatTs.typesMod.Color = {
    val __obj = js.Dynamic.literal(_class = "color", alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Color]
  }
  
  inline def ColorAsset(color: Color, do_objectID: Uuid, name: String): typings.sketchHqSketchFileFormatTs.typesMod.ColorAsset = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableColorAsset", color = color.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ColorAsset]
  }
  
  inline def ColorControls(brightness: Double, contrast: Double, hue: Double, isEnabled: Boolean, saturation: Double): typings.sketchHqSketchFileFormatTs.typesMod.ColorControls = {
    val __obj = js.Dynamic.literal(_class = "colorControls", brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ColorControls]
  }
  
  inline def CurvePoint(
    cornerRadius: Double,
    cornerStyle: CornerStyle,
    curveFrom: PointString,
    curveMode: CurveMode,
    curveTo: PointString,
    hasCurveFrom: Boolean,
    hasCurveTo: Boolean,
    point: PointString
  ): typings.sketchHqSketchFileFormatTs.typesMod.CurvePoint = {
    val __obj = js.Dynamic.literal(_class = "curvePoint", cornerRadius = cornerRadius.asInstanceOf[js.Any], cornerStyle = cornerStyle.asInstanceOf[js.Any], curveFrom = curveFrom.asInstanceOf[js.Any], curveMode = curveMode.asInstanceOf[js.Any], curveTo = curveTo.asInstanceOf[js.Any], hasCurveFrom = hasCurveFrom.asInstanceOf[js.Any], hasCurveTo = hasCurveTo.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.CurvePoint]
  }
  
  inline def DataRef(_ref: String, _ref_class: MSImageData | MSFontData, data: Data, sha1: Data): typings.sketchHqSketchFileFormatTs.typesMod.DataRef = {
    val __obj = js.Dynamic.literal(_class = "MSJSONOriginalDataReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.DataRef]
  }
  
  inline def ExportFormat(
    absoluteSize: Double,
    fileFormat: ExportFileFormat,
    name: String,
    scale: Double,
    visibleScaleType: VisibleScaleType
  ): typings.sketchHqSketchFileFormatTs.typesMod.ExportFormat = {
    val __obj = js.Dynamic.literal(_class = "exportFormat", absoluteSize = absoluteSize.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], visibleScaleType = visibleScaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ExportFormat]
  }
  
  inline def ExportOptions(
    exportFormats: js.Array[ExportFormat],
    includedLayerIds: js.Array[Uuid],
    layerOptions: Double,
    shouldTrim: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.ExportOptions = {
    val __obj = js.Dynamic.literal(_class = "exportOptions", exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ExportOptions]
  }
  
  inline def FileRef(_ref: String, _ref_class: MSImageData | MSImmutablePage | MSPatch): typings.sketchHqSketchFileFormatTs.typesMod.FileRef = {
    val __obj = js.Dynamic.literal(_class = "MSJSONFileReference", _ref = _ref.asInstanceOf[js.Any], _ref_class = _ref_class.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.FileRef]
  }
  
  inline def Fill(
    color: Color,
    contextSettings: GraphicsContextSettings,
    fillType: FillType,
    gradient: Gradient,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: PatternFillType,
    patternTileScale: Double
  ): typings.sketchHqSketchFileFormatTs.typesMod.Fill = {
    val __obj = js.Dynamic.literal(_class = "fill", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Fill]
  }
  
  inline def FlowConnection(animationType: AnimationType, destinationArtboardID: Uuid | back | automatic): typings.sketchHqSketchFileFormatTs.typesMod.FlowConnection = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableFlowConnection", animationType = animationType.asInstanceOf[js.Any], destinationArtboardID = destinationArtboardID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.FlowConnection]
  }
  
  inline def FontDescriptor(attributes: Name): typings.sketchHqSketchFileFormatTs.typesMod.FontDescriptor = {
    val __obj = js.Dynamic.literal(_class = "fontDescriptor", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.FontDescriptor]
  }
  
  inline def FontRef(
    fontData: DataRef,
    fontFamilyName: String,
    fontFileName: String,
    options: Double,
    postscriptNames: js.Array[String]
  ): typings.sketchHqSketchFileFormatTs.typesMod.FontRef = {
    val __obj = js.Dynamic.literal(_class = "fontReference", fontData = fontData.asInstanceOf[js.Any], fontFamilyName = fontFamilyName.asInstanceOf[js.Any], fontFileName = fontFileName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], postscriptNames = postscriptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.FontRef]
  }
  
  inline def ForeignLayerStyle(
    do_objectID: Uuid,
    libraryID: Uuid,
    localSharedStyle: SharedStyle,
    remoteStyleID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.ForeignLayerStyle = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignLayerStyle", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], localSharedStyle = localSharedStyle.asInstanceOf[js.Any], remoteStyleID = remoteStyleID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ForeignLayerStyle]
  }
  
  inline def ForeignSwatch(
    do_objectID: Uuid,
    libraryID: Uuid,
    localSwatch: Swatch,
    remoteSwatchID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.ForeignSwatch = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSwatch", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], localSwatch = localSwatch.asInstanceOf[js.Any], remoteSwatchID = remoteSwatchID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ForeignSwatch]
  }
  
  inline def ForeignSymbol(
    do_objectID: Uuid,
    libraryID: Uuid,
    originalMaster: SymbolMaster,
    sourceLibraryName: String,
    symbolMaster: SymbolMaster,
    symbolPrivate: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.ForeignSymbol = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignSymbol", do_objectID = do_objectID.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], originalMaster = originalMaster.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolMaster = symbolMaster.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ForeignSymbol]
  }
  
  inline def ForeignTextStyle(
    libraryID: Uuid,
    localSharedStyle: SharedStyle,
    remoteStyleID: Uuid,
    sourceLibraryName: String,
    symbolPrivate: Boolean
  ): typings.sketchHqSketchFileFormatTs.typesMod.ForeignTextStyle = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableForeignTextStyle", libraryID = libraryID.asInstanceOf[js.Any], localSharedStyle = localSharedStyle.asInstanceOf[js.Any], remoteStyleID = remoteStyleID.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ForeignTextStyle]
  }
  
  inline def FreeformGroupLayout(): typings.sketchHqSketchFileFormatTs.typesMod.FreeformGroupLayout = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableFreeformGroupLayout")
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.FreeformGroupLayout]
  }
  
  inline def Gradient(
    elipseLength: Double,
    from: PointString,
    gradientType: GradientType,
    stops: js.Array[GradientStop],
    to: PointString
  ): typings.sketchHqSketchFileFormatTs.typesMod.Gradient = {
    val __obj = js.Dynamic.literal(_class = "gradient", elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Gradient]
  }
  
  inline def GradientAsset(do_objectID: Uuid, gradient: Gradient, name: String): typings.sketchHqSketchFileFormatTs.typesMod.GradientAsset = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableGradientAsset", do_objectID = do_objectID.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.GradientAsset]
  }
  
  inline def GradientStop(color: Color, position: UnitInterval): typings.sketchHqSketchFileFormatTs.typesMod.GradientStop = {
    val __obj = js.Dynamic.literal(_class = "gradientStop", color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.GradientStop]
  }
  
  inline def GraphicsContextSettings(blendMode: BlendMode, opacity: Double): typings.sketchHqSketchFileFormatTs.typesMod.GraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = "graphicsContextSettings", blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.GraphicsContextSettings]
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
  
  inline def ImageCollection(images: Any): typings.sketchHqSketchFileFormatTs.typesMod.ImageCollection = {
    val __obj = js.Dynamic.literal(_class = "imageCollection", images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ImageCollection]
  }
  
  inline def InferredGroupLayout(axis: InferredLayoutAxis, layoutAnchor: InferredLayoutAnchor): typings.sketchHqSketchFileFormatTs.typesMod.InferredGroupLayout = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableInferredGroupLayout", axis = axis.asInstanceOf[js.Any], layoutAnchor = layoutAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.InferredGroupLayout]
  }
  
  inline def InnerShadow(
    blurRadius: Double,
    color: Color,
    contextSettings: GraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): typings.sketchHqSketchFileFormatTs.typesMod.InnerShadow = {
    val __obj = js.Dynamic.literal(_class = "innerShadow", blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.InnerShadow]
  }
  
  inline def LayoutGrid(
    columnWidth: Double,
    drawHorizontal: Boolean,
    drawHorizontalLines: Boolean,
    drawVertical: Boolean,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Boolean,
    horizontalOffset: Double,
    isEnabled: Boolean,
    numberOfColumns: Double,
    rowHeightMultiplication: Double,
    totalWidth: Double
  ): typings.sketchHqSketchFileFormatTs.typesMod.LayoutGrid = {
    val __obj = js.Dynamic.literal(_class = "layoutGrid", columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.LayoutGrid]
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
  
  inline def OverrideProperty(canOverride: Boolean, overrideName: OverrideName): typings.sketchHqSketchFileFormatTs.typesMod.OverrideProperty = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableOverrideProperty", canOverride = canOverride.asInstanceOf[js.Any], overrideName = overrideName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.OverrideProperty]
  }
  
  inline def OverrideValue(overrideName: OverrideName, value: String | Uuid | FileRef | DataRef): typings.sketchHqSketchFileFormatTs.typesMod.OverrideValue = {
    val __obj = js.Dynamic.literal(_class = "overrideValue", overrideName = overrideName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.OverrideValue]
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
  
  inline def ParagraphStyle(): typings.sketchHqSketchFileFormatTs.typesMod.ParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = "paragraphStyle")
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.ParagraphStyle]
  }
  
  inline def PatchInfo(
    baseVersionID: Uuid,
    lastIntegratedPatchID: Uuid,
    localPatches: js.Array[FileRef],
    receivedPatches: js.Array[FileRef]
  ): typings.sketchHqSketchFileFormatTs.typesMod.PatchInfo = {
    val __obj = js.Dynamic.literal(_class = "MSImmutablePatchInfo", baseVersionID = baseVersionID.asInstanceOf[js.Any], lastIntegratedPatchID = lastIntegratedPatchID.asInstanceOf[js.Any], localPatches = localPatches.asInstanceOf[js.Any], receivedPatches = receivedPatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.PatchInfo]
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
  
  inline def PrototypeViewport(name: String, size: SizeString): typings.sketchHqSketchFileFormatTs.typesMod.PrototypeViewport = {
    val __obj = js.Dynamic.literal(_class = "MSImmutablePrototypeViewport", name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.PrototypeViewport]
  }
  
  inline def Rect(constrainProportions: Boolean, height: Double, width: Double, x: Double, y: Double): typings.sketchHqSketchFileFormatTs.typesMod.Rect = {
    val __obj = js.Dynamic.literal(_class = "rect", constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Rect]
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
  
  inline def RulerData(base: Double, guides: js.Array[Double]): typings.sketchHqSketchFileFormatTs.typesMod.RulerData = {
    val __obj = js.Dynamic.literal(_class = "rulerData", base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.RulerData]
  }
  
  inline def Shadow(
    blurRadius: Double,
    color: Color,
    contextSettings: GraphicsContextSettings,
    isEnabled: Boolean,
    offsetX: Double,
    offsetY: Double,
    spread: Double
  ): typings.sketchHqSketchFileFormatTs.typesMod.Shadow = {
    val __obj = js.Dynamic.literal(_class = "shadow", blurRadius = blurRadius.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Shadow]
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
  
  inline def SharedStyle(do_objectID: Uuid, name: String, value: Style): typings.sketchHqSketchFileFormatTs.typesMod.SharedStyle = {
    val __obj = js.Dynamic.literal(_class = "sharedStyle", do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SharedStyle]
  }
  
  inline def SharedStyleContainer(objects: js.Array[SharedStyle]): typings.sketchHqSketchFileFormatTs.typesMod.SharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SharedStyleContainer]
  }
  
  inline def SharedTextStyleContainer(objects: js.Array[SharedStyle]): typings.sketchHqSketchFileFormatTs.typesMod.SharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedTextStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SharedTextStyleContainer]
  }
  
  inline def SimpleGrid(gridSize: Double, isEnabled: Boolean, thickGridTimes: Double): typings.sketchHqSketchFileFormatTs.typesMod.SimpleGrid = {
    val __obj = js.Dynamic.literal(_class = "simpleGrid", gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SimpleGrid]
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
  
  inline def StringAttribute(attributes: MSAttributedStringColorAttribute, length: Double, location: Double): typings.sketchHqSketchFileFormatTs.typesMod.StringAttribute = {
    val __obj = js.Dynamic.literal(_class = "stringAttribute", attributes = attributes.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.StringAttribute]
  }
  
  inline def Style(
    borderOptions: BorderOptions,
    colorControls: ColorControls,
    do_objectID: Uuid,
    endMarkerType: MarkerType,
    innerShadows: js.Array[InnerShadow],
    miterLimit: Double,
    startMarkerType: MarkerType,
    windingRule: WindingRule
  ): typings.sketchHqSketchFileFormatTs.typesMod.Style = {
    val __obj = js.Dynamic.literal(_class = "style", borderOptions = borderOptions.asInstanceOf[js.Any], colorControls = colorControls.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], endMarkerType = endMarkerType.asInstanceOf[js.Any], innerShadows = innerShadows.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], startMarkerType = startMarkerType.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Style]
  }
  
  inline def Swatch(do_objectID: Uuid, name: String, value: Color): typings.sketchHqSketchFileFormatTs.typesMod.Swatch = {
    val __obj = js.Dynamic.literal(_class = "swatch", do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.Swatch]
  }
  
  inline def SwatchContainer(objects: js.Array[Swatch]): typings.sketchHqSketchFileFormatTs.typesMod.SwatchContainer = {
    val __obj = js.Dynamic.literal(_class = "swatchContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SwatchContainer]
  }
  
  inline def SymbolContainer(objects: js.Array[Any]): typings.sketchHqSketchFileFormatTs.typesMod.SymbolContainer = {
    val __obj = js.Dynamic.literal(_class = "symbolContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.SymbolContainer]
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
  
  inline def TextStyle(encodedAttributes: Kerning, verticalAlignment: TextVerticalAlignment): typings.sketchHqSketchFileFormatTs.typesMod.TextStyle = {
    val __obj = js.Dynamic.literal(_class = "textStyle", encodedAttributes = encodedAttributes.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchHqSketchFileFormatTs.typesMod.TextStyle]
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
