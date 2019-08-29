package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDialogElement extends HTMLElement {
  var open: scala.Boolean = js.native
  var returnValue: java.lang.String = js.native
  def close(): Unit = js.native
  def close(returnValue: java.lang.String): Unit = js.native
  def show(): Unit = js.native
  def showModal(): Unit = js.native
}

@JSGlobal("HTMLDialogElement")
@js.native
class HTMLDialogElementCls () extends HTMLDialogElement {
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

@JSGlobal("HTMLDialogElement")
@js.native
object HTMLDialogElement extends Instantiable0[HTMLDialogElement]

