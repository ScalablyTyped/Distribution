package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLProgressElement extends HTMLElement {
  val labels: NodeListOf[HTMLLabelElement] = js.native
  /**
    * Defines the maximum, or "done" value for a progress element.
    */
  var max: scala.Double = js.native
  /**
    * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
    */
  val position: scala.Double = js.native
  /**
    * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
    */
  var value: scala.Double = js.native
}

@JSGlobal("HTMLProgressElement")
@js.native
class HTMLProgressElementCls () extends HTMLProgressElement {
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

@JSGlobal("HTMLProgressElement")
@js.native
object HTMLProgressElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLProgressElement]

