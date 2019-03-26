package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOptGroupElement extends HTMLElement {
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  /**
    * Sets or retrieves a value that you can use to implement your own label functionality for the object.
    */
  var label: java.lang.String = js.native
}

@JSGlobal("HTMLOptGroupElement")
@js.native
class HTMLOptGroupElementCls () extends HTMLOptGroupElement {
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

@JSGlobal("HTMLOptGroupElement")
@js.native
object HTMLOptGroupElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLOptGroupElement]

