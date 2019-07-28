package typings.reactDashFauxDashDom.reactDashFauxDashDomMod

import typings.react.reactMod.ReactElement
import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", "Element")
@js.native
class Element protected () extends HTMLElement {
  def this(nodeName: String) = this()
  def this(nodeName: String, parentNode: Element) = this()
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
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  def toReact(): ReactElement = js.native
}

