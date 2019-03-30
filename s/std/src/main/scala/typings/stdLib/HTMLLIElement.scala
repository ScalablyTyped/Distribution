package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLLIElement interface exposes specific properties and methods (beyond those defined by regular HTMLElement interface it also has available to it by inheritance) for manipulating list elements. */
@js.native
trait HTMLLIElement extends HTMLElement {
  /** @deprecated */
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the value of a list item.
    */
  var value: scala.Double = js.native
}

@JSGlobal("HTMLLIElement")
@js.native
class HTMLLIElementCls () extends HTMLLIElement {
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

@JSGlobal("HTMLLIElement")
@js.native
object HTMLLIElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLLIElement]

