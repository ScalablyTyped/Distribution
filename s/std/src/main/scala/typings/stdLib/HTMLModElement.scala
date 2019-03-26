package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLModElement extends HTMLElement {
  /**
    * Sets or retrieves reference information about the object.
    */
  var cite: java.lang.String = js.native
  /**
    * Sets or retrieves the date and time of a modification to the object.
    */
  var dateTime: java.lang.String = js.native
}

@JSGlobal("HTMLModElement")
@js.native
class HTMLModElementCls () extends HTMLModElement {
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

@JSGlobal("HTMLModElement")
@js.native
object HTMLModElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLModElement]

