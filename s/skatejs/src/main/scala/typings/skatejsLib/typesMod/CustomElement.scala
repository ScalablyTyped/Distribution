package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "CustomElement")
@js.native
class CustomElement ()
  extends stdLib.HTMLElement {
  var adoptedCallback: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  def attributeChangedCallback(name: java.lang.String): scala.Unit = js.native
  def attributeChangedCallback(name: java.lang.String, oldValue: java.lang.String): scala.Unit = js.native
  def attributeChangedCallback(name: java.lang.String, oldValue: java.lang.String, newValue: java.lang.String): scala.Unit = js.native
  def attributeChangedCallback(name: java.lang.String, oldValue: scala.Null, newValue: java.lang.String): scala.Unit = js.native
  def connectedCallback(): scala.Unit = js.native
  def disconnectedCallback(): scala.Unit = js.native
}

/* static members */
@JSImport("skatejs/types", "CustomElement")
@js.native
object CustomElement extends js.Object {
  val observedAttributes: js.Array[java.lang.String] = js.native
}

