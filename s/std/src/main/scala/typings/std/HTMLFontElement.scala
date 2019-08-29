package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implements the document object model (DOM) representation of the font element. The HTML Font Element <font> defines the font size, font face and color of text. */
@js.native
trait HTMLFontElement extends HTMLElement {
  /** @deprecated */
  var color: java.lang.String = js.native
  /**
    * Sets or retrieves the current typeface family.
    */
  /** @deprecated */
  var face: java.lang.String = js.native
  /** @deprecated */
  var size: java.lang.String = js.native
}

@JSGlobal("HTMLFontElement")
@js.native
class HTMLFontElementCls () extends HTMLFontElement {
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

@JSGlobal("HTMLFontElement")
@js.native
object HTMLFontElement extends Instantiable0[HTMLFontElement]

