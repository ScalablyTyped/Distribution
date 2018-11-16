package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "WithLifecycle")
@js.native
class WithLifecycle ()
  extends stdLib.HTMLElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
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
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
       * Returns the first preceding sibling that
       * is an element, and null otherwise.
       */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  def connected(): scala.Unit = js.native
  def connecting(): scala.Unit = js.native
  def disconnected(): scala.Unit = js.native
  def disconnecting(): scala.Unit = js.native
}

