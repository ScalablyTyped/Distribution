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

