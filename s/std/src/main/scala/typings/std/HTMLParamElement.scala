package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond those of the regular HTMLElement object interface it inherits) for manipulating <param> elements, representing a pair of a key and a value that acts as a parameter for an <object> element. */
@js.native
trait HTMLParamElement extends HTMLElement {
  /**
    * Sets or retrieves the name of an input parameter for an element.
    */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves the content type of the resource designated by the value attribute.
    */
  /** @deprecated */
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the value of an input parameter for an element.
    */
  var value: java.lang.String = js.native
  /**
    * Sets or retrieves the data type of the value attribute.
    */
  /** @deprecated */
  var valueType: java.lang.String = js.native
}

@JSGlobal("HTMLParamElement")
@js.native
class HTMLParamElementCls () extends HTMLParamElement {
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

@JSGlobal("HTMLParamElement")
@js.native
object HTMLParamElement extends Instantiable0[HTMLParamElement]

