package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOrShadowRoot extends js.Object {
  val activeElement: Element | scala.Null
  val fullscreenElement: Element | scala.Null
  val pointerLockElement: Element | scala.Null
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  val styleSheets: StyleSheetList
  def caretPositionFromPoint(x: scala.Double, y: scala.Double): CaretPosition | scala.Null
  /** @deprecated */
  def caretRangeFromPoint(x: scala.Double, y: scala.Double): Range
  def elementFromPoint(x: scala.Double, y: scala.Double): Element | scala.Null
  def elementsFromPoint(x: scala.Double, y: scala.Double): js.Array[Element]
  def getSelection(): Selection | scala.Null
}

object DocumentOrShadowRoot {
  @scala.inline
  def apply(
    caretPositionFromPoint: (scala.Double, scala.Double) => CaretPosition | scala.Null,
    caretRangeFromPoint: (scala.Double, scala.Double) => Range,
    elementFromPoint: (scala.Double, scala.Double) => Element | scala.Null,
    elementsFromPoint: (scala.Double, scala.Double) => js.Array[Element],
    getSelection: () => Selection | scala.Null,
    styleSheets: StyleSheetList,
    activeElement: Element = null,
    fullscreenElement: Element = null,
    pointerLockElement: Element = null
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(caretPositionFromPoint = js.Any.fromFunction2(caretPositionFromPoint), caretRangeFromPoint = js.Any.fromFunction2(caretRangeFromPoint), elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets)
    if (activeElement != null) __obj.updateDynamic("activeElement")(activeElement)
    if (fullscreenElement != null) __obj.updateDynamic("fullscreenElement")(fullscreenElement)
    if (pointerLockElement != null) __obj.updateDynamic("pointerLockElement")(pointerLockElement)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
}

