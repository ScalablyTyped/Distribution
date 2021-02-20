package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchDocumentData extends StObject {
  
  def addBlankPage(): SketchPage = js.native
  
  def assets(): SketchAssetCollection = js.native
  
  def currentPage(): SketchPage = js.native
  
  def layerStyles(): Unit = js.native
  
  def layerSymbols(): Unit = js.native
  
  def layerTextStyles(): SketchSharedStyleContainer = js.native
  
  def pages(): MSArray[SketchPage] = js.native
  
  def removePageAtIndex(index: Double): Unit = js.native
  
  def setCurrentPage(page: SketchPage): Unit = js.native
  
  def symbolsPageOrCreateIfNecessary(): SketchPage = js.native
}
object SketchDocumentData {
  
  @scala.inline
  def apply(
    addBlankPage: () => SketchPage,
    assets: () => SketchAssetCollection,
    currentPage: () => SketchPage,
    layerStyles: () => Unit,
    layerSymbols: () => Unit,
    layerTextStyles: () => SketchSharedStyleContainer,
    pages: () => MSArray[SketchPage],
    removePageAtIndex: Double => Unit,
    setCurrentPage: SketchPage => Unit,
    symbolsPageOrCreateIfNecessary: () => SketchPage
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(addBlankPage = js.Any.fromFunction0(addBlankPage), assets = js.Any.fromFunction0(assets), currentPage = js.Any.fromFunction0(currentPage), layerStyles = js.Any.fromFunction0(layerStyles), layerSymbols = js.Any.fromFunction0(layerSymbols), layerTextStyles = js.Any.fromFunction0(layerTextStyles), pages = js.Any.fromFunction0(pages), removePageAtIndex = js.Any.fromFunction1(removePageAtIndex), setCurrentPage = js.Any.fromFunction1(setCurrentPage), symbolsPageOrCreateIfNecessary = js.Any.fromFunction0(symbolsPageOrCreateIfNecessary))
    __obj.asInstanceOf[SketchDocumentData]
  }
  
  @scala.inline
  implicit class SketchDocumentDataMutableBuilder[Self <: SketchDocumentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBlankPage(value: () => SketchPage): Self = StObject.set(x, "addBlankPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAssets(value: () => SketchAssetCollection): Self = StObject.set(x, "assets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrentPage(value: () => SketchPage): Self = StObject.set(x, "currentPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLayerStyles(value: () => Unit): Self = StObject.set(x, "layerStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLayerSymbols(value: () => Unit): Self = StObject.set(x, "layerSymbols", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLayerTextStyles(value: () => SketchSharedStyleContainer): Self = StObject.set(x, "layerTextStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPages(value: () => MSArray[SketchPage]): Self = StObject.set(x, "pages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemovePageAtIndex(value: Double => Unit): Self = StObject.set(x, "removePageAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCurrentPage(value: SketchPage => Unit): Self = StObject.set(x, "setCurrentPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSymbolsPageOrCreateIfNecessary(value: () => SketchPage): Self = StObject.set(x, "symbolsPageOrCreateIfNecessary", js.Any.fromFunction0(value))
  }
}
