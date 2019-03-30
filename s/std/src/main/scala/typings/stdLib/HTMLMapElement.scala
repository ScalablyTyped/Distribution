package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLMapElement interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements. */
@js.native
trait HTMLMapElement extends HTMLElement {
  /**
    * Retrieves a collection of the area objects defined for the given map object.
    */
  val areas: HTMLCollection = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
}

@JSGlobal("HTMLMapElement")
@js.native
class HTMLMapElementCls () extends HTMLMapElement {
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

@JSGlobal("HTMLMapElement")
@js.native
object HTMLMapElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLMapElement]

