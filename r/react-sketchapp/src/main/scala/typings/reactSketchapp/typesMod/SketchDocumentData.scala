package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocumentData extends js.Object {
  def addBlankPage(): SketchPage
  def assets(): SketchAssetCollection
  def currentPage(): SketchPage
  def layerStyles(): Unit
  def layerSymbols(): Unit
  def layerTextStyles(): SketchSharedStyleContainer
  def pages(): MSArray[SketchPage]
  def removePageAtIndex(index: Double): Unit
  def setCurrentPage(page: SketchPage): Unit
  def symbolsPageOrCreateIfNecessary(): SketchPage
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
}

