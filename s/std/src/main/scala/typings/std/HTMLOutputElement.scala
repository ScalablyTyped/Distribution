package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements. */
@js.native
trait HTMLOutputElement extends HTMLElement {
  var defaultValue: java.lang.String = js.native
  val form: HTMLFormElement | Null = js.native
  val htmlFor: DOMTokenList = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  var name: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  val validationMessage: java.lang.String = js.native
  val validity: ValidityState = js.native
  var value: java.lang.String = js.native
  val willValidate: scala.Boolean = js.native
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  def setCustomValidity(error: java.lang.String): Unit = js.native
}

@JSGlobal("HTMLOutputElement")
@js.native
class HTMLOutputElementCls () extends HTMLOutputElement {
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

@JSGlobal("HTMLOutputElement")
@js.native
object HTMLOutputElement extends Instantiable0[HTMLOutputElement]

