package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchDocumentData extends js.Object {
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
  implicit class SketchDocumentDataOps[Self <: SketchDocumentData] (val x: Self) extends AnyVal {
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
    def setAddBlankPage(value: () => SketchPage): Self = this.set("addBlankPage", js.Any.fromFunction0(value))
    @scala.inline
    def setAssets(value: () => SketchAssetCollection): Self = this.set("assets", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrentPage(value: () => SketchPage): Self = this.set("currentPage", js.Any.fromFunction0(value))
    @scala.inline
    def setLayerStyles(value: () => Unit): Self = this.set("layerStyles", js.Any.fromFunction0(value))
    @scala.inline
    def setLayerSymbols(value: () => Unit): Self = this.set("layerSymbols", js.Any.fromFunction0(value))
    @scala.inline
    def setLayerTextStyles(value: () => SketchSharedStyleContainer): Self = this.set("layerTextStyles", js.Any.fromFunction0(value))
    @scala.inline
    def setPages(value: () => MSArray[SketchPage]): Self = this.set("pages", js.Any.fromFunction0(value))
    @scala.inline
    def setRemovePageAtIndex(value: Double => Unit): Self = this.set("removePageAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCurrentPage(value: SketchPage => Unit): Self = this.set("setCurrentPage", js.Any.fromFunction1(value))
    @scala.inline
    def setSymbolsPageOrCreateIfNecessary(value: () => SketchPage): Self = this.set("symbolsPageOrCreateIfNecessary", js.Any.fromFunction0(value))
  }
  
}

