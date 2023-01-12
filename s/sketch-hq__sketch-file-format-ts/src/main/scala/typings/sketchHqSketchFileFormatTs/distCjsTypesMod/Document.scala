package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
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
  
  var pages: js.Array[FileRef]
  
  var patchInfo: js.UndefOr[PatchInfo] = js.undefined
  
  var sharedSwatches: js.UndefOr[SwatchContainer] = js.undefined
}
object Document {
  
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
    pages: js.Array[FileRef]
  ): Document = {
    val __obj = js.Dynamic.literal(_class = "document", assets = assets.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], currentPageIndex = currentPageIndex.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], foreignLayerStyles = foreignLayerStyles.asInstanceOf[js.Any], foreignSymbols = foreignSymbols.asInstanceOf[js.Any], foreignTextStyles = foreignTextStyles.asInstanceOf[js.Any], layerStyles = layerStyles.asInstanceOf[js.Any], layerTextStyles = layerTextStyles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
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
    
    inline def setPages(value: js.Array[FileRef]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: FileRef*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setPatchInfo(value: PatchInfo): Self = StObject.set(x, "patchInfo", value.asInstanceOf[js.Any])
    
    inline def setPatchInfoUndefined: Self = StObject.set(x, "patchInfo", js.undefined)
    
    inline def setSharedSwatches(value: SwatchContainer): Self = StObject.set(x, "sharedSwatches", value.asInstanceOf[js.Any])
    
    inline def setSharedSwatchesUndefined: Self = StObject.set(x, "sharedSwatches", js.undefined)
    
    inline def set_class(value: document): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
