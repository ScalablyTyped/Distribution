package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocument extends js.Object {
  def addBlankPage(): SketchPage
  def currentPage(): SketchPage
  def documentData(): SketchDocumentData
  def pages(): js.Array[SketchPage]
}

object SketchDocument {
  @scala.inline
  def apply(
    addBlankPage: () => SketchPage,
    currentPage: () => SketchPage,
    documentData: () => SketchDocumentData,
    pages: () => js.Array[SketchPage]
  ): SketchDocument = {
    val __obj = js.Dynamic.literal(addBlankPage = js.Any.fromFunction0(addBlankPage), currentPage = js.Any.fromFunction0(currentPage), documentData = js.Any.fromFunction0(documentData), pages = js.Any.fromFunction0(pages))
  
    __obj.asInstanceOf[SketchDocument]
  }
}

