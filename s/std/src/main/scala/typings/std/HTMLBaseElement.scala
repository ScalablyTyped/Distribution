package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the base URI for a document. This object inherits all of the properties and methods as described in the HTMLElement interface. */
@js.native
trait HTMLBaseElement extends HTMLElement {
  /**
    * Gets or sets the baseline URL on which relative links are based.
    */
  var href: java.lang.String = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
}

@JSGlobal("HTMLBaseElement")
@js.native
class HTMLBaseElementCls () extends HTMLBaseElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLBaseElement")
@js.native
object HTMLBaseElement extends Instantiable0[HTMLBaseElement]

