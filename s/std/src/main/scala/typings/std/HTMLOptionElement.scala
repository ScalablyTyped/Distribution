package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** <option> elements and inherits all classes and methods of the HTMLElement interface. */
@js.native
trait HTMLOptionElement extends HTMLElement {
  /**
    * Sets or retrieves the status of an option.
    */
  var defaultSelected: scala.Boolean = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | Null = js.native
  /**
    * Sets or retrieves the ordinal position of an option in a list box.
    */
  val index: Double = js.native
  /**
    * Sets or retrieves a value that you can use to implement your own label functionality for the object.
    */
  var label: java.lang.String = js.native
  /**
    * Sets or retrieves whether the option in the list box is the default item.
    */
  var selected: scala.Boolean = js.native
  /**
    * Sets or retrieves the text string specified by the option tag.
    */
  var text: java.lang.String = js.native
  /**
    * Sets or retrieves the value which is returned to the server when the form control is submitted.
    */
  var value: java.lang.String = js.native
}

@JSGlobal("HTMLOptionElement")
@js.native
class HTMLOptionElementCls () extends HTMLOptionElement {
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

@JSGlobal("HTMLOptionElement")
@js.native
object HTMLOptionElement extends Instantiable0[HTMLOptionElement]

