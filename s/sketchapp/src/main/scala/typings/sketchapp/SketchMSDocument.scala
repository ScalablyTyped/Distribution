package typings.sketchapp

import typings.sketchapp.sketchappStrings.documentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSDocument extends js.Object {
  
  var _class: documentData = js.native
  
  var assets: SketchMSDocumentAssets = js.native
  
  var colorSpace: Double = js.native
  
  var currentPageIndex: Double = js.native
  
  var do_objectID: String = js.native
  
  var foreignSymbols: js.Array[SketchMSImmutableForeignSymbol] = js.native
  
  var foreignTextStyles: js.Array[_] = js.native
  
  var layerStyles: SketchMSSharedStyleContainer = js.native
  
  var layerSymbols: SketchMSSymbolContainers = js.native
  
  var layerTextStyles: SketchMSSharedTextStyleContainer = js.native
  
  var pages: js.Array[SketchMSPageReference] = js.native
}
object SketchMSDocument {
  
  @scala.inline
  def apply(
    _class: documentData,
    assets: SketchMSDocumentAssets,
    colorSpace: Double,
    currentPageIndex: Double,
    do_objectID: String,
    foreignSymbols: js.Array[SketchMSImmutableForeignSymbol],
    foreignTextStyles: js.Array[_],
    layerStyles: SketchMSSharedStyleContainer,
    layerSymbols: SketchMSSymbolContainers,
    layerTextStyles: SketchMSSharedTextStyleContainer,
    pages: js.Array[SketchMSPageReference]
  ): SketchMSDocument = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], assets = assets.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], currentPageIndex = currentPageIndex.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], foreignSymbols = foreignSymbols.asInstanceOf[js.Any], foreignTextStyles = foreignTextStyles.asInstanceOf[js.Any], layerStyles = layerStyles.asInstanceOf[js.Any], layerSymbols = layerSymbols.asInstanceOf[js.Any], layerTextStyles = layerTextStyles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocument]
  }
  
  @scala.inline
  implicit class SketchMSDocumentOps[Self <: SketchMSDocument] (val x: Self) extends AnyVal {
    
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
    def set_class(value: documentData): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssets(value: SketchMSDocumentAssets): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpace(value: Double): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageIndex(value: Double): Self = this.set("currentPageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDo_objectID(value: String): Self = this.set("do_objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignSymbolsVarargs(value: SketchMSImmutableForeignSymbol*): Self = this.set("foreignSymbols", js.Array(value :_*))
    
    @scala.inline
    def setForeignSymbols(value: js.Array[SketchMSImmutableForeignSymbol]): Self = this.set("foreignSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignTextStylesVarargs(value: js.Any*): Self = this.set("foreignTextStyles", js.Array(value :_*))
    
    @scala.inline
    def setForeignTextStyles(value: js.Array[_]): Self = this.set("foreignTextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerStyles(value: SketchMSSharedStyleContainer): Self = this.set("layerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerSymbols(value: SketchMSSymbolContainers): Self = this.set("layerSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerTextStyles(value: SketchMSSharedTextStyleContainer): Self = this.set("layerTextStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: SketchMSPageReference*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[SketchMSPageReference]): Self = this.set("pages", value.asInstanceOf[js.Any])
  }
}
