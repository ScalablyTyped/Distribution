package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLTitleElement interface contains the title for a document. This element inherits all of the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLTitleElement extends HTMLElement {
  /**
    * Retrieves or sets the text of the object as a string.
    */
  var text: java.lang.String = js.native
}

@JSGlobal("HTMLTitleElement")
@js.native
class HTMLTitleElementCls () extends HTMLTitleElement {
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

@JSGlobal("HTMLTitleElement")
@js.native
object HTMLTitleElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLTitleElement]

