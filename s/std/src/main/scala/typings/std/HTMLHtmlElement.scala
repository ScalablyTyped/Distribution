package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Serves as the root node for a given HTML document. This object inherits the properties and methods described in the HTMLElement interface. */
@js.native
trait HTMLHtmlElement extends HTMLElement {
  /**
    * Sets or retrieves the DTD version that governs the current document.
    */
  /** @deprecated */
  var version: java.lang.String = js.native
}

@JSGlobal("HTMLHtmlElement")
@js.native
class HTMLHtmlElementCls () extends HTMLHtmlElement {
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

@JSGlobal("HTMLHtmlElement")
@js.native
object HTMLHtmlElement extends Instantiable0[HTMLHtmlElement]

