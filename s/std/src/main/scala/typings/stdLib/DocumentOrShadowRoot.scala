package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOrShadowRoot extends js.Object {
  val activeElement: Element | scala.Null
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
    caretPositionFromPoint: js.Function2[scala.Double, scala.Double, CaretPosition | scala.Null],
    caretRangeFromPoint: js.Function2[scala.Double, scala.Double, Range],
    elementFromPoint: js.Function2[scala.Double, scala.Double, Element | scala.Null],
    elementsFromPoint: js.Function2[scala.Double, scala.Double, js.Array[Element]],
    getSelection: js.Function0[Selection | scala.Null],
    styleSheets: StyleSheetList,
    activeElement: Element = null
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caretPositionFromPoint")(caretPositionFromPoint)
    __obj.updateDynamic("caretRangeFromPoint")(caretRangeFromPoint)
    __obj.updateDynamic("elementFromPoint")(elementFromPoint)
    __obj.updateDynamic("elementsFromPoint")(elementsFromPoint)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("styleSheets")(styleSheets)
    if (activeElement != null) __obj.updateDynamic("activeElement")(activeElement)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
}

