package typings.skatejs.typesMod

import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "CustomElement")
@js.native
class CustomElement () extends HTMLElement {
  var adoptedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
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
  def attributeChangedCallback(name: String): Unit = js.native
  def attributeChangedCallback(name: String, oldValue: String): Unit = js.native
  def attributeChangedCallback(name: String, oldValue: String, newValue: String): Unit = js.native
  def attributeChangedCallback(name: String, oldValue: Null, newValue: String): Unit = js.native
  def connectedCallback(): Unit = js.native
  def disconnectedCallback(): Unit = js.native
}

/* static members */
@JSImport("skatejs/types", "CustomElement")
@js.native
object CustomElement extends js.Object {
  val observedAttributes: js.Array[String] = js.native
}

