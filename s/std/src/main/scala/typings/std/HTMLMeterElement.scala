package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTML <meter> elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements. */
@js.native
trait HTMLMeterElement extends HTMLElement {
  var high: Double = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  var low: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var optimum: Double = js.native
  var value: Double = js.native
}

@JSGlobal("HTMLMeterElement")
@js.native
class HTMLMeterElementCls () extends HTMLMeterElement {
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

@JSGlobal("HTMLMeterElement")
@js.native
object HTMLMeterElement extends Instantiable0[HTMLMeterElement]

