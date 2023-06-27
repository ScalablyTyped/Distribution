package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals) */
@js.native
trait ElementInternals
  extends StObject
     with ARIAMixin {
  
  /**
    * Returns true if internals's target element has no validity problems; false otherwise. Fires an invalid event at the element in the latter case.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/checkValidity)
    */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /**
    * Returns the form owner of internals's target element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/form)
    */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /**
    * Returns a NodeList of all the label elements that internals's target element is associated with.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/labels)
    */
  /* standard dom */
  val labels: NodeList = js.native
  
  /**
    * Returns true if internals's target element has no validity problems; otherwise, returns false, fires an invalid event at the element, and (if the event isn't canceled) reports the problem to the user.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/reportValidity)
    */
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /**
    * Sets both the state and submission value of internals's target element to value.
    *
    * If value is null, the element won't participate in form submission.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
    */
  /* standard dom */
  def setFormValue(): Unit = js.native
  def setFormValue(value: java.lang.String): Unit = js.native
  def setFormValue(value: java.lang.String, state: java.lang.String): Unit = js.native
  def setFormValue(value: java.lang.String, state: File): Unit = js.native
  def setFormValue(value: java.lang.String, state: FormData): Unit = js.native
  def setFormValue(value: Null, state: java.lang.String): Unit = js.native
  def setFormValue(value: Null, state: File): Unit = js.native
  def setFormValue(value: Null, state: FormData): Unit = js.native
  def setFormValue(value: File): Unit = js.native
  def setFormValue(value: File, state: java.lang.String): Unit = js.native
  def setFormValue(value: File, state: File): Unit = js.native
  def setFormValue(value: File, state: FormData): Unit = js.native
  def setFormValue(value: FormData): Unit = js.native
  def setFormValue(value: FormData, state: java.lang.String): Unit = js.native
  def setFormValue(value: FormData, state: File): Unit = js.native
  def setFormValue(value: FormData, state: FormData): Unit = js.native
  
  /**
    * Marks internals's target element as suffering from the constraints indicated by the flags argument, and sets the element's validation message to message. If anchor is specified, the user agent might use it to indicate problems with the constraints of internals's target element when the form owner is validated interactively or reportValidity() is called.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setValidity)
    */
  /* standard dom */
  def setValidity(): Unit = js.native
  def setValidity(flags: Unit, message: java.lang.String): Unit = js.native
  def setValidity(flags: Unit, message: java.lang.String, anchor: HTMLElement): Unit = js.native
  def setValidity(flags: Unit, message: Unit, anchor: HTMLElement): Unit = js.native
  def setValidity(flags: ValidityStateFlags): Unit = js.native
  def setValidity(flags: ValidityStateFlags, message: java.lang.String): Unit = js.native
  def setValidity(flags: ValidityStateFlags, message: java.lang.String, anchor: HTMLElement): Unit = js.native
  def setValidity(flags: ValidityStateFlags, message: Unit, anchor: HTMLElement): Unit = js.native
  
  /**
    * Returns the ShadowRoot for internals's target element, if the target element is a shadow host, or null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/shadowRoot)
    */
  /* standard dom */
  val shadowRoot: ShadowRoot | Null = js.native
  
  /**
    * Returns the error message that would be shown to the user if internals's target element was to be checked for validity.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validationMessage)
    */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /**
    * Returns the ValidityState object for internals's target element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validity)
    */
  /* standard dom */
  val validity: ValidityState = js.native
  
  /**
    * Returns true if internals's target element will be validated when the form is submitted; false otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/willValidate)
    */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
