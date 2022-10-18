package typings.sketchHqSketchFileFormatTs

import org.scalablytyped.runtime.StringDictionary
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.AssetCollection
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.Color
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ColorSpace
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.DocumentState
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.FontDescriptor
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.FontRef
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignLayerStyle
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSwatch
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignSymbol
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ForeignTextStyle
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.NumericalBool
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.Page
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.ParagraphStyle
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.PatchInfo
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedStyleContainer
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.SharedTextStyleContainer
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.SketchVariant
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.StrikethroughStyle
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.SwatchContainer
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.SymbolContainer
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextTransform
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.TextVerticalAlignment
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.UnderlineStyle
import typings.sketchHqSketchFileFormatTs.distCjsTypesMod.Uuid
import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait App extends StObject {
    
    var app: BundleId
    
    var appVersion: String
    
    var build: Double
    
    var coeditCompatibilityVersion: js.UndefOr[Double] = js.undefined
    
    var commit: String
    
    var compatibilityVersion: Double
    
    var variant: SketchVariant
    
    var version: Double
  }
  object App {
    
    inline def apply(
      app: BundleId,
      appVersion: String,
      build: Double,
      commit: String,
      compatibilityVersion: Double,
      variant: SketchVariant,
      version: Double
    ): App = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    extension [Self <: App](x: Self) {
      
      inline def setApp(value: BundleId): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setCoeditCompatibilityVersion(value: Double): Self = StObject.set(x, "coeditCompatibilityVersion", value.asInstanceOf[js.Any])
      
      inline def setCoeditCompatibilityVersionUndefined: Self = StObject.set(x, "coeditCompatibilityVersion", js.undefined)
      
      inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCompatibilityVersion(value: Double): Self = StObject.set(x, "compatibilityVersion", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: SketchVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Artboards extends StObject {
    
    var artboards: StringDictionary[NameString]
    
    var name: String
  }
  object Artboards {
    
    inline def apply(artboards: StringDictionary[NameString], name: String): Artboards = {
      val __obj = js.Dynamic.literal(artboards = artboards.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artboards]
    }
    
    extension [Self <: Artboards](x: Self) {
      
      inline def setArtboards(value: StringDictionary[NameString]): Self = StObject.set(x, "artboards", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    var _class: document
    
    var assets: AssetCollection
    
    var colorSpace: ColorSpace
    
    var currentPageIndex: Double
    
    var do_objectID: Uuid
    
    var documentState: js.UndefOr[DocumentState] = js.undefined
    
    var fontReferences: js.UndefOr[js.Array[FontRef]] = js.undefined
    
    var foreignLayerStyles: js.Array[ForeignLayerStyle]
    
    var foreignSwatches: js.UndefOr[js.Array[ForeignSwatch]] = js.undefined
    
    var foreignSymbols: js.Array[ForeignSymbol]
    
    var foreignTextStyles: js.Array[ForeignTextStyle]
    
    var layerStyles: SharedStyleContainer
    
    var layerSymbols: js.UndefOr[SymbolContainer] = js.undefined
    
    var layerTextStyles: SharedTextStyleContainer
    
    var pages: js.Array[Page]
    
    var patchInfo: js.UndefOr[PatchInfo] = js.undefined
    
    var sharedSwatches: js.UndefOr[SwatchContainer] = js.undefined
  }
  object Assets {
    
    inline def apply(
      assets: AssetCollection,
      colorSpace: ColorSpace,
      currentPageIndex: Double,
      do_objectID: Uuid,
      foreignLayerStyles: js.Array[ForeignLayerStyle],
      foreignSymbols: js.Array[ForeignSymbol],
      foreignTextStyles: js.Array[ForeignTextStyle],
      layerStyles: SharedStyleContainer,
      layerTextStyles: SharedTextStyleContainer,
      pages: js.Array[Page]
    ): Assets = {
      val __obj = js.Dynamic.literal(_class = "document", assets = assets.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], currentPageIndex = currentPageIndex.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], foreignLayerStyles = foreignLayerStyles.asInstanceOf[js.Any], foreignSymbols = foreignSymbols.asInstanceOf[js.Any], foreignTextStyles = foreignTextStyles.asInstanceOf[js.Any], layerStyles = layerStyles.asInstanceOf[js.Any], layerTextStyles = layerTextStyles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    extension [Self <: Assets](x: Self) {
      
      inline def setAssets(value: AssetCollection): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setColorSpace(value: ColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageIndex(value: Double): Self = StObject.set(x, "currentPageIndex", value.asInstanceOf[js.Any])
      
      inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
      
      inline def setDocumentState(value: DocumentState): Self = StObject.set(x, "documentState", value.asInstanceOf[js.Any])
      
      inline def setDocumentStateUndefined: Self = StObject.set(x, "documentState", js.undefined)
      
      inline def setFontReferences(value: js.Array[FontRef]): Self = StObject.set(x, "fontReferences", value.asInstanceOf[js.Any])
      
      inline def setFontReferencesUndefined: Self = StObject.set(x, "fontReferences", js.undefined)
      
      inline def setFontReferencesVarargs(value: FontRef*): Self = StObject.set(x, "fontReferences", js.Array(value*))
      
      inline def setForeignLayerStyles(value: js.Array[ForeignLayerStyle]): Self = StObject.set(x, "foreignLayerStyles", value.asInstanceOf[js.Any])
      
      inline def setForeignLayerStylesVarargs(value: ForeignLayerStyle*): Self = StObject.set(x, "foreignLayerStyles", js.Array(value*))
      
      inline def setForeignSwatches(value: js.Array[ForeignSwatch]): Self = StObject.set(x, "foreignSwatches", value.asInstanceOf[js.Any])
      
      inline def setForeignSwatchesUndefined: Self = StObject.set(x, "foreignSwatches", js.undefined)
      
      inline def setForeignSwatchesVarargs(value: ForeignSwatch*): Self = StObject.set(x, "foreignSwatches", js.Array(value*))
      
      inline def setForeignSymbols(value: js.Array[ForeignSymbol]): Self = StObject.set(x, "foreignSymbols", value.asInstanceOf[js.Any])
      
      inline def setForeignSymbolsVarargs(value: ForeignSymbol*): Self = StObject.set(x, "foreignSymbols", js.Array(value*))
      
      inline def setForeignTextStyles(value: js.Array[ForeignTextStyle]): Self = StObject.set(x, "foreignTextStyles", value.asInstanceOf[js.Any])
      
      inline def setForeignTextStylesVarargs(value: ForeignTextStyle*): Self = StObject.set(x, "foreignTextStyles", js.Array(value*))
      
      inline def setLayerStyles(value: SharedStyleContainer): Self = StObject.set(x, "layerStyles", value.asInstanceOf[js.Any])
      
      inline def setLayerSymbols(value: SymbolContainer): Self = StObject.set(x, "layerSymbols", value.asInstanceOf[js.Any])
      
      inline def setLayerSymbolsUndefined: Self = StObject.set(x, "layerSymbols", js.undefined)
      
      inline def setLayerTextStyles(value: SharedTextStyleContainer): Self = StObject.set(x, "layerTextStyles", value.asInstanceOf[js.Any])
      
      inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setPatchInfo(value: PatchInfo): Self = StObject.set(x, "patchInfo", value.asInstanceOf[js.Any])
      
      inline def setPatchInfoUndefined: Self = StObject.set(x, "patchInfo", js.undefined)
      
      inline def setSharedSwatches(value: SwatchContainer): Self = StObject.set(x, "sharedSwatches", value.asInstanceOf[js.Any])
      
      inline def setSharedSwatchesUndefined: Self = StObject.set(x, "sharedSwatches", js.undefined)
      
      inline def set_class(value: document): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var _data: String
  }
  object Data {
    
    inline def apply(_data: String): Data = {
      val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def set_data(value: String): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpandedSymbolPathsInSidebar extends StObject {
    
    var expandedSymbolPathsInSidebar: js.UndefOr[js.Array[Any]] = js.undefined
    
    var expandedTextStylePathsInPopover: js.UndefOr[js.Array[Any]] = js.undefined
    
    var libraryListCollapsed: js.UndefOr[NumericalBool] = js.undefined
    
    var pageListCollapsed: NumericalBool
    
    var pageListHeight: Double
  }
  object ExpandedSymbolPathsInSidebar {
    
    inline def apply(pageListCollapsed: NumericalBool, pageListHeight: Double): ExpandedSymbolPathsInSidebar = {
      val __obj = js.Dynamic.literal(pageListCollapsed = pageListCollapsed.asInstanceOf[js.Any], pageListHeight = pageListHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandedSymbolPathsInSidebar]
    }
    
    extension [Self <: ExpandedSymbolPathsInSidebar](x: Self) {
      
      inline def setExpandedSymbolPathsInSidebar(value: js.Array[Any]): Self = StObject.set(x, "expandedSymbolPathsInSidebar", value.asInstanceOf[js.Any])
      
      inline def setExpandedSymbolPathsInSidebarUndefined: Self = StObject.set(x, "expandedSymbolPathsInSidebar", js.undefined)
      
      inline def setExpandedSymbolPathsInSidebarVarargs(value: Any*): Self = StObject.set(x, "expandedSymbolPathsInSidebar", js.Array(value*))
      
      inline def setExpandedTextStylePathsInPopover(value: js.Array[Any]): Self = StObject.set(x, "expandedTextStylePathsInPopover", value.asInstanceOf[js.Any])
      
      inline def setExpandedTextStylePathsInPopoverUndefined: Self = StObject.set(x, "expandedTextStylePathsInPopover", js.undefined)
      
      inline def setExpandedTextStylePathsInPopoverVarargs(value: Any*): Self = StObject.set(x, "expandedTextStylePathsInPopover", js.Array(value*))
      
      inline def setLibraryListCollapsed(value: NumericalBool): Self = StObject.set(x, "libraryListCollapsed", value.asInstanceOf[js.Any])
      
      inline def setLibraryListCollapsedUndefined: Self = StObject.set(x, "libraryListCollapsed", js.undefined)
      
      inline def setPageListCollapsed(value: NumericalBool): Self = StObject.set(x, "pageListCollapsed", value.asInstanceOf[js.Any])
      
      inline def setPageListHeight(value: Double): Self = StObject.set(x, "pageListHeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kerning extends StObject {
    
    var MSAttributedStringColorAttribute: js.UndefOr[Color] = js.undefined
    
    var MSAttributedStringFontAttribute: FontDescriptor
    
    var kerning: js.UndefOr[Double] = js.undefined
    
    var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
    
    var textStyleVerticalAlignmentKey: js.UndefOr[TextVerticalAlignment] = js.undefined
  }
  object Kerning {
    
    inline def apply(MSAttributedStringFontAttribute: FontDescriptor): Kerning = {
      val __obj = js.Dynamic.literal(MSAttributedStringFontAttribute = MSAttributedStringFontAttribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kerning]
    }
    
    extension [Self <: Kerning](x: Self) {
      
      inline def setKerning(value: Double): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setMSAttributedStringColorAttribute(value: Color): Self = StObject.set(x, "MSAttributedStringColorAttribute", value.asInstanceOf[js.Any])
      
      inline def setMSAttributedStringColorAttributeUndefined: Self = StObject.set(x, "MSAttributedStringColorAttribute", js.undefined)
      
      inline def setMSAttributedStringFontAttribute(value: FontDescriptor): Self = StObject.set(x, "MSAttributedStringFontAttribute", value.asInstanceOf[js.Any])
      
      inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
      
      inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
      
      inline def setTextStyleVerticalAlignmentKey(value: TextVerticalAlignment): Self = StObject.set(x, "textStyleVerticalAlignmentKey", value.asInstanceOf[js.Any])
      
      inline def setTextStyleVerticalAlignmentKeyUndefined: Self = StObject.set(x, "textStyleVerticalAlignmentKey", js.undefined)
    }
  }
  
  trait MSAttributedStringColorAttribute extends StObject {
    
    var MSAttributedStringColorAttribute: js.UndefOr[Color] = js.undefined
    
    var MSAttributedStringFontAttribute: FontDescriptor
    
    var MSAttributedStringTextTransformAttribute: js.UndefOr[TextTransform] = js.undefined
    
    var kerning: js.UndefOr[Double] = js.undefined
    
    var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
    
    var strikethroughStyle: js.UndefOr[StrikethroughStyle] = js.undefined
    
    var textStyleVerticalAlignmentKey: js.UndefOr[TextVerticalAlignment] = js.undefined
    
    var underlineStyle: js.UndefOr[UnderlineStyle] = js.undefined
  }
  object MSAttributedStringColorAttribute {
    
    inline def apply(MSAttributedStringFontAttribute: FontDescriptor): MSAttributedStringColorAttribute = {
      val __obj = js.Dynamic.literal(MSAttributedStringFontAttribute = MSAttributedStringFontAttribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSAttributedStringColorAttribute]
    }
    
    extension [Self <: MSAttributedStringColorAttribute](x: Self) {
      
      inline def setKerning(value: Double): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setMSAttributedStringColorAttribute(value: Color): Self = StObject.set(x, "MSAttributedStringColorAttribute", value.asInstanceOf[js.Any])
      
      inline def setMSAttributedStringColorAttributeUndefined: Self = StObject.set(x, "MSAttributedStringColorAttribute", js.undefined)
      
      inline def setMSAttributedStringFontAttribute(value: FontDescriptor): Self = StObject.set(x, "MSAttributedStringFontAttribute", value.asInstanceOf[js.Any])
      
      inline def setMSAttributedStringTextTransformAttribute(value: TextTransform): Self = StObject.set(x, "MSAttributedStringTextTransformAttribute", value.asInstanceOf[js.Any])
      
      inline def setMSAttributedStringTextTransformAttributeUndefined: Self = StObject.set(x, "MSAttributedStringTextTransformAttribute", js.undefined)
      
      inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
      
      inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
      
      inline def setStrikethroughStyle(value: StrikethroughStyle): Self = StObject.set(x, "strikethroughStyle", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughStyleUndefined: Self = StObject.set(x, "strikethroughStyle", js.undefined)
      
      inline def setTextStyleVerticalAlignmentKey(value: TextVerticalAlignment): Self = StObject.set(x, "textStyleVerticalAlignmentKey", value.asInstanceOf[js.Any])
      
      inline def setTextStyleVerticalAlignmentKeyUndefined: Self = StObject.set(x, "textStyleVerticalAlignmentKey", js.undefined)
      
      inline def setUnderlineStyle(value: UnderlineStyle): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var size: Double
    
    var variation: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object Name {
    
    inline def apply(name: String, size: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setVariation(value: StringDictionary[Double]): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      
      inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
    }
  }
  
  trait NameString extends StObject {
    
    var name: String
  }
  object NameString {
    
    inline def apply(name: String): NameString = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameString]
    }
    
    extension [Self <: NameString](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
