package typings
package reactDashFauxDashDomLib.reactDashFauxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", "Element")
@js.native
class Element protected ()
  extends stdLib.HTMLElement {
  def this(nodeName: java.lang.String) = this()
  def this(nodeName: java.lang.String, parentNode: Element) = this()
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
  def toReact(): reactLib.reactMod.ReactElement = js.native
}

