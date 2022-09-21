package typings.reactSketchapp.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDocumentData extends StObject {
  
  def addBlankPage(): SketchPage
  
  def assets(): SketchAssetCollection
  
  def currentPage(): SketchPage
  
  def delegate(): SketchDocument
  
  def layerStyles(): Unit
  
  def layerSymbols(): Unit
  
  def layerTextStyles(): SketchSharedStyleContainer
  
  def pages(): MSArray[SketchPage]
  
  def removePageAtIndex(index: Double): Unit
  
  def setCurrentPage(page: SketchPage): Unit
  
  def symbolMap(): StringDictionary[SketchLayer]
  
  def symbolsPageOrCreateIfNecessary(): SketchPage
}
object SketchDocumentData {
  
  inline def apply(
    addBlankPage: () => SketchPage,
    assets: () => SketchAssetCollection,
    currentPage: () => SketchPage,
    delegate: () => SketchDocument,
    layerStyles: () => Unit,
    layerSymbols: () => Unit,
    layerTextStyles: () => SketchSharedStyleContainer,
    pages: () => MSArray[SketchPage],
    removePageAtIndex: Double => Unit,
    setCurrentPage: SketchPage => Unit,
    symbolMap: () => StringDictionary[SketchLayer],
    symbolsPageOrCreateIfNecessary: () => SketchPage
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(addBlankPage = js.Any.fromFunction0(addBlankPage), assets = js.Any.fromFunction0(assets), currentPage = js.Any.fromFunction0(currentPage), delegate = js.Any.fromFunction0(delegate), layerStyles = js.Any.fromFunction0(layerStyles), layerSymbols = js.Any.fromFunction0(layerSymbols), layerTextStyles = js.Any.fromFunction0(layerTextStyles), pages = js.Any.fromFunction0(pages), removePageAtIndex = js.Any.fromFunction1(removePageAtIndex), setCurrentPage = js.Any.fromFunction1(setCurrentPage), symbolMap = js.Any.fromFunction0(symbolMap), symbolsPageOrCreateIfNecessary = js.Any.fromFunction0(symbolsPageOrCreateIfNecessary))
    __obj.asInstanceOf[SketchDocumentData]
  }
  
  extension [Self <: SketchDocumentData](x: Self) {
    
    inline def setAddBlankPage(value: () => SketchPage): Self = StObject.set(x, "addBlankPage", js.Any.fromFunction0(value))
    
    inline def setAssets(value: () => SketchAssetCollection): Self = StObject.set(x, "assets", js.Any.fromFunction0(value))
    
    inline def setCurrentPage(value: () => SketchPage): Self = StObject.set(x, "currentPage", js.Any.fromFunction0(value))
    
    inline def setDelegate(value: () => SketchDocument): Self = StObject.set(x, "delegate", js.Any.fromFunction0(value))
    
    inline def setLayerStyles(value: () => Unit): Self = StObject.set(x, "layerStyles", js.Any.fromFunction0(value))
    
    inline def setLayerSymbols(value: () => Unit): Self = StObject.set(x, "layerSymbols", js.Any.fromFunction0(value))
    
    inline def setLayerTextStyles(value: () => SketchSharedStyleContainer): Self = StObject.set(x, "layerTextStyles", js.Any.fromFunction0(value))
    
    inline def setPages(value: () => MSArray[SketchPage]): Self = StObject.set(x, "pages", js.Any.fromFunction0(value))
    
    inline def setRemovePageAtIndex(value: Double => Unit): Self = StObject.set(x, "removePageAtIndex", js.Any.fromFunction1(value))
    
    inline def setSetCurrentPage(value: SketchPage => Unit): Self = StObject.set(x, "setCurrentPage", js.Any.fromFunction1(value))
    
    inline def setSymbolMap(value: () => StringDictionary[SketchLayer]): Self = StObject.set(x, "symbolMap", js.Any.fromFunction0(value))
    
    inline def setSymbolsPageOrCreateIfNecessary(value: () => SketchPage): Self = StObject.set(x, "symbolsPageOrCreateIfNecessary", js.Any.fromFunction0(value))
  }
}
