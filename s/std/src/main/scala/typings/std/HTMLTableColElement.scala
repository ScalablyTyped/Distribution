package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond the HTMLElement interface it also has available to it inheritance) for manipulating single or grouped table column elements. */
@js.native
trait HTMLTableColElement extends HTMLElement {
  /**
    * Sets or retrieves the alignment of the object relative to the display or table.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var ch: java.lang.String = js.native
  /** @deprecated */
  var chOff: java.lang.String = js.native
  /**
    * Sets or retrieves the number of columns in the group.
    */
  var span: Double = js.native
  /** @deprecated */
  var vAlign: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  /** @deprecated */
  var width: java.lang.String = js.native
}

@JSGlobal("HTMLTableColElement")
@js.native
class HTMLTableColElementCls () extends HTMLTableColElement {
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

@JSGlobal("HTMLTableColElement")
@js.native
object HTMLTableColElement extends Instantiable0[HTMLTableColElement]

