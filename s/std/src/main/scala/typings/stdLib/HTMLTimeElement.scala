package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLTimeElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <time> elements. */
@js.native
trait HTMLTimeElement extends HTMLElement {
  var dateTime: java.lang.String = js.native
}

@JSGlobal("HTMLTimeElement")
@js.native
class HTMLTimeElementCls () extends HTMLTimeElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLTimeElement")
@js.native
object HTMLTimeElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLTimeElement]

