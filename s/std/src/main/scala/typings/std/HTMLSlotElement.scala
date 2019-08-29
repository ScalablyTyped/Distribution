package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLSlotElement extends HTMLElement {
  var name: java.lang.String = js.native
  def assignedElements(): js.Array[Element] = js.native
  def assignedElements(options: AssignedNodesOptions): js.Array[Element] = js.native
  def assignedNodes(): js.Array[Node] = js.native
  def assignedNodes(options: AssignedNodesOptions): js.Array[Node] = js.native
}

@JSGlobal("HTMLSlotElement")
@js.native
class HTMLSlotElementCls () extends HTMLSlotElement {
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

@JSGlobal("HTMLSlotElement")
@js.native
object HTMLSlotElement extends Instantiable0[HTMLSlotElement]

