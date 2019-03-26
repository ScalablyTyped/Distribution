package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOListElement extends HTMLElement {
  /** @deprecated */
  var compact: scala.Boolean = js.native
  var reversed: scala.Boolean = js.native
  /**
    * The starting number.
    */
  var start: scala.Double = js.native
  var `type`: java.lang.String = js.native
}

@JSGlobal("HTMLOListElement")
@js.native
class HTMLOListElementCls () extends HTMLOListElement {
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

@JSGlobal("HTMLOListElement")
@js.native
object HTMLOListElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLOListElement]

