package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond those defined on the regular HTMLElement interface it also has available to it by inheritance) for manipulating ordered list elements. */
@js.native
trait HTMLOListElement extends HTMLElement {
  /** @deprecated */
  var compact: scala.Boolean = js.native
  var reversed: scala.Boolean = js.native
  /**
    * The starting number.
    */
  var start: Double = js.native
  var `type`: java.lang.String = js.native
}

@JSGlobal("HTMLOListElement")
@js.native
class HTMLOListElementCls () extends HTMLOListElement {
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

@JSGlobal("HTMLOListElement")
@js.native
object HTMLOListElement extends Instantiable0[HTMLOListElement]

