package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLBRElement extends HTMLElement {
  /**
    * Sets or retrieves the side on which floating objects are not to be positioned when any IHTMLBlockElement is inserted into the document.
    */
  /** @deprecated */
  var clear: java.lang.String = js.native
}

@JSGlobal("HTMLBRElement")
@js.native
class HTMLBRElementCls () extends HTMLBRElement {
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

@JSGlobal("HTMLBRElement")
@js.native
object HTMLBRElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLBRElement]

