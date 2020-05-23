package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOrShadowRoot extends js.Object {
  val activeElement: Element | Null
  /**
    * Returns document's fullscreen element.
    */
  val fullscreenElement: Element | Null
  val pointerLockElement: Element | Null
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: StyleSheetList
  def caretPositionFromPoint(x: Double, y: Double): CaretPosition | Null
  /** @deprecated */
  def caretRangeFromPoint(x: Double, y: Double): Range
  def elementFromPoint(x: Double, y: Double): Element | Null
  def elementsFromPoint(x: Double, y: Double): js.Array[Element]
  def getSelection(): Selection | Null
}

object DocumentOrShadowRoot {
  @scala.inline
  def apply(
    caretPositionFromPoint: (Double, Double) => CaretPosition | Null,
    caretRangeFromPoint: (Double, Double) => Range,
    elementFromPoint: (Double, Double) => Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[Element],
    getSelection: () => Selection | Null,
    styleSheets: StyleSheetList,
    activeElement: Element = null,
    fullscreenElement: Element = null,
    pointerLockElement: Element = null
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any], activeElement = activeElement.asInstanceOf[js.Any], fullscreenElement = fullscreenElement.asInstanceOf[js.Any], pointerLockElement = pointerLockElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
}

